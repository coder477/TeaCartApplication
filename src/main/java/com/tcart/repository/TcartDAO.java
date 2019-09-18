package com.tcart.repository;

import javax.persistence.Id;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tcart.models.ChatEntry;


@Transactional
@Repository
public interface TcartDAO extends JpaRepository<ChatEntry, Id> {
	
	

}
