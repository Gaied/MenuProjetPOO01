package ProjetPOO01.GestionPersonnes;

import java.util.List;

import achat.Achat;

public class Salarie extends Personne implements IClient {
	
	private static final long serialVersionUID = 1L;
	public String numsecurite;
	public double salaire;

	public Salarie(String nom, String prenom, String adresse, String ville, String codepostal, String numsecurite,
			double salaire) {
		super(nom, prenom, adresse, ville, codepostal);
		this.numsecurite = numsecurite;
		this.salaire = salaire;
	}
	
	public String getNumsecurite() {
		return numsecurite;
	}

	public void setNumsecurite(String numsecurite) {
		this.numsecurite = numsecurite;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public boolean paie() {
		// TODO Auto-generated method stub
		System.out.println("Paiement effectué par le salarie");
		return false;
	}

	@Override
	public void achete(List<Achat> ListAchat) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String toString() {
		return "Salarie []" +super.toString()+"[numsecurite="+this.numsecurite + "numsecurite="+this.salaire +"]";
	}

	@Override
	public boolean estClient() {
		// TODO Auto-generated method stub
		return false;
	}


}
