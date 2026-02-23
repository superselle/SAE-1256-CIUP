package SERVICE;

import CIUP.*;
import java.util.*;

public class Restaurant {

	private CiteInternationale saCite;
	ArrayList<Menu> sesMenus;
	private String date;
	private String nom;

	public String getDate() {
		return this.date;
	}

	/**
	 * 
	 * @param plat
	 */
	public void ajouterMenu(Menu plat) {
		// TODO - implement Restaurant.ajouterMenu
		throw new UnsupportedOperationException();
	}

	public void afficherMenu() {
		// TODO - implement Restaurant.afficherMenu
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param critere
	 */
	public void filtrerMenu(String critere) {
		// TODO - implement Restaurant.filtrerMenu
		throw new UnsupportedOperationException();
	}

	public CiteInternationale getCite() {
		// TODO - implement Restaurant.getCite
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param cite
	 */
	public void setCite(CiteInternationale cite) {
		// TODO - implement Restaurant.setCite
		throw new UnsupportedOperationException();
	}

	public String getNom() {
		return this.nom;
	}

	/**
	 * 
	 * @param bon
	 */
	public void setNom(String bon) {
		this.nom = bon;
	}

}