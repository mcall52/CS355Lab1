package drawing;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Point2D.Double;

import cs355.model.drawing.Line;

public class DrawableLine extends Line implements DrawableShape {

	public DrawableLine(Color color, Double start, Double end) {
		super(color, start, end);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(Graphics2D g2g) {
		g2g.setColor(this.getColor());
		g2g.drawLine((int)this.getStart().getX(), 
				(int)this.getStart().getY(), (int)this.getEnd().getX(), (int)this.getEnd().getY());
		
	}

}
