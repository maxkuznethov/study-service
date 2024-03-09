package ru.mirea.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.server.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}
