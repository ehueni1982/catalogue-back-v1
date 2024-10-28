package sig.org.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import sig.org.entity.Produit;

@RepositoryRestResource
@CrossOrigin("*")
public interface ProduitRepository extends JpaRepository<Produit, Long> {

	//Rechercher un produit
	@RestResource(path = "/byDesignation")
	public List<Produit>findByDesignationContains(@Param("mc") String designation);
	
	
	//Rechercher un produit et pagination
	@RestResource(path = "/byDesignationPage")
	public Page<Produit>findByDesignationContains(@Param("mc") String designation, Pageable pageable);
		
		
		
}

