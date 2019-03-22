//Carolina Pérez Alvarado A01631526
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel {
	int puntos = 16;
	double angulo = 0;
	int[] xs = new int[puntos];
	int[] ys = new int[puntos];
	int h = 0;

	public Panel() {
		super();
		this.setPreferredSize(new Dimension(400, 400));
		xs[0] = 200;
		ys[0] = 200;
		for (int i = 1; i < puntos; i++) {
			h += 10;
			xs[i] = (int) ((Math.cos(angulo) * h) + 200);
			ys[i] = (int) ((Math.sin(angulo) * h) + 200);
			angulo += (Math.PI/4);
		}

	}
	public void paintComponent(Graphics g) {
		g.drawPolyline(xs, ys, puntos);
	}
}
