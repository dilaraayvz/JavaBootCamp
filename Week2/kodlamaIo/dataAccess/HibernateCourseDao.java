package kodlamaIo.dataAccess;

import kodlamaIo.entities.Course;

public class HibernateCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println(course.getName()+" kursu Hibernite ile veritabanına eklendi.");
	}

	

}
