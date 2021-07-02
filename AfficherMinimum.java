
import java.util.Scanner;
import java.util.InputMismatchException;

public class AfficherMinimum
{
    public static void main(String [] args)
    {
        int i, valMin,nombre=0;
        int valeur=0;
        int tableau[]=new int[1000];
       
        // Appel de la fonction pour le controle de la premere saisie
        nombre=ControleDeSaisie(nombre);
        // Appel de la fonction pour la saisie
        EntrerNombre(tableau,nombre,valeur);
        // Appel de la fonction de recherche de valeur minimum
        valMin=RechercherNombreMin(tableau,nombre);
        // Appel de la fonction d' affichage des nombres prealablement saisies
        AfficherNombre(tableau,nombre);
        System.out.println("");
        //Affichage de la valeur minimum
        System.out.println("Le nombre minimum est:" + valMin);

    }

    /////////////////// Declaration de Fonction////////////////////////////


    // Fonction qui permet d'entrer des nombres avec verification de saisie
    static int  ControleDeSaisie(int nombre)
    {
       boolean isEntier;
        do
        {
            Scanner clavier= new Scanner(System.in);
            isEntier=true;
            System.out.println("Voulez-vous entrer combien de nombres ?");
            try
            {
                nombre=clavier.nextInt();
            }
            catch (InputMismatchException e)
            {
                System.out.println("Saisissez un nombre entier !!");
                isEntier=false;
            }
        }
        while(isEntier != true);
       return nombre;
    }

    // Fonction qui permet d'entrer des nombres avec verification de saisie
    static void  EntrerNombre(int tableau[],int nombre,int valeur)
    {
        int i;
            for(i=0;i<nombre;i++)
            {
                tableau[i]=ControleDeSaisie(valeur);
            }
    }


    // Fonction qui permet  de rechercher le nombre minimum parmis les nombres saisies
    static int  RechercherNombreMin(int tableau[],int nombre)
    {
        int i;
        int valeurMin=tableau[0];
        for(i=0;i<nombre;i++)
        {
            if(tableau[i]<valeurMin)
            {
                valeurMin=tableau[i];
            }
        }
        return valeurMin;
    }
    
    // Fonction qui permet  d'afficher les nombres saises
    static void  AfficherNombre(int tableau[],int nombre)
    {
        int i;
        for(i=0;i<nombre;i++)
        {
             System.out.print(tableau[i] + " ");
        }
    }
}