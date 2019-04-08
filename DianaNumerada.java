//Carolina Pérez Alvarado A01631526
import java.awt.Color;
import java.awt.Graphics;


public class DianaNumerada extends Diana {

	public DianaNumerada(int xPos, int yPos) {
		super(xPos, yPos);
	}
	public void pintaFigura(Graphics g) {
		super.pintaFigura(g);
		int nCirculos = 6;
		int radio = this.ancho / nCirculos;
		int d;
		int num = nCirculos - 1;
		for (int i = nCirculos; i > 0; i--) {
			d = radio * 2 * i;
			if (i % 2 == 0) {
				g.setColor(Color.WHITE);
				g.drawString(num + "", this.xPos + (ancho / 2), this.yPos + 15 + (ancho - d) / 2);

			}
			else if (i % 2 != 0 && i != 1){
				g.setColor(Color.BLACK);
				g.drawString(num + "", this.xPos + (ancho / 2), this.yPos + 15 + (ancho - d) / 2);
			}
			if (i == 1) {
				g.setColor(Color.WHITE);
				g.drawString(num + "", this.xPos + (ancho / 2) - 6, this.yPos + (ancho / 2));
			}
			num ++;
		}
	}
}
