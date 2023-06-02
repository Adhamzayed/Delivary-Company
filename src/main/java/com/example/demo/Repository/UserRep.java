package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Users;
@Repository
public interface UserRep extends CrudRepository<Users,Long>{

}
