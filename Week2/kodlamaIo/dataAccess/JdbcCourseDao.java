package kodlamaIo.dataAccess;

import kodlamaIo.entities.Course;

public class JdbcCourseDao implements CourseDao {

	@Override
	public void add(Course course) {
		System.out.println(course.getName()+" kursu Jdbc ile veritabanına eklendi.");
	}

}
