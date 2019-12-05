package ProjetPOO01.GestionPersonnes;

import java.util.List;
import achat.Achat;
import commande.Commande;

public interface IFournisseur {
	
	public void livre();
	public void commande(List<Commande> c);
	public void achete(List<Achat> ListAchat);

}
