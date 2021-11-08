package com.revature.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revature.models.Trainer;
import com.revature.services.TrainerService;
@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class TrainerController {

	private TrainerService trainerservice;
	@Autowired
	public TrainerController(TrainerService trainerservice) {
		super();
		this.trainerservice=trainerservice;
	}
	
	@GetMapping("/trainer")
	public List<Trainer> getAllTrainer(){
		return trainerservice.findAllTrainer();
	}
	@GetMapping("/trainer/{id}")
	public Trainer getTrainerById(@PathVariable("id") int id){
		return trainerservice.findTrainerById(id).get();
	}
	
	@PostMapping("/trainer")
	public void addTrainer(@RequestBody Trainer trainer) {
		 trainerservice.addTrainer(trainer);
	}

}
