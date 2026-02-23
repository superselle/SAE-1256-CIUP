package BATIMENT;

import CIUP.*;
import GESTION.*;

public abstract class Batiment extends CiteInternationale {

	public abstract String getNationnalite();

	public abstract String getDirecteur();

	public abstract String getLocalisation();

	public abstract void afficherEtudiants();

	/**
	 * 
	 * @param etudiant
	 */
	public abstract void ajouterEtudiant(Etudiant etudiant);

	/**
	 * 
	 * @param etudiant
	 */
	public abstract void supprimerEtudiant(Etudiant etudiant);

	public abstract boolean verificationPlace();

}