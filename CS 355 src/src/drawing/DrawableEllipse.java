package drawing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import cs355.model.drawing.Ellipse;

public class DrawableEllipse extends Ellipse implements DrawableShape {
	
	private Point2D.Double upperleft;

	public DrawableEllipse(Color color, Double center, double width, double height) {
		super(color, center, width, height);
		// TODO Auto-generated constructor stub
		this.upperleft = new Point2D.Double(center.getX() - (width/2), center.getY() - (height/2));
	}

	@Override
	public void draw(Graphics2D g2g) {
		g2g.setColor(this.getColor());
		g2g.fillOval((int) upperleft.getX(), (int) upperleft.getY(), 
				(int) this.getWidth(), (int) this.getHeight());
	}

}
