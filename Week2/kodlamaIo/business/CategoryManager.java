package kodlamaIo.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaIo.core.logging.Logger;
import kodlamaIo.dataAccess.CategoryDao;
import kodlamaIo.entities.Category;

public class CategoryManager {

	CategoryDao categoryDao;
	Logger[] loggers;

	public CategoryManager(CategoryDao categoryDao, Logger[] loggers) {
		this.categoryDao = categoryDao;
		this.loggers = loggers;
	}

	List<Category> categories = new ArrayList<Category>();

	public void add(Category newCategory) throws Exception {

		for (Category category : categories) {
			if (category.getName() == newCategory.getName()) {
				throw new Exception("Bu kurs adıyla başka bir kurs bulunmaktadır!");
			}
		}
		categories.add(newCategory);
		categoryDao.add(newCategory);
		for (Logger logger : loggers) {
			logger.log(newCategory.getName());
		}
		System.out.println("------------------------------------------------------------------------");

	}

}
