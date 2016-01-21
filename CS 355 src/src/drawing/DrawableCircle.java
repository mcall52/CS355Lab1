package drawing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D.Double;

import cs355.model.drawing.Circle;

public class DrawableCircle extends Circle implements DrawableShape {

	public DrawableCircle(Color color, Double center, double radius) {
		super(color, center, radius);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g2g) {
		g2g.setColor(this.getColor());
		g2g.fillOval((int) this.getCenter().getX(), (int) this.getCenter().getY(), 
				(int) this.getRadius() * 2, (int) this.getRadius() * 2);
	}

}
