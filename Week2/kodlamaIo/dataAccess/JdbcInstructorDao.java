package kodlamaIo.dataAccess;

import kodlamaIo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" eğitmeni Jdbc ile veritabaına eklendi.");
	}

}
