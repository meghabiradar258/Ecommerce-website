package com.ecommerce.ecom.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecom.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
//	List<User> findByUsername(String username);
//	
//	List<User> findByPass(String pass);
	
	List<User> findByUsernameAndPass(String username, String pass);
	
//	@Query(value="select * from user ud where ud.username=?1 and ud.pass=?2", nativeQuery=true)
//	List<User> findUsers(String username, String pass);
}
