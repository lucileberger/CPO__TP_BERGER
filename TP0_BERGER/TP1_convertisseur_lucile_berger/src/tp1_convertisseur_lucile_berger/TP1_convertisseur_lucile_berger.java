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
        Scanner sc = new Scanner(System.in);

        double intro;
        System.out.print("Bonjour, saisissez une valeur : ");
        intro = sc.nextInt();

        int choix = 0;
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :\n 1) De Celcius vers Kelvin\n 2) De Kelvin vers Celcius\n 3) De Farenheit vers Celcius \n 4) De Kelvin vers Farenheit \n 5) De Farenheit vers Kelvin");
        choix = sc.nextInt();

        double result;

        if (choix == 1) {
            result = CelciusVersKelvin(intro);
            System.out.println("Celcius vers Kelvin : " + result + "K");
        }

        

        if (choix == 2) {
            result = KelvinVersCelcius(intro);
            System.out.println("Kelvin Vers Celcius : " + result + "C");
        }

        if (choix == 3) {
            result = FarenheitVersCelcius(intro);
            System.out.println("Farenheit vers Celcius : " + result + "C");
        }
            
        if (choix == 4){
            result = KelvinVersFarenheit(intro);
            System.out.println("Kelvin vers Farenheit : " + result + "F");
        }
            
        if (choix == 5){
            result = FarenheitVersKelvin(intro);
            System.out.println("Farenheit vers Kelvin  : " + result + "K");
        }
    }

    public static double CelciusVersKelvin(double Tc) {

        double Tk;
        Tk = Tc + 273.15;
        return Tk;

    }

    public static double KelvinVersCelcius(double Tk) {

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
        Tk = (Tf - 32) * 1.8 + 273.15;
        return Tk;

    }

}
