package api.course.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import api.course.model.Course;
import api.course.service.CourseService;

@Component
public class CourseServiceImpl implements CourseService {

	@Override
	public List<Course> getAllCourses() {
		List<Course> courses = new ArrayList<>(Arrays.asList(
			new Course("1", "Java", "Java Description")
		));
		
		
		return courses;
	}
}
