/*
 * TP1 partie 2 convertisseur.
 * Lucile Berger
 */
package tp1_convertisseur_lucile_berger;

import java.util.Scanner;

/**
 *
 * @author ocean
 */
public class TP1_convertisseur_lucile_berger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        double intro;
        System.out.print("Bonjour, saisissez une valeur : ");
        intro = sc.nextInt();
        
        double conv;
        System.out.print("Saisissez la conversion que vous souhaiter effectuer :\n 1) De Celcius vers Kelvin\n 2) De Kelvin vers Celcius\n 6) De Farenheit vers Kelvin ");
        conv = sc.nextInt();

        double Tc;
        System.out.print("Entrez la température en degré Celcius : ");
        Tc = sc.nextInt();
        
        double Tf;
        System.out.print("Entrez la température en Farenheit :");
        Tf = sc.nextInt();
        
        
        
        
        
        
        double Tk;
        Tk = Tc + 273.15;
        System.out.println("La température en Kelvin : " +Tk+ "K");
  
        double ck;
        ck = CelciusVersKelvin(Tc);
        System.out.println("Celvin vers Kelvin : " +ck+ "K");
        
        double kc;
        kc = KelvinVersCelcius(Tk);
        System.out.println("Kelvin Vers Celcius : " +kc+ "C");
        
        double fc;
        fc = FarenheitVersCelcius(Tf);
        System.out.println("Farenheit vers Celcius : " +fc+ "C");
        
        double kf;
        kf = KelvinVersFarenheit(Tk);
        System.out.println("Kelvin vers Farenheit : " +kc+ "F");
        
        double fk;
        kf = FarenheitVersKelvin(Tf);
        System.out.println("Farenheit vers Kelvin  : " +kf+ "K");
    }
    
    public static double CelciusVersKelvin (double Tc) {

        double Tk;
        Tk = Tc + 273.15;
        return Tk;
       
        }
    
    public static double KelvinVersCelcius (double Tk) {

        double Tc;
        Tc = Tk - 273.15;
        return Tc;
       
        }
    
    public static double FarenheitVersCelcius(double Tf) {

        double Tc;
        Tc = (Tf - 32) / 1.8;
        return Tc;
       
        }

    public static double CelciusVersFarenheit(double Tc) {

        double Tf;
        Tf = (Tc * 1.8) + 32;  
        return Tf;
       
        }
        
    public static double KelvinVersFarenheit(double Tk) {

        double Tf;
        Tf = (Tk - 273.15) * 1.8 + 32;
        return Tf;
       
        }
    
    public static double FarenheitVersKelvin(double Tf) {

        double Tk;
        Tk = (Tf - 32) * 1.8 + 273.15 ;
        return Tk;
       
        }
    
}
