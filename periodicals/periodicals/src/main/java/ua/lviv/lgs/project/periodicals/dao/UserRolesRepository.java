package ua.lviv.lgs.project.periodicals.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.lgs.project.periodicals.domain.UserRole;

@Repository
public interface UserRolesRepository extends CrudRepository<UserRole, Integer>{
	
	@Query("select a.role from UserRole a, user b where b.userName=? and a.userId=b.userId")
	public List<String> findRolesByUserName(String username);
	
}
