package business;


import java.util.ArrayList;
import java.util.List;

import dataAccess.CourseDao;
import entities.Course;
import logging.Logger;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private List<String> courses = new ArrayList<>();

	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao = courseDao;
		this.loggers = loggers;

	}

	public void add(Course course) throws Exception {
		if (course.getPrice() <= 0) {
			throw new Exception("�cret �ok d���k");
		} else {
			if (courses.size() == 0) {
				courses.add(course.getName());
				courseDao.add(course);
				for (Logger logger : loggers) {
					logger.log(course.getName());
				}

			} else {
				for (String string : courses) {
					if (string.equals(course.getName())) {
						throw new Exception("Bu isimde kurs bulunmaktad�r.");
					} else {
						courses.add(course.getName());
						courseDao.add(course);
						for (Logger logger : loggers) {
							logger.log(course.getName());
						}
					}

				}
			}

		}
	}
}