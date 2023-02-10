
package calculadora;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double num1, num2, ivaPorcentaje, resultado;
        
        do {
            System.out.println("GUIA DE LABORATORIO #1 Maria Jose Trivino 7004062 ");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Seno");
            System.out.println("6. Coseno");
            System.out.println("7. Tangente");
            System.out.println("8. Raíz enésima");
            System.out.println("9. Potencia enésima");
            System.out.println("10. Cálculo de IVA");
            System.out.println("0. Salir");
            System.out.print("Ingresa una opción--> ");
            opcion = sc.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa el primer número--> ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingresa el segundo número--> ");
                    num2 = sc.nextDouble();
                    resultado = num1 + num2;
                    System.out.println("Resultado--> " + resultado);
                    break;
                case 2:
                    System.out.print("Ingrese el primer número--> ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número--> ");
                    num2 = sc.nextDouble();
                    resultado = num1 - num2;
                    System.out.println("Resultado--> " + resultado);
                    break;
                case 3:
                    System.out.print("Ingrese el primer número--> ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número--> ");
                    num2 = sc.nextDouble();
                    resultado = num1 * num2;
                    System.out.println("Resultado--> " + resultado);
                    break;
                case 4:
                    System.out.print("Ingrese el primer número--> ");
                    num1 = sc.nextDouble();
                    System.out.print("Ingrese el segundo número--> ");
                    num2 = sc.nextDouble();
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado--> " + resultado);
                    } else {
                        System.out.println("No es posible dividir entre 0");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el número--> ");
num1 = sc.nextDouble();
resultado = Math.sin(num1);
System.out.println("Resultado--> " + resultado);
break;
case 6:
System.out.print("Ingrese el número--> ");
num1 = sc.nextDouble();
resultado = Math.cos(num1);
System.out.println("Resultado--> " + resultado);
break;
case 7:
System.out.print("Ingrese el número--> ");
num1 = sc.nextDouble();
resultado = Math.tan(num1);
System.out.println("Resultado--> " + resultado);
break;
case 8:
System.out.print("Ingrese el número--> ");
num1 = sc.nextDouble();
System.out.print("Ingrese la raíz enésima--> ");
num2 = sc.nextDouble();
resultado = Math.pow(num1, 1 / num2);
System.out.println("Resultado--> " + resultado);
break;
case 9:
System.out.print("Ingrese la base--> ");
num1 = sc.nextDouble();
System.out.print("Ingrese el exponente--> ");
num2 = sc.nextDouble();
resultado = Math.pow(num1, num2);
System.out.println("Resultado--> " + resultado);
break;
case 10:
System.out.print("Ingrese el valor a calcular el IVA--> ");
num1 = sc.nextDouble();
System.out.print("Ingrese el porcentaje de IVA (sin el signo %)--> ");
ivaPorcentaje = sc.nextDouble();
resultado = num1 * (ivaPorcentaje / 100);
System.out.println("Resultado: " + resultado);
break;
case 0:
System.out.println("FIN CALCULADORA");
break;
default:
System.out.println("Opción inválida, intente nuevamente");
}
} while (opcion != 0);
sc.close();
}
}
