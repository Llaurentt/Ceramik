package co.simplon.modele;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Adresse {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String adresse;
	// Attention au camelCase codePostal est transformé en code_postal
	private String code_postal;
	private String ville;
	private String pays;
	@OneToMany(mappedBy="adresse", fetch = FetchType.LAZY)
	private List<Utilisateur> utilisateurs;
	
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	
}
