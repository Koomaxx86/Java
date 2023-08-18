package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;

public class Controller {
	
	@FXML							// fxml 의 요소와 자동 연결
	private Circle circle; 			// Main.fxml 의 컨트롤 요소의 fx:id="circle" 과 변수명 일치
	
	private double x;
	private double y;
	
	public void up(ActionEvent event) {
		circle.setCenterY(y-=10);
		System.out.println("UP");
	}
	
	public void down(ActionEvent event) {
		circle.setCenterY(y+=10);
		System.out.println("DOWN");
	}
	
	public void left(ActionEvent event) {
		circle.setCenterX(x-=10);
		System.out.println("LEFT");
	}
	
	public void right(ActionEvent event) {
		circle.setCenterX(x+=10);
		System.out.println("RIGHT");
	}

}
