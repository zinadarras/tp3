package tp2;

public class mainlivre {
	public static void main(String[] args) {
		Livre tab[] =new Livre[4];
		tab[0]= new Livre ("L'alchimiste","Coelho",225);
		tab[1]= new Livre ("La Tunisie",508);
		tab[2]= new Livre ("Harry Potter","JK Rowling");
		tab[3]= new Livre ("abc","name",400,15);
		for (int i=0;i<4;i++) {
			System.out.println(tab[i]);
		}
		tab[1].setAuteur("Paulo Coelho");
		tab[2].setNbPages(461);
		tab[3].setPrix(100);
		tab[3].setPrix(100);
		for (int i=0;i<4;i++) {
			tab[i].decrire();
		}
		for (int i=0;i<4;i++) {
			System.out.println(tab[i].getAuteur());
		}
	}
	
}
