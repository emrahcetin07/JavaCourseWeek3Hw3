package dataAccess;

import entities.Instructor;

public class HibernateIntructorDao implements IntructorDao {

	@Override
	public void add(Instructor intructor) {
		System.out.println("Hibernate ile veri tabanına eklendi" + intructor.getName());
	}

}
