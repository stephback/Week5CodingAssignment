package week5CodingAssignmentSback;


public class App {

	public static void main(String[] args) {
		
		
		Logger logger = new AsteriskLogger();
		
		logger.Log("Hello");
		System.out.println();
		logger.Error("Hello");
		System.out.println();
		
		Logger spacedLogger = new SpacedLogger();
		
		spacedLogger.Log("Hello\n");
		System.out.println();
		spacedLogger.Error("Hello\n");
		System.out.println();
	}
	

}
