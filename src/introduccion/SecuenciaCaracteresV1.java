package introduccion;
/*
 * Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en
punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por
el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
a --> @
e --> #
i --> $
o --> %
u --> *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */

import java.util.Scanner;

public class SecuenciaCaracteresV1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String texto;
		boolean intento = false;
		
		do {
			System.out.println("Ingrese un texto: ");
			texto = scan.nextLine();
			int ultimo = texto.length() - 1;// Posicion de ultimo caracter
			
			if (texto.substring(ultimo).equals(".")) { // Se comprueba que termine en punto el texto
				intento=true;
				System.out.println(codificacion(texto));
				
			} else {
				System.out.println("El texto ingresado no termina en punto, intentelo  nuevamente");
			}
		} while (intento == false);

	}

	public static String codificacion(String texto) {
		String letra;
		String nuevoTexto = "";
		for (int i = 0; i < texto.length(); i++) {

			letra = texto.substring(i, i + 1);
			
			switch (letra) {
			case "a":
			case "A":
				nuevoTexto = nuevoTexto + "@";
				break;
			case "e":
			case "E":
				nuevoTexto = nuevoTexto + "#";
				break;
			case "i":
			case "I":
				nuevoTexto = nuevoTexto + "$";
				break;
			case "o":
			case "O":
				nuevoTexto = nuevoTexto + "%";
				break;
			case "u":
			case "U":
				nuevoTexto = nuevoTexto + "*";
				break;
			default:
				nuevoTexto = nuevoTexto + letra;
			}
		}

		return nuevoTexto;

	}

}
