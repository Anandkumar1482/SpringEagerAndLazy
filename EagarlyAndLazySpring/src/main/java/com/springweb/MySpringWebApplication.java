package com.springweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springweb.student.Student;

@SpringBootApplication
public class MySpringWebApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(MySpringWebApplication.class, args);

		Student stu = (Student) context.getBean("student");
		stu.show();

		Student stu1 = (Student) context.getBean("student");
		stu1.show();

	}

}
