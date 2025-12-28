package java9;

public class ProcessApiImprovement {

	public static void main(String[] args) {
		ProcessHandle processHandle = ProcessHandle.current();
		System.out.println("PID : " +   processHandle.pid());
	}
}
