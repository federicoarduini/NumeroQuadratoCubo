
public class Quadrato implements Ritorno
{
	private int numero;
	
	public Quadrato (int n)
	{
		this.numero = n;
	}
	
	public int getNumero()
	{
		return this.numero;
	}
	
	public int calcolo()
	{
		return (int) Math.pow(numero, 2);
	}
}
