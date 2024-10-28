package sig.org;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import sig.org.dao.ProduitRepository;
import sig.org.entity.Produit;



@SpringBootApplication
public class CatalogueServiceApplication implements CommandLineRunner {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Autowired
	private RepositoryRestConfiguration restConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(CatalogueServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		restConfiguration.exposeIdsFor(Produit.class);
		produitRepository.save(new Produit(null,"Ordinateur Lx 45",6500,3));
		produitRepository.save(new Produit(null,"Imprimante Hp 4500",65900,13));
		produitRepository.save(new Produit(null,"Tondeuse Mx 98",65800,30));
		
		produitRepository.findAll().forEach(p->{
			System.out.println(p.toString());
		});
	}

}
