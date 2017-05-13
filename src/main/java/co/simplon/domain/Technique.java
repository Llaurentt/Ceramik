package co.simplon.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
public class Technique {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nom;
	private String definition;
	private String image;
	private String lien;
	@ManyToOne
	@JoinColumn(name="type_technique_id")
	private TypeTechnique typeTechnique;
	@ManyToMany(mappedBy = "techniques", fetch = FetchType.LAZY)
	List<Ceramiste> ceramistes;
	@ManyToMany(mappedBy = "techniques", fetch = FetchType.LAZY)
	List<Photo> photos;
	
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
	
	

}
