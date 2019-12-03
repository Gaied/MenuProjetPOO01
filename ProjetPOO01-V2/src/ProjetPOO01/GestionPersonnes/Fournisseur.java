package ProjetPOO01.GestionPersonnes;

import java.util.List;

import achat.Achat;

public class Fournisseur extends Personne implements IClient, IFournisseur {

	private static final long serialVersionUID = 1L;
	public String numFournisseur;

	public Fournisseur(String nom, String prenom, String adresse, String ville, String codepostal,
			String numFournisseur) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numFournisseur = numFournisseur;
	}

	public String getNumFournisseur() {
		return numFournisseur;
	}

	public void setNumFournisseur(String numFournisseur) {
		this.numFournisseur = numFournisseur;
	}

	@Override
	public String toString() {
		return "Fournisseur []" +super.toString();
	}

	@Override
	public void livre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commande() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void achete(List<Achat> ListAchat) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean paie() {
		// TODO Auto-generated method stub
		System.out.println("Paiement effectué par le fournisseur");
		return false;
	}

	@Override
	public boolean estClient() {
		// TODO Auto-generated method stub
	//if ()
		return false;
	}


}
