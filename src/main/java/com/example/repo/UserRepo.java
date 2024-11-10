package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {
//
//	@Query(value="SELECT * FROM user_table WHERE email=:email AND password=:password",nativeQuery=true)
//	List<User>findByEmailAndPassword(String email,String password);

}
