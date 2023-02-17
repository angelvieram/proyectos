package varios.personal.programaSalario;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoSalario {
    public static void main(String[] args) {

        int opcion;
        double diasTrabajados, salario, salarioDevengado, salarioHora, salarioTotal, hed = 0, heno = 0, rhno = 0, hedd = 0, hend = 0, hrndf = 0, dd = 0, hd = 0;


        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el salario del empleado:");
        salario = sc.nextDouble();
        salarioHora = salario / 240;

        System.out.println("Ingrese el número de dias trabajados:");
        diasTrabajados = sc.nextDouble();

        salarioDevengado = (salario / 30) * diasTrabajados;

        do {
            System.out.println("""
                                    
                    Deseas agregar:
                    1.- Hora extra diurna ordinaria.
                    2.- Hora extra nocturna ordinaria.
                    3.- Recargo por hora nocturna ordinaria.
                    4.- Hora extra diurna dominical.
                    5.- Hora extra nocturna dominical.
                    6.- Hora recargo nocturno, dominical o festivo.
                    7.- Día dominical.
                    8.- Hora dominical.
                    9.- Calcular valor a pagar.
                          """);

            opcion = sc.nextInt();
            boolean continua;
            do {
                try {
                    continua = false;
                    switch (opcion) {
                        case 1 -> {
                            System.out.println("Ingrese la cantidad de " + DatosNomina.HED.getDatosNomina());
                            hed = hed + (sc.nextDouble() * salarioHora * 1.25);
                        }
                        case 2 -> {
                            System.out.println("Ingrese la cantidad de " + DatosNomina.HENO.getDatosNomina());
                            heno = heno + (sc.nextDouble() * salarioHora * 1.75);
                        }
                        case 3 -> {
                            System.out.println("Ingrese la cantidad de " + DatosNomina.RHNO.getDatosNomina());
                            rhno = rhno + (sc.nextDouble() * salarioHora * 0.35);
                        }
                        case 4 -> {
                            System.out.println("Ingrese la cantidad de " + DatosNomina.HEDD.getDatosNomina());
                            hedd = hedd + (sc.nextDouble() * salarioHora * 2);
                        }
                        case 5 -> {
                            System.out.println("Ingrese la cantidad de " + DatosNomina.HEND.getDatosNomina());
                            hend = hend + (sc.nextDouble() * salarioHora * 2.5);
                        }
                        case 6 -> {
                            System.out.println("Ingrese la cantidad de " + DatosNomina.HRNDF.getDatosNomina());
                            hrndf = hrndf + (sc.nextDouble() * salarioHora * 2.1);
                        }
                        case 7 -> {
                            System.out.println("Ingrese la cantidad de " + DatosNomina.DD.getDatosNomina());
                            dd = dd + (sc.nextDouble() * salarioHora * 1.75);
                        }
                        case 8 -> {
                            System.out.println("Ingrese la cantidad de " + DatosNomina.HD.getDatosNomina());
                            hd = hd + (sc.nextDouble() * salarioHora * 1.75);
                        }
                        case 9 -> {
                            salarioTotal = salarioDevengado + hed + heno + rhno + hedd + hend + hrndf + dd + hd;
                            NumberFormat formatoTotal = NumberFormat.getCurrencyInstance();
                            System.out.println("El salario a pagar es de: " + formatoTotal.format(salarioTotal));
                            System.exit(1);
                        }
                    }
                } catch (InputMismatchException e) {
                    System.out.println("El separador de decimales debe ser una coma(,)");
                    sc.next();
                    continua = true;
                }
            } while (continua);
        } while (opcion != 0);
    }
}
