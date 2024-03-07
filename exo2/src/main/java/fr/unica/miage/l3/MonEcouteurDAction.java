// Université Côte d'Azur - DS4H - MIAGE
// Méthodologie Conception Objet et Programmation
// TD2
// Leo Donati - 2024

package fr.unica.miage.l3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MonEcouteurDAction implements ActionListener {
	// un fenêtre nécessaire pour la popup de dialogue
	private JFrame parent ;
	
	// le constructeur
	public MonEcouteurDAction(JFrame fen)
	{
		parent = fen;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (parent == null) {
			System.out.println("Action sur "+e.getSource()+" "+e.getActionCommand());
		} else {
			JOptionPane.showMessageDialog(parent, e.getActionCommand(), "Action",
			JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
