/*
 * Arme
 */
package Armes;

/**
 *
 * @author ocean
 */
public class Arme {
    String nom;
    int niveauattaque; 
    
    public Arme (String nom, int att){
        this.nom = nom;
        niveauattaque = att;
    }
     
    public void ajouter_arme (){
        if (inventaire.size()<4){
            inventaire.add(plus_arme);
        }
        else {
                Systeme.print("la liste est pleine, imposible de rajouter");
                } 
    }
    
    
    @Override
    public String toString () {
        return "L'arme: " +nom+ " à un niveau d'attaque : " +niveauattaque;
    }
    
    
}
