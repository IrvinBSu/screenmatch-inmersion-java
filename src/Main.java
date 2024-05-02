import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println("Matrix");

        //Declaración de variables
        int releaseDate = 1999;
        double overall;
        double userRating = 0;
        overall = (4.5 + 4.8 + 3) / 3;
        boolean includedInBasicPlan = true;
        String name = "Matrix";
        String plot = """
                La mejor pelicula del fin del milenio""";
        System.out.println("Pelicula:" + name);
        System.out.println("Sinopsis:" + plot);
        System.out.println("Fecha de lanzamiento:" + releaseDate);
        System.out.println("Calificación: " + overall);
        System.out.println("Incluido en el plan básico: " + includedInBasicPlan);

        if (releaseDate > 2023) {
            System.out.println("New Movie");
        } else {
            System.out.println("Retro Movie");
        }

        /* i = indice, inicia en ciclo 0, i<3 -> realiza dos iteraciones,
            i++ -> incrementa en 1
        * */
        for (int i = 0; i < 3; i++) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix");
            // Toma el dato de entrada en keyboard y lo almacena como double en userRating
            double userRatingMatrix = keyboard.nextDouble();
            userRating = userRating + userRatingMatrix;
        }
        System.out.println("La media de la pelicula Matrix" +
                "calculada por el usuario es: " + userRating / 3);


        int i = 0;
        while (i < 3) {
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Ingresa la nota de Matrix");
            i++;
            double userRatingsMatrix = keyboard.nextDouble();
            userRating = userRating + userRatingsMatrix;
        }
        System.out.println("La media de la película Matrix"
        + "por los usuarios es: " + userRating/3);

    }
}