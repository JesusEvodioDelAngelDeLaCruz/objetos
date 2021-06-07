package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Usher
 */
public class cubo extends Cuadrado {

    /**
     * @param args the command line arguments
     */
    int VolumenCubo, perimetroCubo;
    int opcion = 0;

    public void menu() {

        System.out.println("CALCULOS QUE REALIZA EL PRO6RAMA");
        System.out.println("1.-Area cuadrado\n2.-Perimetro cuadrado\n3.-Volumen Cubo\n4.-Perimetro cubo\n5.-cancelar\n6.-Salir ");

    }

    public void calcularVolumenCubo(int lado) {
        VolumenCubo = lado * lado * lado;
        System.out.println("El volumen de un cubo es: " + VolumenCubo);
    }

    public void calcularPerimetroCubo(int lado) {
        perimetroCubo = 12 * lado;
        System.out.println("El perimetro del Cubo es: " + perimetroCubo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        cubo calculos = new cubo();
        int Lado=0;
        int opcion = 0;

        System.out.println("in9rese la medida de un lado");
        Lado = sc.nextInt();
        do {

            calculos.menu();
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    calculos.calculaArea(Lado);
                    System.out.println("El area del Cuadrado es: " + calculos.getArea());
                    opcion = 0;
                    break;

                case 2:

                    calculos.calcularPerimetro(Lado);
                    System.out.println("El perimetro del Cuadrado es: " + calculos.getPerimetro());
                    opcion = 0;
                    break;

                case 3:

                    calculos.calcularVolumenCubo(Lado);
                    opcion = 0;
                    break;

                case 4:

                    calculos.calcularPerimetroCubo(Lado);
                    opcion = 0;
                    break;

                case 5:

                    do {
                        Lado = 0;
                        System.out.println("in9rese la medida de un lado");
                        Lado = sc.nextInt();
                        calculos.menu();
                        opcion = sc.nextInt();
                    } while (opcion == 5);
                    opcion = 0;

                    break;
                case 6:
                    System.exit(0);
                    break;
            }
        } while (opcion == 0);
    }

}
