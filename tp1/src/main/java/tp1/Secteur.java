	package tp1;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Secteur {
	
	private String  typeAnimauxDansSecteur;
	private List<Animal> animauxDansSecteur;
	private  static  final  Logger  logger =LogManager.getLogger(Animal.class);
	
	Secteur(String type){
		animauxDansSecteur= new ArrayList<Animal>();
		this.typeAnimauxDansSecteur=type;
	}
	
	public List<Animal> getAnimauxDansSecteur() {
		return animauxDansSecteur;
	}

	public void setAnimauxDansSecteur(List<Animal> animauxDansSecteur) {
		this.animauxDansSecteur = animauxDansSecteur;
	}

	public void ajouterAnimal(Animal A) throws AnimalDansMauvaisSecteurException {
		if(A.typeAnimal.equals(this.typeAnimauxDansSecteur)) {
			this.animauxDansSecteur.add(A);
			logger.info("Ajout animal dans secteur : "+"Secteur : "+ this.typeAnimauxDansSecteur+"Animal : "+A.getTypeAnimal());
	}
		else {
			logger.fatal("Pb type animal dans secteur : "+"Secteur : "+ this.typeAnimauxDansSecteur+"Animal : "+A.getTypeAnimal());
			throw new AnimalDansMauvaisSecteurException();
			
		}
	}
	
	public int getNombreAnimaux() {
		return(this.animauxDansSecteur.size());
	}
	
	public String obtenirType() {
		return(this.typeAnimauxDansSecteur);
	}
}
