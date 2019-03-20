import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

class Interface implements ActionListener {

	private JFrame frame;
	private JPanel panel;
	private JButton b1, b2;
	private TextArea ta;
	private Bewerage bwr;

	// Creation graphics interface program

	void interfaceGUI() {

		frame = new JFrame("Coffe & Tea");
		frame.setSize(600, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
		frame.add(panel);

		ta = new TextArea();
		ta.setBounds(20, 20, 550, 200);
		ta.setVisible(true);
		panel.add(ta);

		b1 = new JButton("Добавить товар в корзину");
		b1.setActionCommand("+");
		b1.setBounds(50, 220, 220, 30);
		b1.addActionListener(this);
		panel.add(b1);

		b2 = new JButton("Удалить товар из корзины");
		b2.setActionCommand("-");
		b2.setBounds(320, 220, 220, 30);
		b2.addActionListener(this);
		panel.add(b2);

		frame.setVisible(true);
	}

	Box box = new Box();

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {

		case "+":
			Random r = new Random();
			String[] itemsName = { "Чай ромашковый", "Каркаде", "чай мятный",
					"Кофе арабика", "Кофе робуста", "Чай зеленый", "Чай черный" };
			String[] packageVal = { "в коробке", "в мягкой упаковке",
					"в пакете", "в подарочной упаковке" };
			String nameValue = itemsName[r.nextInt(itemsName.length)];
			String weightValue = "" + r.nextInt(30);
			String packageValue = packageVal[r.nextInt(packageVal.length)];
			//
			bwr = new Bewerage(nameValue, weightValue, packageValue);
			box.addBewerage(bwr);
			ta.setText(box.myBeweragesText());
			break;

		case "-":
			box.bewerages.removeLast();
			ta.setText(box.deleteBeweragesText());
			break;

		}
	}
}
