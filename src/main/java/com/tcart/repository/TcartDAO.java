package com.tcart.repository;

import com.tcart.models.ChatEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;
import javax.transaction.Transactional;

@Transactional
@Repository
public interface TcartDAO extends JpaRepository<ChatEntry, Id> {

}
