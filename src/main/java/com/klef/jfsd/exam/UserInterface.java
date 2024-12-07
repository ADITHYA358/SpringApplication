package com.klef.jfsd.exam;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInterface extends JpaRepository<User, String> {
	public User findByEmail(String email);
}
