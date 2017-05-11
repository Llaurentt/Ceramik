package co.simplon.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Type_technique {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String type;
	@OneToMany(mappedBy="type_technique", fetch = FetchType.LAZY)
	private List<Technique> techniques;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
