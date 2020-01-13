package ua.lviv.lgs.project.periodicals.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.project.periodicals.domain.Periodical;

public interface PeriodicalRepository extends JpaRepository<Periodical, Integer> {

}
