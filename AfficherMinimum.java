import java.util.Scanner;
import java.util.InputMismatchException;

public class AfficherMinimum
{
    public static void main(String [] args)
    {
        /*Declaration de variable: 
        valmin contient la valeur minimum saisie
        nombre contient le nombre de chiffre qu'on l'utilisateur veut saisir;
        valeur permet la saisie des nombres
        */
        int valMin,nombre=0;
        int valeur=0;
       
        
        System.out.println("Voulez-vous entrer combien de nombres ?");
        // Appel de la fonction pour le controle de la première saisie afin d' allouer l'espace necessaire
        nombre=ControleDeSaisie(nombre);
        //Declaration d'un tableau
        int tableau[]=new int[nombre];
        // Appel de la fonction pour la saisie
        EntrerNombre(tableau,nombre,valeur);
        // Appel de la fonction de recherche de valeur minimum
        valMin=RechercherNombreMin(tableau,nombre);
        // Appel de la fonction d' affichage des nombres préalablement saisies
        AfficherNombre(tableau,nombre);
        System.out.println("\n");
        //Affichage de la valeur minimum
        System.out.println("Le nombre minimum est:" + valMin);

    }

    /////////////////// Declaration de Fonction////////////////////////////


    // Fonction qui permet d'entrer un nombre avec verification de saisie
    static int  ControleDeSaisie(int nombre)
    {
       boolean isEntier;
        do
        {
            Scanner clavier= new Scanner(System.in);
            isEntier=true;
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

    // Fonction qui permet d'entrer des nombres avec verification de saisie(appel de la fonction de controle de saisie)
    static void  EntrerNombre(int tableau[],int nombre,int valeur)
    {

        int i;
        System.out.println("Entrer les nombres !! \n");
        for(i=0;i<nombre;i++)
        {
             System.out.print("Saisissez le nombre "+ (i+1) + ":  ");
            tableau[i]=ControleDeSaisie(valeur);
        }
         
    }


    /* Fonction qui permet  de rechercher le nombre minimum parmis les  differents nombres saisies, elle prend en paramètre un tableau
    et le nombre de valeur saisie;*/
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
        System.out.print(" \n Les nombres saisies sont: ");
        for(i=0;i<nombre;i++)
        {
             System.out.print(tableau[i] + " ");
        }
    }
}