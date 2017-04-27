package co.simplon.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Adresse {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idadresse;
	private String adresse;
	private String codePostal;
	private String ville;
	private String pays;
	
}
