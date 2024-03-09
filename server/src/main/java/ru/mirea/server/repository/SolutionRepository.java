package ru.mirea.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.server.model.Solution;

@Repository
public interface SolutionRepository extends JpaRepository<Solution, Long> {
}
