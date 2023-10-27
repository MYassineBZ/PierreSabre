package personnage;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;

	public Yakuza(String nom, String boisson, int argent, String clan) {
		super(nom, boisson, argent);
		this.clan = clan;
	}

	public void extroquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime + " , si tu tiens à la vie donne moi ta bourse !");
		victime.seFaireExtorquer();
		parler("J’ai piqué les" + victime.argent + "sous de Marco, ce qui me fait 45 sous dans ma poche. Hi ! Hi !");
		reputation += 1;
		argent += victime.argent;
	}

}
