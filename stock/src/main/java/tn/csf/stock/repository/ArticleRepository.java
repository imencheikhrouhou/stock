package tn.csf.stock.repository;
import org.springframework.data.repository.CrudRepository;

import tn.csf.stock.model.Article;




//repository that extends CrudRepository  

public interface ArticleRepository extends CrudRepository<Article, Integer>  
{  
}  