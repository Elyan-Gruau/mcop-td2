// Université Côte d'Azur - DS4H - MIAGE
// Méthodologie Conception Objet et Programmation
// TD2
// Leo Donati - 2023 

package fr.unica.miage.l3;

public class TestAbonnement {


	public static void main(String[] args) {
		Editeur leMonde = new Editeur("Le Monde", new Lecteur("Michel"));
		
		Lecteur leo = new Lecteur("Leo");
		Lecteur marc = new Lecteur("Marc");
		
		leMonde.addAbonne(leo);
		leMonde.addAbonne(marc);
		
		leMonde.newJournal("12 février 2023");
		
		leMonde.addAbonne(new Lecteur("Emma"));
		leMonde.newJournal("13 février 2023");


		// Question : comment faire en sorte que le rédacteur en chef du journal reçoive automatiquement le journal lui aussi (et en premier) ?
		// ANS : Il faut rajouter une variable en plus dans l'éditeur, qui pointe sur le rédacteur en chef. TODO LE RAJOUTER

	}

}
