package com.retail.repository;

import org.springframework.data.repository.Repository;

import com.retail.db.models.Users;

public interface UserRepository extends Repository<Users,Long>{
	Users findOneById(Long id);
}
