package tn.csf.stock.repository;

import org.springframework.data.repository.CrudRepository;

import tn.csf.stock.model.Category;


//repository that extends CrudRepository  

public interface CategoryRepository extends CrudRepository<Category, Integer>  
{  
}  
