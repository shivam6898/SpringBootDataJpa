package com.app.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import com.app.model.Product;
import com.app.repository.ProductRepository;

@Service
public class FindByRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		//productRepository.save(new  Product("BB", "BMW", 4.6));
		
		/*
		 * Optional<Product> product=productRepository.findById(1);
		 * if(product.isPresent()){ System.out.println(product); }else {
		 * System.out.println("no data present"); }
		 */
		
		/*
		 * List<Product> findedProdByCode=productRepository.findByProdCode("AA"); for
		 * (Product product2 : findedProdByCode) { System.out.println(product2); }
		 */
		/*
		 * List<Product> findedProdByCode =productRepository.findByProdCodeLike("AA");
		 * for (Product product : findedProdByCode) { System.out.println(product);
		 * 
		 * }
		 */
		/*
		 * Collection<Double> list=new LinkedList<Double>(); list.add(3.6);
		 * list.add(5.6); List<Product>
		 * listsprod=productRepository.findByProdCostIn(list); for (Product product :
		 * listsprod) { System.out.println(product); }
		 */
		
		/*
		 * List<Product> prodlist=productRepository.findByProdIdOrProdCost(5, 10.0); for
		 * (Product product : prodlist) { System.out.println(product); }
		 */
		
		List<Product> getAllProductByCodeandCost=productRepository.getAllProducts("BB", 10.0);
	for (Product product : getAllProductByCodeandCost) {
		System.out.println(product);
	}
		
	}

}
