package drawing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D.Double;

import cs355.model.drawing.Square;

public class DrawableSquare extends Square implements DrawableShape {

	public DrawableSquare(Color color, Double upperLeft, double size) {
		super(color, upperLeft, size);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g2g) {
		g2g.setColor(this.getColor());
		g2g.fillRect((int) this.getUpperLeft().getX(), (int) this.getUpperLeft().getY(),
				(int) this.getSize()/2, (int) this.getSize()/2);
	}

}
