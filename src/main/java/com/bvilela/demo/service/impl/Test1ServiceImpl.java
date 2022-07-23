package com.bvilela.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bvilela.demo.entity.Test1;
import com.bvilela.demo.repository.Test1Repository;
import com.bvilela.demo.service.Test1Service;

@Service
public class Test1ServiceImpl implements Test1Service {
	
	private Test1Repository repository;
	
	@Autowired
	public Test1ServiceImpl(Test1Repository repository) {
		this.repository = repository;
	}

	@Override
	public List<Test1> getAllItens() {
		return repository.findAll();
	}

}
