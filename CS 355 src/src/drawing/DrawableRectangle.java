package drawing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D.Double;

import cs355.model.drawing.Rectangle;

public class DrawableRectangle extends Rectangle implements DrawableShape {

	public DrawableRectangle(Color color, Double upperLeft, double width, double height) {
		super(color, upperLeft, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g2g) {
		g2g.setColor(this.getColor());
		g2g.fillRect((int) this.getUpperLeft().getX(), (int) this.getUpperLeft().getY(), 
				(int) this.getWidth(), (int) this.getHeight());
	}

}
