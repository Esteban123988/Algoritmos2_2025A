import java.util.Scanner;

public class Fabula {

	
	public static void main(String [] args)
	{
		
		int avance_t, avance_l, pasos_totales, pasos_t, pasos_l, distancia;
		Scanner lector = new Scanner(System.in);
		
		distancia = 10;
		avance_t = 0;
		avance_l = 0;
		
		
		//Pedir al usuario pasos dados por la tortuga y la liebre en cada interacion,
		//Mientras ninguno de los dos hayan llegado aún
		
		//Mientras avance_t < distancia && avance_t < distancia
		while( avance_t < distancia && avance_l < distancia) //!!!!
		{
		//pedir pasos de la tortuga:
		System.out.println("\nIngrese el numero de pasos que avanza la tortuga:");
		pasos_t = lector.nextInt();
		
		//Pedir pasos de la liebre:
		System.out.println("\nIngrese el numero de pasos que avanza la liebre:");
		pasos_l = lector.nextInt();
		
		//sumar pasos de la tortuga:
		avance_t = avance_t + pasos_t;
			
		//Sumar pasos de la liebre
		avance_l = avance_l + pasos_l;
		
		//Mostrar información
		System.out.printf("Tortuga ha avanzado %d, Liebre ha avanzado %d", avance_t, avance_l);
		}
		
		
		if(avance_l > avance_t)
		{
			System.out.println("\nGanó la liebre");
		}
		else
		{
			if(avance_t > avance_l)
			{
				System.out.println("\nGanó la tortuga");
			}
			else
			{
				System.out.println("\nHubo empate");
			}
		}
		
		
	}
	
}
