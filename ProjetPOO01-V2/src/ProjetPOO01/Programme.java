package ProjetPOO01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import ProjetPOO01.GestionPersonnes.Client;
import ProjetPOO01.GestionPersonnes.Fournisseur;
import ProjetPOO01.GestionPersonnes.Patron;
import ProjetPOO01.GestionPersonnes.Salarie;
import achat.Achat;
import projetPOOException.ExceptionSaisie;

public class Programme {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static List<Salarie> ListSalarie = new ArrayList<Salarie>();
	public static List<Client> ListClient = new ArrayList<Client>();
	public static List<Fournisseur> ListFournisseur = new ArrayList<Fournisseur>();
	public static List<Achat> ListAchat = new ArrayList<Achat>();
	public static Patron patron;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub;
		Programme.menu();
		/*List<Salarie> ListSalarie = Programme.SaisirSalarie();
		List<Client> ListClient = Programme.SaisirClient();
		List<Fournisseur> ListFournisseur = Programme.SaisirFournisseur();
		Patron Patron = Programme.SaisirPatron();
		List<Achat> ListAchat = Programme.saisirAchat();
		
		System.out.println(ListSalarie);
		System.out.println(ListClient);
		System.out.println(ListFournisseur);
		System.out.println(Patron);
		System.out.println(ListAchat);*/
	}
	
	public static void menu() {
		String choix;
		
		do {
			System.out.println("Saisir un nombre parmis ces choix :");
			System.out.println("\t 1 - Saisie des salariés");
			System.out.println("\t 2 - Saisie des clients");
			System.out.println("\t 3 - Saisie des fournisseurs");
			System.out.println("\t 4 - Saisie des Patrons");
			System.out.println("\t 5 - Saisie des Achats");
			System.out.println("\t 6 - Afficher les listes saisies");
			System.out.println("\t 7 - exit");
			choix = sc.nextLine();
			
			switch(choix.charAt(0)) {
			
				case '1' : Programme.SaisirSalarie();break;
				case '2' : Programme.SaisirClient(); break;
				case '3' : Programme.SaisirFournisseur(); break;
				case '4' : Programme.SaisirPatron(); break;
				case '5' : Programme.saisirAchat(); break;
				case '6' :  System.out.println(ListSalarie);
		           System.out.println(ListClient);
		           System.out.println(ListFournisseur);
		           System.out.println(patron);
		           System.out.println(ListAchat); break;
				case '7' : return;	
			}
		}
		while(true);
	}
	
	public static List<Salarie> SaisirSalarie() {
		
		//List<Salarie> ListSalarie = new ArrayList<Salarie>();
			
		System.out.println("Veuillez saisir le nom de Salarie :");
		String nom = sc.nextLine();
		System.out.println("Veuillez saisir le prénom de Salarie  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Salarie  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la ville de Salarie  :");
		String ville = sc.nextLine();
		
		System.out.println("Veuillez saisir le code postal de Salarie :");
		
		String codepostale = sc.nextLine();
		try {
			Salarie.ctrlCodePostale(codepostale);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
			     
		System.out.println("Veuillez saisir le némuro de sécurité sociale de Salarie :");
		
		String numsecurite = sc.nextLine();
		try {
			Salarie.ctrlNumSecu(numsecurite);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
				
		System.out.println("Veuillez saisir le Salaire :");
		
		double salaire = sc.nextDouble();
		sc.nextLine();
		
		Salarie Sal1 = new Salarie(nom, prenom, adresse,ville, codepostale, numsecurite, salaire);
		
		ListSalarie.add(Sal1);
		
		return ListSalarie;
		
		}

	public static List<Client> SaisirClient() {
		
		 //List<Client> ListClient = new ArrayList<Client>();

		System.out.println("Veuillez saisir le nom de Client :");
		String nom = sc.nextLine();
		System.out.println("Veuillez saisir le prénom de Client  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Client  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la Ville de Client  :");
		String ville = sc.nextLine();
		System.out.println("Veuillez saisir le code postal de Client :");
		String codepostale = sc.nextLine();
		try {
			Salarie.ctrlCodePostale(codepostale);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Veuillez saisir le numéro de Client :");
		String numClient = sc.nextLine();
		
		Client cl1 = new Client(nom, prenom, adresse,ville, codepostale,numClient);
		
		ListClient.add(cl1);
		 
		return ListClient;	
	}
	
	public static List<Fournisseur> SaisirFournisseur() {
		
		//List<Fournisseur> ListFournisseur = new ArrayList<Fournisseur>();
		
		System.out.println("Veuillez saisir le nom de Fournisseur :");
		String nom =sc.nextLine();
		System.out.println("Veuillez saisir le prénom de Fournisseur  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Fournisseur  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la Ville de Fournisseur  :");
		String ville = sc.nextLine();
		System.out.println("Veuillez saisir le code postal de Fournisseur :");
		String codepostale = sc.nextLine();
		try {
			Salarie.ctrlCodePostale(codepostale);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Veuillez saisir le numéro de Fournisseur :");
		String numfr = sc.nextLine();
		
		Fournisseur fr = new Fournisseur(nom, prenom, adresse,ville, codepostale,numfr);
		
		ListFournisseur.add(fr);
		
		return ListFournisseur;
	}
	
	public static void SaisirPatron() {
		
		System.out.println("Veuillez saisir le nom de Patron :");
		String nom = sc.nextLine();
		System.out.println("Veuillez saisir le prénom de Patron  :");
		String prenom = sc.nextLine();
		System.out.println("Veuillez saisir l'adresse de Patron  :");
		String adresse = sc.nextLine();
		System.out.println("Veuillez saisir la Ville de Patron  :");
		String ville = sc.nextLine();
		System.out.println("Veuillez saisir le code postal de Patron :");
		String codepostale = sc.nextLine();
		try {
			Salarie.ctrlCodePostale(codepostale);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("Veuillez saisir le némuro de sécurité sociale de Patron :");
		String numsecurite = sc.nextLine();
		try {
			Salarie.ctrlNumSecu(numsecurite);
		} catch (ExceptionSaisie e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
        System.out.println("Veuillez saisir le Salaire de patron:");
		double salaire = sc.nextDouble();
		sc.nextLine();
		
		patron = new Patron(nom, prenom, adresse, ville, codepostale, numsecurite, salaire);
		
	}
	
	public static List<Achat> saisirAchat() {
		
		//List<Achat> ListAchat = new ArrayList<Achat>();
		
		System.out.println("Veuillez saisir la date d'achat \"dd/MM/yyyy\"");
		String date = sc.nextLine();
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy") ;
        Date dt = null;
		try {
			dt = sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
		System.out.println("Veuillez saisir l'intitulé d'achat:");
		String intitule = sc.nextLine();
		
		System.out.println("Veuillez saisir la quantité d'achat:");
	    int qte = sc.nextInt();
	    sc.nextLine();
		
		Achat a = new Achat(dt, intitule, qte);
		
		ListAchat.add(a);
	    
		return ListAchat;
		
	}

}
