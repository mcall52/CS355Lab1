package drawing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D.Double;

import cs355.model.drawing.Ellipse;

public class DrawableEllipse extends Ellipse implements DrawableShape {

	public DrawableEllipse(Color color, Double center, double width, double height) {
		super(color, center, width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g2g) {
		g2g.setColor(this.getColor());
		g2g.fillOval((int) this.getCenter().getX(), (int) this.getCenter().getY(), 
				(int) this.getWidth(), (int) this.getHeight());
	}

}
