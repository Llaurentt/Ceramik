package co.simplon.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;

@Entity
public class Reseau_social {
	private Long idreseauSocial;
	private String nom;
	private String url;
	@ManyToMany(mappedBy = "reseau_socials", fetch = FetchType.LAZY)
	List<Utilisateur> utilisateurs;
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
