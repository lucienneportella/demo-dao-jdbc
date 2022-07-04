package model.dao;

import java.util.List;

import model.entities.Seller;

public interface SellerDao {
	
	void insert(Seller obj); //operação responsável por inserir no banco de dados o obj
	void update(Seller objt);
	void deleteById(Integer id);
	Seller findById(Integer id);
	List<Seller> findAll();


}
