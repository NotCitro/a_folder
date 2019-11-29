package tp1;

import  org.apache.logging.log4j.LogManager;
import  org.apache.logging.log4j.Logger;

public class Animal {

	private  static  final  Logger  logger =LogManager.getLogger(Animal.class);
	protected String nomAnimal;
	protected String typeAnimal;
	
	Animal(String nom, String type){
		this.nomAnimal=nom;
		this.typeAnimal=type;
		logger.info("Creation nouvel animal : "+this.getTypeAnimal().toString());
	}
	
	public String getNomAnimal() {
		return(this.nomAnimal);
	}
	
	public String getTypeAnimal() {
		return(this.typeAnimal);
	}
	
}
