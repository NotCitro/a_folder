package tp1;

import java.util.ArrayList;
import java.util.List;

public class zoo {
	private int visiteurs;
	private List<Secteur> secteurAnimaux;
	
	public List<Secteur> getSecteurAnimaux() {
		return secteurAnimaux;
	}

	zoo(){
		secteurAnimaux=new ArrayList<Secteur>();
	}
	
	Secteur ajouterSecteur(String type) {
		Secteur s = new Secteur(type);
		this.secteurAnimaux.add(s);
		return(s);
	}
	
	void nouveauVisiteur() throws LimiteVisiteurException {
			if(this.visiteurs==this.getLimiteVisiteur()){
				throw new LimiteVisiteurException();
			}
			else {
			visiteurs++;
			}	
	}
	
	int getLimiteVisiteur(){
		int lim=this.secteurAnimaux.size()*15;
		return(lim);
	}
	
	void nouvelAnimal(Animal a) {
		Secteur trouve=null;
		for(Secteur s:this.secteurAnimaux) {
			if(a.getTypeAnimal().equals(s.obtenirType())) {
				trouve=s;	
				}
		}
			if(trouve!= null) {
			try {
				trouve.ajouterAnimal(a);
			} catch (AnimalDansMauvaisSecteurException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			else {
				Secteur nouveauS=this.ajouterSecteur(a.getTypeAnimal());
				try {
					nouveauS.ajouterAnimal(a);
				} catch (AnimalDansMauvaisSecteurException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		
	}
	
	int nombreAnimaux() {
		int i=0;
		for(Secteur s:this.secteurAnimaux) {
				i+=s.getNombreAnimaux();
			}
	return(i);
	}
}
