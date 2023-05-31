package kh.com.wa.data.jpa.repository;

import kh.com.wa.data.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReppository extends JpaRepository<User, Integer> {
}
