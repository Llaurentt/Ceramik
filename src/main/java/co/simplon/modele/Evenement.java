package co.simplon.modele;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Evenement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String titre;
	private String descriptif;
	private Date date_debut;
	private Date date_fin;
	@ManyToOne
	@JoinColumn(name="adresse_id")
	private Adresse adresse;
	@ManyToOne
	@JoinColumn(name="type_evenement_id")
	private Type_evenement type_evenement;
	@OneToOne(mappedBy = "evenement")
	private Stage stage;
	
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
	
	
}
