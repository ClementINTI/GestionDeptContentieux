package com.adaming.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Affaire implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAffaire;
	private String reference;
	private String titre;
	private String description;
	private int status;
	@OneToMany(mappedBy="affaire")
	private Set <Tache> listTache = new HashSet<Tache>();
	@OneToMany(mappedBy="affaire")
	private Set <Document> listDocument = new HashSet<Document>();
	
	
	
	public Set<Document> getListDocument() {
		return listDocument;
	}
	public void setListDocument(Set<Document> listDocument) {
		this.listDocument = listDocument;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Affaire(String reference, String titre, String description) {
		super();
		this.reference = reference;
		this.titre = titre;
		this.description = description;
	}
	public Affaire(Long idAffaire, String reference, String titre, String description, Set<Tache> listTache) {
		super();
		this.idAffaire = idAffaire;
		this.reference = reference;
		this.titre = titre;
		this.description = description;
		this.listTache = listTache;
	}
	public Affaire() {
		super();
	}
	public Long getIdAffaire() {
		return idAffaire;
	}
	public void setIdAffaire(Long idAffaire) {
		this.idAffaire = idAffaire;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Set<Tache> getListTache() {
		return listTache;
	}
	public void setListTache(Set<Tache> listTache) {
		this.listTache = listTache;
	}



}
