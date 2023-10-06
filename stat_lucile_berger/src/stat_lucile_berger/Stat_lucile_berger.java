/*
 * Lucile Berger
 * TP1
 */
package stat_lucile_berger;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ocean
 */
public class Stat_lucile_berger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int faces[]=new int[6];
    Scanner sc = new Scanner(System.in);
    int nb;
    System.out.println("Entrez le nombre de lancer : ");
    nb=sc.nextInt();
    
    for (int i=0; i<nb ; i++){
    Random aleatoire = new Random();
        int choix = aleatoire.nextInt(6);
        System.out.println(choix);
        
        if (choix==0){
            faces[0]+=1;
        } 
        
        
        else if(choix==1){
            faces[1]+=1;
        } 
        
        else if(choix==2){
            faces[2]+=1;
        } 
        
        else if(choix==3){
            faces[3]+=1;
        } 
        
        else if(choix==4){
            faces[4]+=1;
        } 
        
        else if(choix==5){
            faces[5]+=1;
        }
    }
    for(int i=0; i<6; i++){
        double prct = 0;
        prct= faces[i]*100/nb;
        System.out.println("Le pourcentage de face "+ (i+1) +" obtenue est: "+prct+"%");
    }
    }
    
}

    
    

