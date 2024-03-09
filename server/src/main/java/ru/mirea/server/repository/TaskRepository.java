package ru.mirea.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.server.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
