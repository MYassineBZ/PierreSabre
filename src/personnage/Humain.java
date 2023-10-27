package personnage;

public class Humain {
	private String nom;

	private String boisson;

	protected int argent;

	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void direBonjour() {
		parler("Bonjour, je m'appelle " + nom + " j'aime boire du " + boisson);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
	}

	public void parler(String texte) {
		System.out.println(nom + ": " + "« " + texte + "»");
	}

	public void acheter(String bien, int prix) {
		if (prix > argent) {
			parler("J'ai " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");
		} else {
			parler("J'ai " + argent + " sous en poche. je vais pouvoire m'offrir " + bien + " à " + prix + " sous");
			argent -= prix;
		}
	}

	public int gagnerArgent(int gain) {
		if (gain < 0) {
			return argent;
		}
		argent += gain;
		return argent;
	}

	public int perdreArgent(int perte) {
		if (perte > argent) {
			argent = 0;
		} else if (perte < 0) {
			return argent;
		} else {
			argent -= perte;
		}
		return argent;
	}

	public static void main(String[] args) {
	}
}