package nuc.hzb;

public class SayHelloWithTime {
	
	public String sayTime(String time) {
		SayHello sayHello = new SayHello();
		return sayHello.say("二九幂加八") + "," + time;
	}
}