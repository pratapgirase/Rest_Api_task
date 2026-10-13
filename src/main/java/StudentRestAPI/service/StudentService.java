package StudentRestAPI.service;

import org.springframework.stereotype.Service;

import StudentRestAPI.entity.Student;
import StudentRestAPI.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository repository;
	
	

	public StudentService(StudentRepository repository) {
		super();
		this.repository = repository;
	}



	public Student added(Student student) {
		
		Student stu = repository.save(student);
		
		      
		return stu;
	}

}
