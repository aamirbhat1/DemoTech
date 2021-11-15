package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Channel;

@Repository
public interface MyRepository extends JpaRepository<Channel, Integer>{

}
