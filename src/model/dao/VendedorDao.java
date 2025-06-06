package model.dao;

import java.util.List;

import model.entitidades.Departamento;
import model.entitidades.Vendedor;

public interface VendedorDao {

	void insert(Vendedor obj);
	void update(Vendedor obj);
	void deleteById(Integer id);
	Vendedor findById(Integer id);
	List<Vendedor> findAll();
	List<Vendedor> findByDepartment(Departamento departamento);
}