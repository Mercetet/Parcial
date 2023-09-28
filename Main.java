import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op = 1;
        double num1, num2, rta;
        boolean calc = true;

        System.out.println("Ingrese el valor inicial de num1");
        num1 = leer.nextDouble();

        while (calc){
            System.out.println("Ingrese que desea hacer: ");
            System.out.println("1. suma.");
            System.out.println("2. resta.");
            System.out.println("3. multiplicacion.");
            System.out.println("4. division.");
            System.out.println("5. Salir de calculadora.");
            System.out.println("Ingrese el numero de la operacion que desea hacer.");
            op = leer.nextInt();


            switch (op) {
                case 1:
                    System.out.println("Ingrese el segundo numero para la suma: ");
                     num2 = leer.nextDouble();
                    rta = num1 + num2;
                    System.out.println("El resultado de la suma es: " + rta);
                    calc = true;
                    num1 = rta;
                    break;
                case 2:
                    System.out.println("Ingrese el segundo numero para la resta: ");
                    num2 = leer.nextDouble();
                    rta = num1 - num2;
                    System.out.println("El resultado de la resta es: " + rta);
                    num1 = rta;
                    calc = true;
                    break;
                case 3:
                    System.out.println("Ingrese el segundo numero para la multiplicacion: ");
                    num2 = leer.nextDouble();
                    rta = num1 * num2;
                    System.out.println("El resultado de la multiplicacion es: " + rta);
                    num1 = rta;
                    calc = true;
                    break;
                case 4:
                    do {
                        System.out.println("Ingrese el segundo numero para la division (-1 para salir.): ");
                        num2 = leer.nextDouble();

                        if (num2 != 0){
                            rta = num1 / num2;
                            System.out.println("El resultado de la division es: " + rta);
                            num1 = rta;
                            calc = true;
                            break;
                        }else {
                            System.out.println("No se puede dividir con 0. Intente otra vez.");
                        }
                    }while (num1 != -1);
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                    calc = false;
                    break;
                default:
                    System.out.println("Ingreso un numero fuera de las opciones. Intente nuevamente.");
                    break;
            }

        }

    }

}