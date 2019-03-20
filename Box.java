import java.util.*;

public class Box {

	LinkedList<Bewerage> bewerages = new LinkedList<>();

	public void addBewerage(Bewerage bewerage) {
		bewerages.add(bewerage);
	}

	public LinkedList<Bewerage> getBewerages() {
		return this.bewerages;
	}

	public String myBeweragesText() {
		String text = "Товары в корзине: \n";
		int i = 0;
		for (Bewerage bewerage : bewerages) {
			i++;
			text += "" + i + ") " + bewerage.toString();
		}
		return text;
	}

	public String deleteBeweragesText() {
		String text = "Удаление товара: \n";
		int i = 0;
		for (Bewerage bewerage : bewerages) {
			i++;
			text += "" + i + ") " + bewerage.toString();
		}
		return text;
	}
}
