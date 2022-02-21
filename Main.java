package ArrayNombre;

public class Main {

	public static void main(String[] args) {
		int[] array = {6,2,1,3,4,6,5,3,2,6,7,8,9,9,10,4,4,4,4,4,4,7,7,7,8,6,5,8,9,9};

		int cont1 = 0;

		int cont2 = 0;

		int suma = 0;

		float c = 0;

		c = suma/array.length;

		for (int i : array)

		{

		if(i >= 5)

		{

		cont1++;

		}

		else cont2++;

		}

		for (int x = 0 ;x<array.length; x++){

		suma = array[x] + suma;

		}



		System.out.println(" Tenemos " + cont1 + " aprovados y " + cont2 + " suspensos. La suma de las nota es " +suma+ " la media " + c);

		}



		}