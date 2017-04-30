package co.simplon.modele;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Stage {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Integer nombreMin;
	private Integer nombreMax;
	private Date dateLimiteInscription;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Evenement evenement;
	@ManyToOne
	@JoinColumn(name="ceramiste_id")
	private Ceramiste ceramiste;
	
	
	public Integer getNombreMin() {
		return nombreMin;
	}
	public void setNombreMin(Integer nombreMin) {
		this.nombreMin = nombreMin;
	}
	public Integer getNombreMax() {
		return nombreMax;
	}
	public void setNombreMax(Integer nombreMax) {
		this.nombreMax = nombreMax;
	}
	public Date getDateLimiteInscription() {
		return dateLimiteInscription;
	}
	public void setDateLimiteInscription(Date dateLimiteInscription) {
		this.dateLimiteInscription = dateLimiteInscription;
	}
	
	
	
}
