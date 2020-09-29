package com.app.repository;

import java.util.Collection;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	//select * from prodtab where prod_code=prod_code
	List<Product> findByProdCode(String code);

	//select * from prodtab where prod_code like prodCode
	List<Product> findByProdCodeLike (String pc);

	//select * from prodtab where prod_cost in (cost)
	List<Product> findByProdCostIn(Collection<Double> costs);

	//select * from prodTab where pid=? Or pcost=?
	List<Product> findByProdIdOrProdCost(Integer pid, Double cost);

	//select * from product where ven_code=?
	//or prodCost>?
	@Query("select p from Product p where p.prodCode=:a or p.prodCost>:b")
	List<Product> getAllProducts(String a, Double b);
	
	//update Product
	@Modifying //non-select operation
	@Transactional //service Layer
	@Query("update Product p set p.prodCode=:a, p.prodCost=:c where p.prodId=:b")
	void updateMyData(String a, Double c, Integer b);
}


