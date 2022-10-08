package kodlamaIo.dataAccess;

import kodlamaIo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" eğitmeni Hibernite ile vertabanına eklendi.");
	}

}
