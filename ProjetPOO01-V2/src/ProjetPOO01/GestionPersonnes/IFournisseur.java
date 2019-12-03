package ProjetPOO01.GestionPersonnes;

import java.util.List;

import achat.Achat;

public interface IFournisseur {
	
	public void livre();
	public void commande();
	public void  achete(List<Achat> ListAchat);

}
