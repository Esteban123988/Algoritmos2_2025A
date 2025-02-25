import java.until.*;
import java.util.Scanner;

public class EjerciciosCiclos {

	
	public static void main(String[] args)
	{
		int tope, recolectado, num_personas, aporte_persona;
		Scanner lector = new Scanner(System.in);
		
		tope = 80000;
		recolectado = 0;
		System.out.println("Cuantas personas van a aportar?");
		num_personas = lector.nextInt();
		
		//Se va a apedir el aporte por el numero de personas
		for(int i=0; i < num_personas && recolectado < tope; i++)
		{
			//Pedir aporte:
			System.out.print("\nCuánto va a aportar?:");
			aporte_persona = lector.nextInt();
			//Sumario:
			recolectado = recolectado + aporte_persona;
			//Mostrar recolectado:
			/*
			System.out.printf("\nRecolectado hasta ahora:%d", recolectado);
			if(recolectado >= tope)
			{
				break;
			}
			*/
		}
		
		

}

}
