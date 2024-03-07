// Université Côte d'Azur - DS4H - MIAGE
// Méthodologie Conception Objet et Programmation
// TD2
// Leo Donati - 2023 

package fr.unica.miage.l3;

public class TestAbbonement {


	public static void main(String[] args) {
		Editeur leMonde = new Editeur("Le Monde");
		
		Lecteur leo = new Lecteur("Leo");
		Lecteur marc = new Lecteur("Marc");
		
		leMonde.addAbonne(leo);
		leMonde.addAbonne(marc);
		
		leMonde.newJournal("12 février 2023");
		
		leMonde.addAbonne(new Lecteur("Emma"));
		leMonde.newJournal("13 février 2023");
	}

}
