package com.adaming.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Utilisateur implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUtilisateur;
	private String email;
	private String nom;
	private String prenom;
	@ManyToMany
	@JoinTable(name="Utili_Tache",joinColumns=
    @JoinColumn(name="idUtilisateur", referencedColumnName="idUtilisateur"),
inverseJoinColumns=@JoinColumn(name="idTache", referencedColumnName="idTache"))
private Set <Tache> listTache = new HashSet<Tache>();
	
	@ManyToMany
	@JoinTable(name="profil",joinColumns=
	  @JoinColumn(name="idUtilisateur", referencedColumnName="idUtilisateur"),
	  inverseJoinColumns=@JoinColumn(name="idRole", referencedColumnName="idRole"))
	  private Set <Role> listRole = new HashSet<Role>();
	
	public Utilisateur(Long idUtilisateur, String email, String nom, String prenom) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}


	
	public Utilisateur() {
		super();
	}
	
	public Utilisateur(String email, String nom, String prenom) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Utilisateur(Long idUtilisateur, String email, String nom, String prenom, Set<Tache> listTache) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.listTache = listTache;
		
	}
	public Utilisateur(String email, String nom, String prenom, Set<Tache> listTache, Set<Role> listRole) {
		super();
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.listTache = listTache;
		this.listRole = listRole;
	}
	public Long getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(Long idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Set<Tache> getListTache() {
		return listTache;
	}
	public void setListTache(Set<Tache> listTache) {
		this.listTache = listTache;
	}

	public Set<Role> getListRole() {
		return listRole;
	}

	public void setListRole(Set<Role> listRole) {
		this.listRole = listRole;
	}

	@Override
	public String toString() {
		return "Utilisateur [idUtilisateur=" + idUtilisateur + ", email=" + email + ", nom=" + nom + ", prenom="
				+ prenom + ", listTache=" + listTache + ", listRole=" + listRole + "]";
	}
	
}
