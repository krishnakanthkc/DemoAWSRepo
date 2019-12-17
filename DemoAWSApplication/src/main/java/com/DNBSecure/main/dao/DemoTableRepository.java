package com.DNBSecure.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DNBSecure.main.entity.DemoTable;

public interface DemoTableRepository extends JpaRepository<DemoTable,Integer>{

}
