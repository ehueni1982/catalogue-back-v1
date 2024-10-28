package sig.org.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import sig.org.dao.ProduitRepository;
import sig.org.entity.Produit;
@CrossOrigin("*")
@RestController
public class ProduitRestController {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@GetMapping(value="/listproduits")
	public List<Produit> listProduits(){
		return produitRepository.findAll();
		
	}
	
	@GetMapping(value="/listproduits/{id}")
	public Optional<Produit> listProduits(@PathVariable(name="id") Long id){
		return produitRepository.findById(id);
		
	}
	
	@PutMapping(value="/listproduits/{id}")
	public Produit updateProduit(@PathVariable(name="id") Long id, @RequestBody Produit p){
		p.setId(id);
		return produitRepository.save(p);
		
	}
		
	@PostMapping(value="/listproduits")
	public Produit CreateProduit(@RequestBody Produit p){
		return produitRepository.save(p);
		
	}
		
	@DeleteMapping(value="/listproduits/{id}")
	public void deleteProduit(@PathVariable(name="id") Long id){
		
		produitRepository.deleteById(id);		
	}
	

}
