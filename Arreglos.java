
public class Arreglos 
{
	
	public static void main(String[] args)
	{
		int[] enteros = {1,2,3,4,5,7,8,9};
		
		int actual = enteros[0];
		for(int i=1; i < enteros.length; i++)
		{
			 if(enteros[i] == (actual+1))
				 actual = enteros[i];
				 else
					 System.out.printf("El entero que falta es:%d",actual+1);
		}
	}

}
