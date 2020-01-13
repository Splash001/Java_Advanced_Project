package ua.lviv.lgs.project.periodicals.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.project.periodicals.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByEmail(String email);

}
