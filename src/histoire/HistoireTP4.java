package histoire;

import personnage.Commercant;
import personnage.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof;
		prof = new Humain("Prof", "kombucha", 54);
		prof.direBonjour();
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("un kimono", 50);
		Commercant marco;
		marco = new Commercant("Marco", "thé", 1265);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
	}

}
