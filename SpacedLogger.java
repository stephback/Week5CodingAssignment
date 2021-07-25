package week5CodingAssignmentSback;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		
		for(int i = 0; i < log.length(); i++) {
			
			System.out.print(log.charAt(i) + " ");
		}
			
		
	}

	@Override
	public void Error(String error) {
		
		System.err.print("ERROR: "); //the System.err.print prints red error messages
		
		for(int i = 0; i < error.length(); i++) {
			
			System.err.print(error.charAt(i) + " ");
		}
			
	}
		
}
