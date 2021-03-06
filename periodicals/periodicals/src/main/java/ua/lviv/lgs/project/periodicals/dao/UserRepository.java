package ua.lviv.lgs.project.periodicals.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.project.periodicals.domain.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	Optional<User> findByEmail(String email);

}
