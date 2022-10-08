package kodlamaIo.dataAccess;

import kodlamaIo.entities.Category;
public class HibernateCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println(category.getName()+" kategorisi Hibernate ile veritabanına eklendi.");
	}

}
