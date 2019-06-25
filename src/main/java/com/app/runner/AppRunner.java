package com.app.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.EmpRepo;
import com.app.model.Employeeboot;
@Component
public class AppRunner implements CommandLineRunner {
	@Autowired
	private EmpRepo repo;


	@Override
	public void run(String... args) throws Exception {
		System.out.println("hi");
		Employeeboot e=new Employeeboot(101, "gopal");
		Employeeboot e1=new Employeeboot(102, "pravin");
		Employeeboot e2=new Employeeboot(103, "sai");
		Employeeboot e3=new Employeeboot(104, "datta");
		repo.save(e);
		repo.save(e1);
		repo.save(e2);
		repo.save(e3);
		//repo.deleteById(101);
		//repo.delete(e);
	//long l=repo.count();
		//System.out.println(l);
		//System.out.println(repo.existsById(101));
		//List<Employeeboot> list=repo.findAll();
		/*
		 * for (Employeeboot employeeboot : list) { System.out.println(employeeboot); }
		 */
		Optional<Employeeboot>f=repo.findById(1011);
		System.out.println(f);
		
		
		
	}

	

}
