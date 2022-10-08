package kodlamaIo.business;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.InstructorDao;
import kodlamaIo.entities.Instructor;

public class InstructorManager {

	InstructorDao instructorDao;
	Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
		System.out.println("------------------------------------------------------------------------");
	}
	
}
