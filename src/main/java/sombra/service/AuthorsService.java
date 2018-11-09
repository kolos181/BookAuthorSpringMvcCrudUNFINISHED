package sombra.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sombra.entity.Authors;

@Repository
public interface AuthorsService extends JpaRepository<Authors, Long> {
}
