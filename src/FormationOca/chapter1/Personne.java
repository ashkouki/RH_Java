package FormationOca.chapter1;

public class Personne {


	String nom;
	int age;
	double moyenne;

	public Personne(String nom) {

		System.out.println("constructeur par deafut nom");
		this.nom = nom;
	}

	public Personne(String nom, int age, double moy) {
		System.out.println("constructeur par deafut nom");
		this.nom = nom;
		this.age = age;
		this.moyenne = moy;
	}

	public Personne() {
		System.out.println("constructeur par deafut ");
	}

	public void info() {
		System.out.println("test1");

	}

}
