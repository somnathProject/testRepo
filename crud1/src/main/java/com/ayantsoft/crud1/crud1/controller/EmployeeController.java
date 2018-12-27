package com.ayantsoft.crud1.crud1.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ayantsoft.crud1.crud1.exception.ResourceNotFoundException;
import com.ayantsoft.crud1.crud1.pojo.Emp;
import com.ayantsoft.crud1.crud1.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public List<Emp> getAllEmps() {
		System.out.println("=====");
		return employeeRepository.findAll();

	}

	@GetMapping("/Emps/{id}")
	public ResponseEntity<Emp> getEmpById(@PathVariable(value = "id") Integer EmpId)
			throws ResourceNotFoundException {
		Emp Emp = employeeRepository.findById(EmpId)
				.orElseThrow(() -> new ResourceNotFoundException("Emp not found for this id :: " + EmpId));
		return ResponseEntity.ok().body(Emp);
	}

	@PostMapping("/Emps")
	public Emp createEmp(@Valid @RequestBody Emp Emp) {
		return employeeRepository.save(Emp);
	}

	@PutMapping("/Emps/{id}")
	public ResponseEntity<Emp> updateEmp(@PathVariable(value = "id") Integer EmpId,
			@Valid @RequestBody Emp EmpDetails) throws ResourceNotFoundException {
		Emp Emp = employeeRepository.findById(EmpId)
				.orElseThrow(() -> new ResourceNotFoundException("Emp not found for this id :: " + EmpId));

		/*Emp.setEmailId(EmpDetails.getEmailId());

		Emp.setLastName(EmpDetails.getLastName());

		Emp.setFirstName(EmpDetails.getFirstName());
		 */
		final Emp updatedEmp = employeeRepository.save(Emp);
		return ResponseEntity.ok(updatedEmp);
	}

	@DeleteMapping("/Emps/{id}")
	public Map<String, Boolean> deleteEmp(@PathVariable(value = "id") Integer EmpId)
			throws ResourceNotFoundException {
		Emp Emp = employeeRepository.findById(EmpId)
				.orElseThrow(() -> new ResourceNotFoundException("Emp not found for this id :: " + EmpId));
		employeeRepository.delete(Emp);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
}
