package co.simplon.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(Include.NON_NULL)
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Photo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nom;
	private String description;
	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
	private Ceramiste ceramiste;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="technique_photo", joinColumns = {
			@JoinColumn(name = "photo_id")},inverseJoinColumns = {@JoinColumn(name ="technique_id")
			})
	private List<Technique> techniques;
	@ManyToMany(mappedBy = "photos", fetch = FetchType.LAZY)
	List<Utilisateur> utilisateurs;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Ceramiste getCeramiste() {
		return ceramiste;
	}
	public void setCeramiste(Ceramiste ceramiste) {
		this.ceramiste = ceramiste;
	}
	public List<Technique> getTechniques() {
		return techniques;
	}
	public void setTechniques(List<Technique> techniques) {
		this.techniques = techniques;
	}
	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}
}
