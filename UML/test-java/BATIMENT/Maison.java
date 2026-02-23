package BATIMENT;

import java.util.*;
import GESTION.*;

public class Maison extends Batiment {

	protected ArrayList<Etudiant> listeEtudiants;
	private String nomDetaille;
	protected int nbChambre;
	private String nationnalite;
	private String directeur;
	private String localisation;

	public String getNom() {
		// TODO - implement Maison.getNom
		throw new UnsupportedOperationException();
	}

	public int getNbChambre() {
		return this.nbChambre;
	}

	public String getNationnalite() {
		return this.nationnalite;
	}

	public String getDirecteur() {
		return this.directeur;
	}

	public String getLocalisation() {
		return this.localisation;
	}

	public void afficherEtudiants() {
		// TODO - implement Maison.afficherEtudiants
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param etudiant
	 */
	public void ajouterEtudiant(Etudiant etudiant) {
		// TODO - implement Maison.ajouterEtudiant
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param etudiant
	 */
	public void supprimerEtudiant(Etudiant etudiant) {
		// TODO - implement Maison.supprimerEtudiant
		throw new UnsupportedOperationException();
	}

	public boolean verificationPlace() {
		// TODO - implement Maison.verificationPlace
		throw new UnsupportedOperationException();
	}

}