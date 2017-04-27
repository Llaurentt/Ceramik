package co.simplon.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Utilisateur {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idutilisateur;
	private String username;
	private String password;
	private String nom;
	private String prenom;
	private String email;
	private String telephone;
	private String avatarUtilisateur;
	private Boolean actif;
	private Role role;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Adresse adresse;
	

}
