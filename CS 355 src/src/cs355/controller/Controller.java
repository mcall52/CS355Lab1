package cs355.controller;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.io.File;
import java.util.Iterator;

import cs355.GUIFunctions;

public class Controller implements CS355Controller, MouseListener, MouseMotionListener {

	@Override
	public void mouseClicked(MouseEvent arg0) {
		Point2D.Double point = new Point2D.Double(arg0.getX(), arg0.getY());
		GUIFunctions.printf("Point Clicked: %s", point.toString());
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
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		Point2D.Double point = new Point2D.Double(arg0.getX(), arg0.getY());
		GUIFunctions.printf("Point Released: %s", point.toString());
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public void squareButtonHit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void rectangleButtonHit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void circleButtonHit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ellipseButtonHit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void triangleButtonHit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void selectButtonHit() {
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

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
		// TODO Auto-generated method stub

	}

	@Override
	public void openDrawing(File file) {
		// TODO Auto-generated method stub

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

}
