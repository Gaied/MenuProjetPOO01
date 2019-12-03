package commande;

public class Commande {
	
	public String produit;
    public String prix;
    
	public Commande(String produit, String prix) {
		this.produit = produit;
		this.prix = prix;
	}
	
	public String getProduit() {
		return produit;
	}
	public void setProduit(String produit) {
		this.produit = produit;
	}
	public String getPrix() {
		return prix;
	}
	public void setPrix(String prix) {
		this.prix = prix;
	}
    
}
