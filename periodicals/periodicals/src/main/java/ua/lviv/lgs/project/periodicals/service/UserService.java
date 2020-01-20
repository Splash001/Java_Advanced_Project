package ua.lviv.lgs.project.periodicals.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;

import ua.lviv.lgs.project.periodicals.dao.UserRepository;
import ua.lviv.lgs.project.periodicals.domain.User;
import ua.lviv.lgs.project.periodicals.domain.UserRole;

public class UserService {
	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;

	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setPassword(bCryptPasswordEncoder.encode(user.getPasswordConfirm()));
		user.setRole(UserRole.USER);
		userRepository.save(user);
	}
}
