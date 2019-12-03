package ProjetPOO01.GestionPersonnes;

import java.util.List;

import achat.Achat;

public interface IClient {
	
	public void  achete(List<Achat> ListAchat);
	public boolean paie();
	public boolean estClient();
	
}
