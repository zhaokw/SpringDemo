package dao;

import java.sql.SQLException;

//an interface to unify all different implementation of operations for the database
public interface StudentDao {
	
	public Student[] fetchId(String id) throws Exception;//Get a set of STudent whose IDs contains the input id

	public void insert(String name, String grade) throws Exception;//insert a new student into my local DB
	
}
