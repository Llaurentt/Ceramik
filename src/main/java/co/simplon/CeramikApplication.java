package co.simplon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CeramikApplication {

	// methode main qui fait appel à une methode run d'une classe SpringApplication avec en 
	// parametre la classe elle-meme: CeramikApplication.class qui a l'annotation: @SprinBootApplication
	// cette annotation fait démarrer automatiquement une applicaiton Spring boot avec une version
	// embarqué de Tomcat et l'inversion de controle. Par la suite il reconnaitra les annotations @Autowired...
	// Il va scanner toutes les classes qui descendent du package ou il se trouve.
	// Si on crée des classes en dehors du package ou l'application se trouve il va falloir spécifier les packages ou se trouvent les classes!
	
	public static void main(String[] args) {
		SpringApplication.run(CeramikApplication.class, args);
	}
}
