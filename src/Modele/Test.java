package Modele;

public class Test {

	public static void main(String[] args) {
		
		Modele modele = null;
		try {
			modele = new Modele(0, new IntegerObserver());
		} catch (IntegerOutOfRangeException e1) {
			System.out.println(e1.getMessage());
		}
		
		try {
			modele.setEntier(1);
		} catch (IntegerOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(modele.getEntier());
		
		try {
			modele.setEntier(0);
		} catch (IntegerOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(modele.getEntier());
		
		try {
			modele.setEntier(-1);
		} catch (IntegerOutOfRangeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println(modele.getEntier());
		
	}

}
