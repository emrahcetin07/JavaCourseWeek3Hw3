package dataAccess;

import entities.Category;

public class JdbcCategoryDao implements CategoryDao {

	@Override
	public void add(Category category) {
		System.out.println("JDBC ile veri taban�na eklendi" + category.getName());
	}

}
