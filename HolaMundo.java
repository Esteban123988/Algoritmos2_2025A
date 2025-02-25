import java.util.Scanner;

public class HolaMundo {

	public static void main  (String[]args)
	{
	System.out.println("Hola, Mundo");
	
	float peso, estatura, imc;
	Scanner miLector = new Scanner (System.in);
	//pedir peso
	System.out.println("ingrese su peso:\n");
	peso= miLector.nextFloat();
	
	//pedir estatura 
	System.out.println("ingrese su estatura:\n");
	estatura= miLector.nextFloat();
	// calcular IMC

	imc= peso/(estatura*estatura);
	
	//mostrarlo en pantalla 
	System.out.printf("su imc es %.2f\n",imc);
	// verificar en que rango esta:
	
	if(imc<=18.5)
	{
		System.out.println("ud esta con bajo peso ");
	}
	else 
	{
		if (imc >18.5 && imc <=24.9 )
		{
		System.out.println("ud tiene peso ideal");
		}
		else 
		{
			System.out.println("ud tiene sobrepeso");
		}

		}
	}
	
	}

