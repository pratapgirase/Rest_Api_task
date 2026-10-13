package StudentRestAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import StudentRestAPI.entity.Student;
import StudentRestAPI.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentContoller {
	
	
	private StudentService service;

	public StudentContoller(StudentService service) {
		super();
		this.service = service;
	}
	@PostMapping("/add")
	public ResponseEntity <Student> add(@RequestBody Student student)
	{
		
	Student created = service.added(student);
	
	return ResponseEntity
			.status(HttpStatus.CREATED)
			.body(created);
		
	}
	

}
