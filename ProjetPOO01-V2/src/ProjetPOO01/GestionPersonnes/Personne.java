package ProjetPOO01.GestionPersonnes;

import java.io.Serializable;

import projetPOOException.ExceptionSaisie;

public class Personne implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private String codepostal;
	
	public Personne(String nom, String prenom, String adresse, String ville, String codepostal) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.ville = ville;
		this.codepostal = codepostal;
	}
	
	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", adresse=" + adresse + ", ville=" + ville
				+ ", codepostal=" + codepostal + "]";
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getCodepostal() {
		return codepostal;
	}
	public void setCodepostal(String codepostal) {
		this.codepostal = codepostal;
	}
	public static void ctrlCodePostale (String cp) throws ExceptionSaisie {
		
		   if (cp.length()!=5) {
			   
			  throw  new ExceptionSaisie ("Le nombre de caractère est différent de 5.");	
			}
		   try {
			   Integer.parseInt(cp);
			
		} catch (Exception e) {
			// TODO: handle exception
			 throw  new ExceptionSaisie ("Il faut saisir uniquement des chiffres");	
		}
			}
	public static void ctrlNumSecu (String nums) throws ExceptionSaisie {
		
		   if (nums.length()!=13) {
			   
			  throw  new ExceptionSaisie ("Le nombre de caractère est différent de 13.");	
			}
		   try {
			   Integer.parseInt(nums);
			
		} catch (Exception e) {
			// TODO: handle exception
			 throw  new ExceptionSaisie ("Il faut saisir uniquement des chiffres");
		}
			}

	
	
}
