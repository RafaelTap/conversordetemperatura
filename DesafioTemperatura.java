package Desafios;

/**
 * JAVADOC essa classe representa um desafio de variáveis e constantes
 * utilizando as fórmulas de conversão de temperatura.
 * 
 * @author Rafael Taparica <rafael.taparica@protonmail.com>
 *
 */

public class DesafioTemperatura {

	public static void main(String[] args) {

		/*
		 * fórmula de conversão de fahrenheit para celsius: °C = (°F - 32) * 5/9.
		 */

		final double X = 32;
		final double Y = 5.0 / 9.0;
		double f = 96;

		double celcius = (f - X) * Y;
		System.out.printf("%.2f %s \n", celcius, "°C");

		f = 60;
		double celciusa = (f - X) * Y;
		System.out.printf("%.2f %s \n",celciusa, "°C");

		/*
		 * fórmula de conversão de celsius para fahrenheit: °F = (°C * 1.8) +32.
		 */

		final double A = 32;
		final double B = 1.8;
		double c = 35;

		double fahrenheit = c * B + A;
		System.out.println(fahrenheit + "°" + "F");

		c = -4;
		double farenheita = (c * B) + A;
		System.out.println(farenheita + "°" + "F");
		
		

	}

}
