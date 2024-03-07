// Université Côte d'Azur - DS4H - MIAGE
// Méthodologie Conception Objet et Programmation
// TD2
// Leo Donati - 2024

package fr.unica.miage.l3;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestJFrame {

	public static void main(String[] args) {
		
		// création d’une fenêtre
		JFrame f = new JFrame("TD2 - exo2");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// création d’un panel (FlowLayout) comme contenu
		JPanel p = new JPanel();
		
		// un écouteur pour tous
		MonEcouteurDAction ecouteur = new MonEcouteurDAction(f);
		
		// un menu déroulant
		JComboBox j = new JComboBox();
		j.addItem("Bonjour      ");
		j.addItem("Au revoir");
		j.setActionCommand("vous avez choisi une option du menu déroulant");
		j.addActionListener(ecouteur);	
		
		// un bouton
		JButton b = new JButton("Click here");
		b.setActionCommand("vous avez cliqué sur un bouton");
		b.addActionListener(ecouteur);

	// un autre écouteur pour le bouton
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				b.removeActionListener(ecouteur);
				b.setText("merci d'avoir cliqué");
			}
		});

		b.addActionListener( e -> {
			int num = j.getItemCount();
			j.addItem("Option "+num);
		});
		
		// on ajoute le tout dans la fenêtre qui devient visible
		p.add(b);
		p.add(j);
		f.setContentPane(p);
		f.pack();
		f.setVisible(true);
	}

}
