package co.simplon.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Evenement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String titre;
	private String descriptif;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date_debut;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date_fin;
	@ManyToOne
	private Adresse adresse;
	@ManyToOne
	private TypeEvenement typeEvenement;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="stage_id")
	private Stage stage;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getDescriptif() {
		return descriptif;
	}
	public void setDescriptif(String descriptif) {
		this.descriptif = descriptif;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public TypeEvenement getTypeEvenement() {
		return typeEvenement;
	}
	public void setTypeEvenement(TypeEvenement typeEvenement) {
		this.typeEvenement = typeEvenement;
	}
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
}
