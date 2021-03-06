package co.simplon.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TypeTechnique {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String type;
	@OneToMany(mappedBy="typeTechnique", fetch = FetchType.LAZY)
	private List<Technique> techniques;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<Technique> getTechniques() {
		return techniques;
	}
	public void setTechniques(List<Technique> techniques) {
		this.techniques = techniques;
	}
}
