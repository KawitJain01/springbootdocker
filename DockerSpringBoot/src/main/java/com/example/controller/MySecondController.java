package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.repo.MyEntity;
import com.example.boot.repo.MyRepo;

@RestController
public class MySecondController implements CommandLineRunner {

	@Autowired private MyRepo mRepo;
	
	@GetMapping("/mt")
	public List<MyEntity> get()
	{
		return mRepo.findAll();
	}

	@Override
	public void run(String... args) throws Exception {
		MyEntity ent = new MyEntity();
		
		ent.setName("Kavit");
		
		mRepo.save(ent);
		
        ent = new MyEntity();
		
		ent.setName("Amit");
		
		mRepo.save(ent);
	}
	
	
}
