package Ex24_27;

public class Drone implements RemoteControl {
	
	private int speed;
	
	@Override
	public void turnOn() {
		System.out.println("Drone 전원을 켭니다.");
		
	}
	@Override
	public void turnOff() {
		System.out.println("Drone 전원을 끕니다.");
		
	}
	@Override
	public void setSpeed(int speed) {
		// 최고 속도 제한
		if( speed > RemoteControl.MAX_SPEED) {
			this.speed = RemoteControl.MAX_SPEED;
		}
		// 최소 속도 제한
		else if ( speed < RemoteControl.MIN_SPEED) {
			this.speed = RemoteControl.MIN_SPEED;
		}
		else {
			this.speed = speed;
		}
		System.out.println("현재 Drone 속도 : " + this.speed);
		
	}
	

}
