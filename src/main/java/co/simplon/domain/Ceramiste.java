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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonInclude(Include.NON_NULL)
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Ceramiste {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String bio;
	private String exposition;
	private String concours;
	private String site_perso;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="utilisateur_id")
	private Utilisateur utilisateur;
	@OneToMany(mappedBy="ceramiste", fetch = FetchType.LAZY)
	private List<Stage> stages;
	@OneToMany(mappedBy="ceramiste", fetch = FetchType.LAZY)
	private List<Photo> photos;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="technique_ceramiste", joinColumns = {
			@JoinColumn(name = "ceramiste_id")},inverseJoinColumns = {@JoinColumn(name ="technique_id")
			})
	private List<Technique> techniques;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getExposition() {
		return exposition;
	}
	public void setExposition(String exposition) {
		this.exposition = exposition;
	}
	public String getConcours() {
		return concours;
	}
	public void setConcours(String concours) {
		this.concours = concours;
	}
	public String getSite_perso() {
		return site_perso;
	}
	public void setSite_perso(String site_perso) {
		this.site_perso = site_perso;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public List<Stage> getStages() {
		return stages;
	}
	public void setStages(List<Stage> stages) {
		this.stages = stages;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	public List<Technique> getTechniques() {
		return techniques;
	}
	public void setTechniques(List<Technique> techniques) {
		this.techniques = techniques;
	}
}
