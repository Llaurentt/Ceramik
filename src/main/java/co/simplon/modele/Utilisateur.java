package co.simplon.modele;

import java.util.List;

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

@Entity
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
	@JoinColumn(name="role_id")
	private Role role;
	@ManyToOne
	@JoinColumn(name="adresse_id")
	private Adresse adresse;
	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name="reseau_social_utilisateur", joinColumns = {
//			@JoinColumn(name = "utilisateur_id")},inverseJoinColumns = {@JoinColumn(name ="reseauSocial_id")
//			})
	@JoinTable(name="reseau_social_utilisateur")
	private List<Reseau_social> reseau_socials;
	@OneToOne(mappedBy = "utilisateur")
	private Ceramiste ceramiste;
	@OneToMany(mappedBy="utilisateur", fetch = FetchType.LAZY)
	private List<Inscription> inscriptions;
	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name="favori_photo", joinColumns = {
//			@JoinColumn(name = "utilisateur_id")},inverseJoinColumns = {@JoinColumn(name ="photo_id")
//			})
	@JoinTable(name="favori_photo")
	private List<Photo> photos;
	
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
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

}
