package ru.mirea.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.server.model.Mark;

@Repository
public interface MarkRepository extends JpaRepository<Mark, Long> {
}
