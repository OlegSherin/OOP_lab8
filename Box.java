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
		String text = "������ � �������: \n";
		int i = 0;
		for (Bewerage bewerage : bewerages) {
			i++;
			text += "" + i + ") " + bewerage.toString();
		}
		return text;
	}

	public String deleteBeweragesText() {
		String text = "�������� ������: \n";
		int i = 0;
		for (Bewerage bewerage : bewerages) {
			i++;
			text += "" + i + ") " + bewerage.toString();
		}
		return text;
	}
}
