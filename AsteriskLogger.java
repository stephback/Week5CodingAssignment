package week5CodingAssignmentSback;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		System.err.println(asterisks(error)+ "\n");
		System.err.println("***" + "ERROR: " + error + "***\n");
		System.err.println(asterisks(error) + "\n");
		}
		
	public String asterisks(String error) {
		String asteriskAdd = "";
		
		int asterisk = 13 + error.length(); //is there a way to loop through so this prints 13 character spaces?
		for(int i = 1; i <= asterisk; i++) {
		asteriskAdd += "*";
	}
		return asteriskAdd;
	}
}
