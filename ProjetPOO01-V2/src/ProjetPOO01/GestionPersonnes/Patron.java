package ProjetPOO01.GestionPersonnes;

public class Patron extends Salarie implements IPatron {

	private static final long serialVersionUID = 1L;

	public Patron(String nom, String prenom, String adresse, String ville, String codepostal, String numsecurite,
			double salaire) {
		super(nom, prenom, adresse, ville, codepostal, numsecurite, salaire);
		// TODO Auto-generated constructor stub
		this.salaire= salaire;
	}
	
	@Override
	public String getNumsecurite() {
		// TODO Auto-generated method stub
		return super.getNumsecurite();
	}

	@Override
	public void setNumsecurite(String numsecurite) {
		// TODO Auto-generated method stub
		super.setNumsecurite(numsecurite);
	}

	@Override
	public double getSalaire() {
		// TODO Auto-generated method stub
		return super.getSalaire();
	}

	@Override
	public void setSalaire(double salaire) {
		// TODO Auto-generated method stub
		super.setSalaire(salaire);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+"[salaire="+this.salaire+"]";
	}

	@Override
	public boolean paie() {
		return super.paie();
	}

	@Override
	public void embauche() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paiesalarie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void licencie() {
		// TODO Auto-generated method stub
		
	}

}
