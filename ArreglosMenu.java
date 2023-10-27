    package arreglosmenu;
    import java.util.Scanner;

    public class ArreglosMenu {
        public static void main(String[] args) {
            double numeros[] = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
            System.out.println("Deseas multiplicar o sumar los numeros del arreglo?");
            System.out.println("1. Sumar");
            System.out.println("2. Multiplicar");
            System.out.println("0. Salir");

            int opcion;
            Scanner e = new Scanner(System.in);
            opcion = e.nextInt();

            while (opcion != 0) {
                switch (opcion) {
                    case 1: {
                        double suma = 0;
                        for (int i = 0; i < numeros.length; i++) {
                            suma += numeros[i];
                        }
                        System.out.println("Resultado de la suma: " + suma);
                        break;
                    }
                    case 2: {
                        double producto = 1;
                        for (int i = 0; i < numeros.length; i++) {
                            producto *= numeros[i];
                        }
                        System.out.println("Resultado de la multip: " + producto);
                        break;
                    }
                    default:
                        System.out.println("Opción no vAlida. Reconsidera.");
                }

                System.out.println("Deseas multiplicar o sumar los numeros del arreglo?");
                System.out.println("1. Sumar");
                System.out.println("2. Multiplicar");
                System.out.println("0. Salir");
                opcion = e.nextInt();
            }
        }
    }
