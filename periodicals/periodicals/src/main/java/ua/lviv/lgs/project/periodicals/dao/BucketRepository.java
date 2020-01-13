package ua.lviv.lgs.project.periodicals.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.project.periodicals.domain.Bucket;

public interface BucketRepository extends JpaRepository<Bucket, Integer> {

}
