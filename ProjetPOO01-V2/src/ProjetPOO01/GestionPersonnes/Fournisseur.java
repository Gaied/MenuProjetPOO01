package ProjetPOO01.GestionPersonnes;

import java.util.List;
import achat.Achat;
import commande.Commande;
import projetPOOException.ExceptionNumUnique;

public class Fournisseur extends Personne implements IClient, IFournisseur {

	private static final long serialVersionUID = 1L;
	public int numFournisseur;

	public Fournisseur(String nom, String prenom, String adresse, String ville, String codepostal,
			int numFournisseur) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numFournisseur = numFournisseur;
	}

	public int getNumFournisseur() {
		return numFournisseur;
	}

	public void setNumFournisseur(int numFournisseur) {
		this.numFournisseur = numFournisseur;
	}

	@Override
	public String toString() {
		return "Fournisseur []" +super.toString()+"[numFournisseur="+this.numFournisseur+"]";
	}

	@Override
	public void livre() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commande(List<Commande> c) {
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
	
	public static void CtrlNumUniqueFournisseur(int in, List<Fournisseur> listFournisseur) throws ExceptionNumUnique{
		
		try {
			 
					
		}catch(Exception e) {
			throw new ExceptionNumUnique("Le numero saisi n'est pas un entier");
		}
		for(Fournisseur lsf:listFournisseur) 
		{
			if(in!=lsf.getNumFournisseur()) {
				
			}else {
				throw new ExceptionNumUnique("Le numero unique est déja utilisé");
				
			}
		}
		
	}

	@Override
	public boolean estClient() {
		// TODO Auto-generated method stub
	//if ()
		return false;
	}


}
