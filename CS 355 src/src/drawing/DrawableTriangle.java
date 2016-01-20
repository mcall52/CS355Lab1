package drawing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Point2D.Double;

import cs355.model.drawing.Triangle;

public class DrawableTriangle extends Triangle implements DrawableShape {

	public DrawableTriangle(Color color, Double a, Double b, Double c) {
		super(color, a, b, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g2g) {
		// TODO Auto-generated method stub
		int[] xpoints = new int[]{(int) this.getA().getX(), 
				(int) this.getB().getX(), (int) this.getC().getX()};
		int[] ypoints = new int[]{(int) this.getA().getY(), 
				(int) this.getB().getY(), (int) this.getC().getY()};
		g2g.fillPolygon(xpoints, ypoints, xpoints.length);
	}

}
