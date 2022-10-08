package kodlamaIo.dataAccess;

import kodlamaIo.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getName()+" kategorisi Jdbc ile veritabanına eklendi.");
	}

}
