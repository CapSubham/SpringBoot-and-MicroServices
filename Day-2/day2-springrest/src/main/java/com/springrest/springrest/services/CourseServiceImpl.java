package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;

@Service
public class CourseServiceImpl implements CourseService {

	// List<Course> list;

	@Autowired
	private CourseDao courseDao;

	public CourseServiceImpl() {

		/*
		 * list = new ArrayList<>(); list.add(new Course(145l, "JAVA Core",
		 * "This course contains basic of Java.")); list.add(new Course(146l, "Spring",
		 * "This course contains basic of spring.")); list.add(new Course(147l,
		 * "Spring boot", "This course contains basic of springboot."));
		 */
	}

	@Override
	public List<Course> getCourses() {
		return courseDao.findAll();
	}

	@Override
	public Course getCourse(long courseId) {
		/*
		 * Course c = null; for (Course course : list) { if (course.getId() == courseId)
		 * { c = course; break; } }
		 */
		return courseDao.getOne(courseId);
	}

	@Override
	public Course addCourse(Course course) {
		// list.add(course);
		courseDao.save(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		/*
		 * list.forEach(e -> { if (e.getId() == course.getId()) {
		 * e.setTitel(course.getTitel()); e.setDescription(course.getDescription()); }
		 * });
		 */

		courseDao.save(course);
		return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		/*
		 * list = this.list.stream() .filter(e -> e.getId() != parseLong)
		 * .collect(Collectors.toList());
		 */

		Course entity = courseDao.getOne(parseLong);
		courseDao.delete(entity);

	}

}
