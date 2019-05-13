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
public class Tribunal implements Serializable{

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTribunal;
	private String adresse;
	private String fax;
	private String tel;
	private String region;
	@OneToMany(mappedBy="tribunal")
	private Set <Tache> listTache = new HashSet<Tache>();
	
	
	public Tribunal(String adresse, String fax, String tel, String region) {
		super();
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
	}
	public Tribunal(Long idTribunal, String adresse, String fax, String tel, String region, Set<Tache> listTache) {
		super();
		this.idTribunal = idTribunal;
		this.adresse = adresse;
		this.fax = fax;
		this.tel = tel;
		this.region = region;
		this.listTache = listTache;
	}
	public Tribunal() {
		super();
	}
	public Long getIdTribunal() {
		return idTribunal;
	}
	public void setIdTribunal(Long idTribunal) {
		this.idTribunal = idTribunal;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Set<Tache> getListTache() {
		return listTache;
	}
	public void setListTache(Set<Tache> listTache) {
		this.listTache = listTache;
	}

}
