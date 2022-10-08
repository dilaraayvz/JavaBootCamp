package kodlamaIo;

import kodlamaIo.business.CategoryManager;
import kodlamaIo.business.CourseManager;
import kodlamaIo.business.InstructorManager;
import kodlamaIo.core.logging.DatabaseLogger;
import kodlamaIo.core.logging.FileLogger;
import kodlamaIo.core.logging.Logger;
import kodlamaIo.core.logging.MailLogger;
import kodlamaIo.dataAccess.HibernateCategoryDao;
import kodlamaIo.dataAccess.HibernateCourseDao;
import kodlamaIo.dataAccess.InstructorDao;
import kodlamaIo.dataAccess.JdbcCategoryDao;
import kodlamaIo.dataAccess.JdbcCourseDao;
import kodlamaIo.dataAccess.JdbcInstructorDao;
import kodlamaIo.entities.Category;
import kodlamaIo.entities.Course;
import kodlamaIo.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception {
		Course course1=new Course(1,"Java Bootcamp", 100);
		Course course2=new Course(1,"C#", 100);
		//HibernateCourseDao hibernateCourseDao=new HibernateCourseDao();
		Logger[] loggers=new Logger[] {new DatabaseLogger(),new  FileLogger(),new  MailLogger()};
		CourseManager courseManager=new CourseManager(new HibernateCourseDao(), loggers);
		courseManager.add(course1);
		courseManager.add(course2);
		
		Category category1=new Category(1,"Yazılım");
		CategoryManager categoryManager=new CategoryManager(new JdbcCategoryDao(), loggers);
		categoryManager.add(category1);
		
		Instructor instructor1=new Instructor(1, "Engin Demiroğ");
		InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(), loggers);
		instructorManager.add(instructor1);
	}

}

