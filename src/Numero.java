
public class Numero implements Ritorno
{
	private int numero;
	
	public Numero (int n)
	{
		this.numero = n;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	public int calcolo()
	{
		// qui non serve fare calcoli, mi limito a ritornare 0.
		return 0;
	}
}
