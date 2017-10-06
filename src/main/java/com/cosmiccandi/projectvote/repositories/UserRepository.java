package com.cosmiccandi.projectvote.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cosmiccandi.projectvote.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
