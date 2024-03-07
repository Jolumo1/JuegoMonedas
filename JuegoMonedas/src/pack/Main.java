package pack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		int menu = 0;
		while (menu != 2) {

			System.out.println();
			System.out.println("*****************************");
			System.out.println(" 💰 EL JUEGO DE LAS MONEDAS 💰 ");
			System.out.println("*****************************");
			System.out.println("1. Jugar");
			System.out.println("2. Salir");
			System.out.println();
			System.out.print("Seleccione una opción: ");

			try {
				menu = entrada.nextInt();
				switch (menu) {
				case 1:
					System.out.println("A jugarrrr... ");
					jugar();
					System.out.println();
					break;
				case 2:
					System.out.println("Hasta luego...");
					break;
				default:
					System.out.println("Debes seleccionar un número.");
				}
			} catch (Exception e) {
				System.out.println("Error, Debes ingresar un número entero.");
				entrada.nextLine(); // soluciona errores en el escaner
			}
		}

	}// FIN MAIN

	public static void jugar() {

		// creamos un arraylist de monedas para ir guardando las monedas generadas
		ArrayList<Moneda> secuencia = new ArrayList<>();

		// añadimos la primera moneda a la colección
		secuencia.add(generarMoneda());

		// Creamos un bucle que crea monedas y compara el valor o la posicion con la
		// moneda que ya hay, si coincide alguno de los dos campos, la introduce en la
		// colección y si no, se repìte hasta que suceda
		// Repetimos eso 5 veces con el bucle for para tener un total de 6 monedas.

		for (int i = 0; i < 5; i++) {

			boolean monedaIncluida = false;

			while (monedaIncluida == false) {
				Moneda nuevaMoneda2 = generarMoneda();

				if (secuencia.get(i).getValor().equals(nuevaMoneda2.valor)
						|| secuencia.get(i).getPosicion().equals(nuevaMoneda2.posicion)) {

					secuencia.add(nuevaMoneda2);
					monedaIncluida = true;

				} else {
					nuevaMoneda2 = generarMoneda();
				}
			}

		}

		// uso un for each para recorrer el arrayList y usar el metodo imprimir monedas
		// en cada vuelta, ya que el toString directo al arrayList da un resultado muy
		// feo

		for (Moneda moneda : secuencia) {
			moneda.imprimirMonedas();
		}

		dibujo();
		
		
	}

	public static Moneda generarMoneda() {

		Random aleatorio = new Random();

		String[] valores = { "1 centimo", "2 centimos", "5 centimos", "10 centimos", "25 centimos", "50 centimos",
				"1 euro", "2 euros" };
		String[] posiciones = { "cara", "cruz" };

		Moneda nuevaMoneda = new Moneda(valores[aleatorio.nextInt(valores.length)],
				posiciones[aleatorio.nextInt(posiciones.length)]);

		return nuevaMoneda;

	}

	
	public static void dibujo() {
		
		
		System.out.println("                ______________");
		System.out.println("    __,.,---'''''              '''''---..._");
		System.out.println(" ,-'             .....:::''::.:            '`-.");
		System.out.println("'           ...:::.....       '");
		System.out.println("            ''':::'''''       .               ,");
		System.out.println("|'-.._           ''''':::..::':          __,,-");
		System.out.println(" '-.._''`---.....______________.....---''__,,-");
		System.out.println("      ''`---.....______________.....---''");
		
		
	}
	
}
