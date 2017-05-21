package co.simplon.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Inscription {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date_inscription;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date_arrivee;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date_depart;
	@ManyToOne
	private Utilisateur utilisateur;
	@ManyToOne
	private Evenement evenement;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDate_inscription() {
		return date_inscription;
	}
	public void setDate_inscription(Date date_inscription) {
		this.date_inscription = date_inscription;
	}
	public Date getDate_arrivee() {
		return date_arrivee;
	}
	public void setDate_arrivee(Date date_arrivee) {
		this.date_arrivee = date_arrivee;
	}
	public Date getDate_depart() {
		return date_depart;
	}
	public void setDate_depart(Date date_depart) {
		this.date_depart = date_depart;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Evenement getEvenement() {
		return evenement;
	}
	public void setEvenement(Evenement evenement) {
		this.evenement = evenement;
	}
}
