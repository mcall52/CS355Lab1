package cs355.controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import cs355.GUIFunctions;
import cs355.model.drawing.CS355Drawing;
import cs355.model.drawing.DrawingModel;
import cs355.model.drawing.Line;
import cs355.model.drawing.Rectangle;
import cs355.model.drawing.Shape;
import cs355.model.drawing.Triangle;
import cs355.view.View;

public class Controller implements CS355Controller, MouseListener, MouseMotionListener {

	//private View view;
	private DrawingModel model;
	private Color curcolor;
	private View view;
	private enum CurShape{
		SELECT, CIRCLE, ELIPSE, LINE, SQUARE, RECTANGLE, TRIANGLE
	}
	
	private Point2D.Double firstclick = null;
	private Point2D.Double secondclick = null;
	private Point2D.Double thirdclick = null;
	
	private Point2D.Double startclick;
	private Point2D.Double endclick;
	
	private CurShape curshape;
	
	public Controller(View view){
		model = new DrawingModel();
		curshape = CurShape.SELECT;
		curcolor = Color.WHITE;
		this.view = view;
		view.addModel(model);
	}
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		Point2D.Double point = new Point2D.Double(arg0.getX(), arg0.getY());
		GUIFunctions.printf("Point Clicked: %s", point.toString());
		
		if(firstclick == null){
			firstclick = point;
		}
		else if(secondclick == null){
			secondclick = point;
		}
		else{
			thirdclick = point;
			createtriangle();
			clearpoints();
		}
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		Point2D.Double point = new Point2D.Double(arg0.getX(), arg0.getY());
		GUIFunctions.printf("Point Pressed: %s", point.toString());
		startclick = (Double) point.clone();
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		Point2D.Double point = new Point2D.Double(arg0.getX(), arg0.getY());
		GUIFunctions.printf("Point Released: %s", point.toString());
		endclick = (Double) point.clone();
		//Draw
		//make a shape
		switch (curshape){
			case LINE :			createline(); break;
			case RECTANGLE :	createrectangle(); break;
			case SQUARE :		createsquare(); break;
			case ELIPSE :		createelipse(); break;
			case CIRCLE :		createcircle(); break;
			//case TRIANGLE :		createtriangle(); break;
		}
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		Point2D.Double point = new Point2D.Double(arg0.getX(), arg0.getY());
		endclick = (Double) point.clone();
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void colorButtonHit(Color c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void lineButtonHit() {
		curshape = CurShape.LINE;
		clearpoints();
	}

	@Override
	public void squareButtonHit() {
		curshape = CurShape.SQUARE;
		clearpoints();
	}

	@Override
	public void rectangleButtonHit() {
		curshape = CurShape.RECTANGLE;
		clearpoints();
	}

	@Override
	public void circleButtonHit() {
		curshape = CurShape.CIRCLE;
		clearpoints();
	}

	@Override
	public void ellipseButtonHit() {
		curshape = CurShape.ELIPSE;
		clearpoints();
	}

	@Override
	public void triangleButtonHit() {
		curshape = CurShape.TRIANGLE;
		clearpoints();
	}

	@Override
	public void selectButtonHit() {
		curshape = CurShape.SELECT;
		clearpoints();
	}

	@Override
	public void zoomInButtonHit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void zoomOutButtonHit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hScrollbarChanged(int value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void vScrollbarChanged(int value) {
		// TODO Auto-generated method stub

	}

	@Override
	public void openScene(File file) {
		// TODO Auto-generated method stub

	}

	@Override
	public void toggle3DModelDisplay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(Iterator<Integer> iterator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void openImage(File file) {
		
	}

	@Override
	public void saveImage(File file) {
		// TODO Auto-generated method stub

	}

	@Override
	public void toggleBackgroundDisplay() {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveDrawing(File file) {
		model.save(file);
	}

	@Override
	public void openDrawing(File file) {
		model.open(file);
	}

	@Override
	public void doDeleteShape() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doEdgeDetection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSharpen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doMedianBlur() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doUniformBlur() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doGrayscale() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doChangeContrast(int contrastAmountNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doChangeBrightness(int brightnessAmountNum) {
		// TODO Auto-generated method stub

	}

	@Override
	public void doMoveForward() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doMoveBackward() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSendToFront() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doSendtoBack() {
		// TODO Auto-generated method stub

	}
	
	//Drawing methods
	private void createtriangle() {
		Triangle triangle = new Triangle(curcolor, firstclick, secondclick, thirdclick);
		model.addShape(triangle);
		clearpoints();
	}

	private void createcircle() {
		// Circle circle = new Circle(curcolor, center, radius);
		
	}

	private void createelipse() {
		// TODO Auto-generated method stub
		
	}

	private void createsquare() {
		// Square Square = new Square(curcolor, upperleft, size);
		
	}

	private void createrectangle() {
		//Rectangle rectangle = new Rectangle(curcolor, upperleft, width, height);
	}

	private void createline() {
		Line line = new Line(curcolor, startclick, endclick);
		model.addShape(line);
		clearpoints();
	}

	private void clearpoints() {
		// TODO Auto-generated method stub
		firstclick = null;
		secondclick = null;
		thirdclick = null;
		
		startclick = null;
		endclick = null;
	}
}
