package co.simplon.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@JsonInclude(Include.NON_NULL)
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class TypeTechnique {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String type;
	@OneToMany(mappedBy="typeTechnique", fetch = FetchType.LAZY)
	private List<Technique> techniques;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
