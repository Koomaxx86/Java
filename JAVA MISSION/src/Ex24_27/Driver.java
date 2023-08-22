package Ex24_27;

import java.util.Scanner;

public class Driver {
	
	static int speed = 0;
	static Scanner sc = new Scanner(System.in);
	
	// 구동 프로그램 시작
	// 드론 : 모터 온, 속도 빠르게, 속도 느리게, 모터 오프, 배터리 교환
	// RC카 : 시동걸기, 속도 빠르게, 속도 느리게, 시동끄기, 배터리 교환
	
	public static void main(String[] args) {
		// 드론조작
		RemoteControl drone = new Drone();
		drone.turnOn();
		drone.setSpeed(200);
		drone.setSpeed(30);
		drone.turnOff();
		RemoteControl.changeBattery();
		System.out.println();
		
		// rc카 조작
		RemoteControl rcCar = new RcCar();
		rcCar.turnOn();
		rcCar.setSpeed(100);
		rcCar.setSpeed(50);
		rcCar.turnOff();
		RemoteControl.changeBattery();
		
	}
	
	
	
	
	
	
}
