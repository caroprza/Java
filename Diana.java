//Carolina Pérez Alvarado A01631526
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Diana extends JPanel{
	protected int xPos,
				  yPos,
				  ancho;
	protected Color colorCentro;
	
	public Diana(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.ancho = 200;
		this.colorCentro = Color.RED;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public Color getColorCentro() {
		return colorCentro;
	}
	public void setColorCentro(Color colorCentro) {
		this.colorCentro = colorCentro;
	}
	public void setPosicionInicial(int xPos, int yPos) {
		this.xPos = xPos;
		this.yPos = yPos;
	}
	public void pintaFigura(Graphics g) {
		int nCirculos = 6;
		int radio = this.ancho / nCirculos;
		int d;
		for (int i = nCirculos; i > 0; i--) {
			d = radio * 2 * i;
			if (i % 2 == 0) {
				g.setColor(Color.BLACK);
			}
			else {
				g.setColor(Color.WHITE);
			}
			if (i == 1) {
				g.setColor(Color.RED);
			}
			g.fillOval(this.xPos + (ancho - d) / 2, this.yPos + (ancho - d) / 2, d, d);
		}
	}
	
}
