/*
 * AUTOR: ABEL JORNET MOLERO
 * ULTIMA MODIFICACION: 24/01/2022
 */

public class MainSerieAPP {

	public static void main(String[] args) {

		Serie s1 = new Serie();
		Serie s2 = new Serie("Los mundos de Java", "Abel Jornet");
		Serie s3 = new Serie("Los mundos de Java", 5, "Comedia", "Abel Jornet");

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

	}
}
