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
	private Integer nombre_min;
	private Integer nombre_max;
	private Date date_limite_inscription;
	@OneToOne(cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Evenement evenement;
	@ManyToOne
	@JoinColumn(name="ceramiste_id")
	private Ceramiste ceramiste;
	
	
	public Integer getNombre_min() {
		return nombre_min;
	}
	public void setNombre_min(Integer nombre_min) {
		this.nombre_min = nombre_min;
	}
	public Integer getNombre_max() {
		return nombre_max;
	}
	public void setNombre_max(Integer nombre_max) {
		this.nombre_max = nombre_max;
	}
	public Date getDate_limite_inscription() {
		return date_limite_inscription;
	}
	public void setDate_limite_inscription(Date date_limite_inscription) {
		this.date_limite_inscription = date_limite_inscription;
	}
	
	
	
}
