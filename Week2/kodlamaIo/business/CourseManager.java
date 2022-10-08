package kodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.CourseDao;
import kodlamaIo.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	
	
	public CourseManager(CourseDao courseDao, Logger[] loggers) {
		this.courseDao=courseDao;
		this.loggers=loggers;
	
	}
	
	List<Course> courses=new ArrayList<Course>();
	
	public void add(Course newCourse) throws Exception {
		
		if(newCourse.getPrice()<0) {
			throw new Exception("Kurs fiyatı 0 dan küçük olamaz!");
		}
		
		for (Course course : courses) {
			if (course.getName()==newCourse.getName()) {
				throw new Exception("Aynı isimde başka bir kurs bulunmaktadır!");// hata fırlatıldığında program durur.
			}
		}
		courses.add(newCourse);
		courseDao.add(newCourse);
		for (Logger logger : loggers) {
			logger.log(newCourse.getName());
		}
		System.out.println("------------------------------------------------------------------------");
		
		
		
	}

}
