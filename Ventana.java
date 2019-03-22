//Carolina Pérez Alvarado A01631526
import javax.swing.JFrame;

public class Ventana extends JFrame {
	public Ventana() {
		super("Canvas");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Panel pd = new Panel();
		this.add(pd);
		this.pack();
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Ventana ventana = new Ventana();
	}

}
