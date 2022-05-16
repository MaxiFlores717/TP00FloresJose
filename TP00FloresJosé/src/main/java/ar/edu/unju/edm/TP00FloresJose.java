package ar.edu.unju.edm;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Calculadora;

@SpringBootApplication
public class TP00FloresJose {
	
	public static void main(String[] args) {
		SpringApplication.run(TP00FloresJose.class, args);
		Calculadora unacalculadora = new Calculadora();
		Scanner leer = new Scanner (System.in);
		int n1=0, n2=0, resultado=0, p=0;
		while(p!=7) {
		System.out.println("**********************************");
		System.out.println("----  Menú  ----");
		System.out.println("----------------------------------");
		System.out.println("1.Suma ");
		System.out.println("2.Resta");
		System.out.println("3.División ");
		System.out.println("4.Multiplicación ");
		System.out.println("5.Potencia ");
		System.out.println("6.Raiz ");
		System.out.println("7.Salir ");
 		System.out.println("Ingrese una opcion: ");
 		p=leer.nextInt();
 		switch(p) {
 		case 1 :
 			System.out.println("El resultado de la suma es: " +unacalculadora.Suma());
 			break;
 		case 2 :
 			System.out.println("El resultado de la resta es: " +unacalculadora.Resta());
 			break;
 		case 3 :
 			System.out.println("El resultado de la division es: " +unacalculadora.Division());
 			break;
 		case 4 :
 			System.out.println("El resultado de la multiplicacion es: " +unacalculadora.Multiplicacion());
 			break;
 		case 5 :
 			System.out.println("El resultado de la potencia es: " +unacalculadora.Potencia());
 			break;
 		case 6 :
 			System.out.println("El resultado de la raiz es: " +unacalculadora.Raiz());
 			break;
 		case 7 :
 			System.out.println("A salido del programa");
 			System.exit(0);
 			break;
 		default:
 			System.out.println("A seleccionado una opción incorrecta" +resultado);
 		}
	}
}

}
