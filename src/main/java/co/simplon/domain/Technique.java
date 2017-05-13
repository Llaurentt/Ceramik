package co.simplon.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonInclude(Include.NON_NULL)
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Technique {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nom;
	private String definition;
	private String image;
	private String lien;
	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
	private TypeTechnique typeTechnique;
	@ManyToMany(mappedBy = "techniques", fetch = FetchType.LAZY)
	List<Ceramiste> ceramistes;
	@ManyToMany(mappedBy = "techniques", fetch = FetchType.LAZY)
	List<Photo> photos;
	
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
	public String getDefinition() {
		return definition;
	}
	public void setDefinition(String definition) {
		this.definition = definition;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getLien() {
		return lien;
	}
	public void setLien(String lien) {
		this.lien = lien;
	}
	public TypeTechnique getTypeTechnique() {
		return typeTechnique;
	}
	public void setTypeTechnique(TypeTechnique typeTechnique) {
		this.typeTechnique = typeTechnique;
	}
	public List<Ceramiste> getCeramistes() {
		return ceramistes;
	}
	public void setCeramistes(List<Ceramiste> ceramistes) {
		this.ceramistes = ceramistes;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
}
