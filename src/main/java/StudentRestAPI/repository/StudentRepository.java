package StudentRestAPI.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import StudentRestAPI.entity.Student;

public interface StudentRepository extends
                                       JpaRepository<Student , Long> {

}
