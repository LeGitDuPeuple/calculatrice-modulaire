
import java.util.Scanner;

public class Main {

    public static double somme(double[] nombres){
        double result = 0;
        for(int i = 0; i < nombres.length; i++) {
            result = result + nombres[i];

        }
        return result;
    }
    public static double soustraction(double[] nombres){
        double result = nombres[0];
        for(int i = 1; i < nombres.length; i++){
            result = result - nombres[i];
        }
        return result;
    }
    public static double multiplication(double[] nombres){
        double result = nombres[0];
        for(int i = 1; i < nombres.length; i++) {
            result = result * nombres[i];
        }
        return result;
    }
    public static int factorielle(int n){
        int result = 1;
        for(int i = 1; i < n; i++){
            result = result * i;

        }
        return result;
    }
    public static boolean nombrePremier(int n){
        for(int i = 2; i <= Math.sqrt(n); i++){

            if(n % i == 0){
                return false;
            }
        };

        return true;
    };

    public static void tableMultiplication(int n){
        System.out.println("Table de multiplication de " + n + " :");
        for(int i = 1; i < 11; i++){
            int result = i * n;
            System.out.println(result);
        }
    }


    public static double puissance(double base, int exposant){
        double result = 1;
        for(int i = 0; i < exposant; i++) {
            result = result * base;
        }
        return result;
    };


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choix = 0;
        while(choix != 8){
            System.out.println("1. Addition de plusieurs nombres");
            System.out.println("2. Soustraction de plusieurs nombres");
            System.out.println("3. Multiplications de plusieurs nombres");
            System.out.println("4. Factorielle d'un nombre");
            System.out.println("5. Vérifier si un nombre est premier");
            System.out.println("6. Afficher la table de multiplication");
            System.out.println("7. Calculer une puissance");
            System.out.println("8. Quitter");
            System.out.println("Entrez un numéro : ");
            choix = sc.nextInt();

            switch(choix){
                case 1:
                    System.out.println("Combien de nombre à additionner ? ");
                    int taille = sc.nextInt();
                    double[] newArray = new double[taille];
                    for(int i = 0; i < taille; i++ ){
                        System.out.println("Entrez le nombre " + (i+1) + " : ");
                        newArray[i] = sc.nextDouble();
                    }
                    System.out.println(somme(newArray));
                    break;
                case 2:
                    System.out.println("Combien de nombre voulez vous soustraire ?");
                    int taille2 = sc.nextInt();
                    double[] newArray2 = new double[taille2];
                    for(int i = 0; i < taille2; i++) {
                        System.out.println("Entrez le nombre" + (i + 1) + " : ");
                        newArray2[i] = sc.nextInt();
                    }
                    System.out.println(soustraction(newArray2));
                    break;
                case 3:
                    System.out.println("Combien de nombre voulez vous multiplier ? ");
                    int taille3 = sc.nextInt();
                    double[] newArray3 = new double[taille3];
                    for(int i = 0; i <taille3; i++){
                        System.out.println("Entrez le numéro " + (i+1) + " : ");
                        newArray3[i] = sc.nextInt();
                    }
                    System.out.println(multiplication(newArray3));
                    break;
                case 4:
                    // Vérifier la factorielle d'un nombre
                    System.out.println("Entrez un nombre pour avoir sa factorielle : ");
                    int nombre = sc.nextInt();
                    System.out.println(factorielle(nombre));

                    break;
                case 5:
                    // Vérifier si un nombre est premier
                    System.out.println("Saisis un entier pour voir s'il est premier : ");
                    int nPremier = sc.nextInt();
                    System.out.println(nombrePremier(nPremier));
                    break;

                case 6:
                    // Afficher une table de multiplication
                    System.out.println("Entrez un nombre pour affiché sa table de multiplication : ");
                    int multiple = sc.nextInt();
                    tableMultiplication(multiple);
                    break;
                case 7:
                    // Calculer une puissance
                    System.out.println("Entrez une base : ");
                    int base = sc.nextInt();
                    System.out.println("Entrez un exposant : ");
                    int exposant = sc.nextInt();
                    System.out.println(puissance(base, exposant));
                    break;
                case 8:
                    System.out.println("Au revoir");
                    break;
                default:
                    System.out.println("Choix invalide. Veuillez choisir un numéro entre 1 et 6");
                    break;
            }

        }
        sc.close();
    }
}

