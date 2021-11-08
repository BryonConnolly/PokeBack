package com.revature.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.models.Trainer;
import com.revature.repos.TrainerRepo;

@Service
public class TrainerService {
	
	private TrainerRepo trainerRepo;

	@Autowired
	public TrainerService(TrainerRepo trainerRepo) {
		super();
		this.trainerRepo = trainerRepo;
	}
	
	public List<Trainer> findAllTrainer(){
		return trainerRepo.findAll();
	}
	public Optional<Trainer> findTrainerById(int id){
		return trainerRepo.findById(id);
	}
	
	@Transactional
	public void addTrainer(Trainer trainer) {
		trainerRepo.save(trainer);
	}

}
