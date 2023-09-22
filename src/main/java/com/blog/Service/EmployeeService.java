package com.blog.Service;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.blog.pojo.Employee;

@Service
public class EmployeeService {
	
	public Employee create() {
		Employee e = new Employee();
		Date day = new Date(1995,03,21);
		e.setId("1");
		e.setGender("男");
		e.setAge(28);
		e.setIntersting("跳舞");
		e.setBirth(day);
		return e;
	}

}
