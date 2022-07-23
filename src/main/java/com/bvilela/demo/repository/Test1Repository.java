package com.bvilela.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bvilela.demo.entity.Test1;

@Repository
public interface Test1Repository extends JpaRepository<Test1, Long> {

}
