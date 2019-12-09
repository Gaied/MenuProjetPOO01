package Menu;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import Saisir.Saisir;

public class Menus {
	
	public static Scanner sc =null;
	public static int choixmenu;
	private static String choix = null;

	public static void quitter() {
		System.out.println("Au revoir");
		System.exit(0);
	}
		
	public static void Menu() {
		Map<String, IExecute> im1 = new HashMap<String,IExecute>();

		im1.put("1 - Saisie des salariés",Saisir::SaisirSalarie);
		im1.put("2 - Saisie des clients",Saisir::SaisirClient);
		im1.put("3 - Saisie des fournisseurs",Saisir::SaisirFournisseur);
		im1.put("4 - Saisie un Patron", Saisir::SaisirPatron);
		im1.put("5 - Saisie des Achats", Saisir::saisirAchat);
		im1.put("6 - Afficher les listes saisies", Saisir::AfficheAll);
		im1.put("7 - Quitter",Menus::quitter);
		
		im1.keySet().stream().sorted().forEach(System.out::println);
		
		while(true) {
		
		choix = sc.next();
		
		im1.entrySet().stream().filter(e->e.getKey().charAt(0) == choix.charAt(0)).
		forEach(e->e.getValue().apply());
					
		}
		
		
	}

}
