package Saisir;

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
import projetPOOException.ExceptionNumUnique;

public class Saisir {
	
	public static Scanner sc = new Scanner(System.in);
	public static List<Salarie> ListSalarie = new ArrayList<Salarie>();
	public static List<Client> ListClient = new ArrayList<Client>();
	public static List<Fournisseur> ListFournisseur = new ArrayList<Fournisseur>();
	public static List<Achat> ListAchat = new ArrayList<Achat>();
	public static Patron patron ;
	
public static List<Salarie> SaisirSalarie() {
		
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
				
		System.out.println("Veuillez saisir le Salaire en format xx,xxx :");
		
		double salaire = sc.nextDouble();
		sc.nextLine();
		
		Salarie Sal1 = new Salarie(nom, prenom, adresse,ville, codepostale, numsecurite, salaire);
		
		ListSalarie.add(Sal1);
		
		ListSalarie.forEach(System.out::println);
		
		return ListSalarie;
		
		}

	public static List<Client> SaisirClient() {

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
		
		for(Client clt: ListClient) {
			
			while(clt.getNumClient().equals(numClient)) {
				System.out.println("le numéro de client existe déja!");
				numClient=sc.nextLine();
			}
			
		}
		
		Client cl1 = new Client(nom, prenom, adresse,ville, codepostale,numClient);
		
		ListClient.add(cl1);
		
		ListClient.forEach(System.out::println);
		 
		return ListClient;	
	}
	
	public static List<Fournisseur> SaisirFournisseur() {
		
		
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
		
		int numFournisseur = 0;
		boolean numunique = true;
		while(numunique) {
			try{
				System.out.println("Veuillez saisir le numéro unique de Fournisseur :");
				numFournisseur =sc.nextInt();
				Fournisseur.CtrlNumUniqueFournisseur(numFournisseur, ListFournisseur);
				numunique=false;
				
			}catch(ExceptionNumUnique e) {
				System.out.println(e.getMessage());
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			sc.nextLine();
		}
		
		Fournisseur fr = new Fournisseur(nom, prenom, adresse,ville, codepostale, numFournisseur );
		
		ListFournisseur.add(fr);
		
		ListFournisseur.forEach(System.out::println);
		
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
        System.out.println("Veuillez saisir le Salaire de patron en format xx,xxx :");
		double salaire = sc.nextDouble();
		sc.nextLine();
		
		patron = new Patron(nom, prenom, adresse, ville, codepostale, numsecurite, salaire);
		
	}
	
	public static List<Achat> saisirAchat() {
		
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
		
		ListAchat.forEach(System.out::println);
	    
		return ListAchat;
		
	}
	
	public static void AfficheAll() {
		
		ListSalarie.forEach(System.out::println);
		ListClient.forEach(System.out::println);
		System.out.println(patron);
		ListFournisseur.forEach(System.out::println);
		ListAchat.forEach(System.out::println);
		
	}
	
}
