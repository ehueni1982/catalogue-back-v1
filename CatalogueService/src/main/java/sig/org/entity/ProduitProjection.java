package sig.org.entity;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="P1",types=Produit.class)
public interface ProduitProjection {
	
	public double getPrice();
	//public String getDesignation();

}
