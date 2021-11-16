import java.util.Scanner;

public class quaCubo
{

	public static void main(String[] args)
	{
		int numDaIns;
		Scanner in = new Scanner(System.in);
		
		System.out.print("Dammi un numero: ");
		numDaIns = in.nextInt();
		
		Numero n = new Numero(numDaIns);
		Quadrato q = new Quadrato(n.getNumero());
		Cubo c = new Cubo(n.getNumero());
		
		System.out.println("Numero inserito: " + n.getNumero());
		System.out.println(n.getNumero() + "^2 = " + q.calcolo());
		System.out.println(n.getNumero() + "^3 = " + c.calcolo());
	}

}
