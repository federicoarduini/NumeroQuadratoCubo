
public class Cubo implements Ritorno
{
	private int numero;
	
	public Cubo (int n)
	{
		this.numero = n;
	}
	
	@Override
	public int getNumero()
	{
		return this.numero;
	}

	@Override
	public int calcolo()
	{
		return (int) Math.pow(numero, 3);
	}
}
