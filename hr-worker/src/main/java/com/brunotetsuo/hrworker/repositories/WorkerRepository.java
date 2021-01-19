package com.brunotetsuo.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brunotetsuo.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
