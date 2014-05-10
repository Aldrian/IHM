package Extension;
import java.util.Observable;

/**
 * Modèle non observable
 * @author Gaëtan
 *
 */
public class Modele extends Observable{

	private int entier;

		
	/**
	 * Constructeur avec paramètre. Jette une exception IntegerOutOfRangeException si l'entier donné est inférieur à 0 o supérieur à 10
	 * @param entier
	 * @throws IntegerOutOfRangeException
	 */
	public Modele(int entier, IntegerObserver obs) throws IntegerOutOfRangeException {
		
		this.addObserver(obs);
		
		if(entier < 0 || entier > 10)
		{
			throw new IntegerOutOfRangeException();
		}
		else
		{
			this.entier = entier;
		}
	}

	public int getEntier() {
		return entier;
	}

	/**
	 * Setter. Jette une exception IntegerOutOfRangeException si l'entier donné est inférieur à 0 o supérieur à 10
	 * @param entier
	 * @throws IntegerOutOfRangeException
	 */
	public void setEntier(int entier) throws IntegerOutOfRangeException {
		if(entier < 0 || entier > 10)
		{
			throw new IntegerOutOfRangeException();
		}
		else
		{
			this.entier = entier;
			setChanged();
			notifyObservers();
		}
	}
	
	public void Plus() throws IntegerOutOfRangeException{
		if (entier >= 10)
		{
			throw new IntegerOutOfRangeException();
		}
		else
		{
			entier++;
			setChanged();
			notifyObservers();
		}
	}
	
	public void Moins() throws IntegerOutOfRangeException{
		if (entier <= 0)
		{
			throw new IntegerOutOfRangeException();
		}
		else
		{
			entier--;
			setChanged();
			notifyObservers();
		}
	}
	
	public void UpdateText(String textValue) throws IntegerOutOfRangeException{
		Integer tmp = new Integer(textValue);
		if(tmp < 0 || tmp > 10)
		{
			setChanged();
			notifyObservers();
			throw new IntegerOutOfRangeException();			
		}
		else
		{
			this.entier = tmp;
			setChanged();
			notifyObservers();
		}
		
	}
	
}
	
	

