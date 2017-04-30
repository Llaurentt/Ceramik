package co.simplon.modele;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Ceramiste {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String bio;
	private String exposition;
	private String concours;
	private String site_perso;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Utilisateur utilisateur;
	@OneToMany(mappedBy="ceramiste", fetch = FetchType.LAZY)
	private List<Stage> stages;
	@OneToMany(mappedBy="ceramiste", fetch = FetchType.LAZY)
	private List<Photo> photos;
	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name="technique_ceramiste", joinColumns = {
//			@JoinColumn(name = "ceramiste_id")},inverseJoinColumns = {@JoinColumn(name ="technique_id")
//			})
	@JoinTable(name="technique_ceramiste")
	private List<Technique> techniques;
	
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
	
	
}
