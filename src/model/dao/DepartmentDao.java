package model.dao;

import model.entities.Department;
import java.util.List;

public interface DepartmentDao {
	
	void insert(Department obj); //operação responsável por inserir no banco de dados o obj
	void update(Department objt);
	void deleteById(Integer id);
	Department findById(Integer id);
	List<Department> findAll();

}
