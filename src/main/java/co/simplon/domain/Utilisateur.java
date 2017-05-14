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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonInclude(Include.NON_NULL)	
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class Utilisateur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@NotEmpty(message="Le champ nom de l'utilisateur doit être renseigné")
	private String username;
	@NotEmpty(message="Le champ mot de passe doit être renseigné")
	private String password;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String avatar_utilisateur;
	private Boolean actif;
	@ManyToOne
	private Role role;
	@ManyToOne( cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
	private Adresse adresse;
	@OneToOne(mappedBy = "utilisateur")
	private Ceramiste ceramiste;
	@OneToMany(mappedBy="utilisateur", fetch = FetchType.LAZY)
	private List<Inscription> inscriptions;
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="favori_photo", joinColumns = {
			@JoinColumn(name = "utilisateur_id")},inverseJoinColumns = {@JoinColumn(name ="photo_id")
			})
	private List<Photo> photos;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getAvatar_utilisateur() {
		return avatar_utilisateur;
	}
	public void setAvatar_utilisateur(String avatar_utilisateur) {
		this.avatar_utilisateur = avatar_utilisateur;
	}
	public Boolean getActif() {
		return actif;
	}
	public void setActif(Boolean actif) {
		this.actif = actif;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}
	public Ceramiste getCeramiste() {
		return ceramiste;
	}
	public void setCeramiste(Ceramiste ceramiste) {
		this.ceramiste = ceramiste;
	}
	public List<Inscription> getInscriptions() {
		return inscriptions;
	}
	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}
	public List<Photo> getPhotos() {
		return photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}
	
}
