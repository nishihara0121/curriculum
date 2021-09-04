package check;
import constants.Constants;
public class Check {
	private static String firstName = "西原";
    private static String lastName = "龍一";
	private static void printName(String firstName,String lastName) {
		System.out.println("printNameメソッド ⇨ " + (firstName + lastName));
	}

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Check check = new Check();
		Constants incon = new Constants();
		Pet inPet = new Pet(incon.CHECK_CLASS_JAVA, incon.CHECK_CLASS_HOGE);
		RobotPet inRobo = new RobotPet(incon.CHECK_CLASS_R2D2, incon.CHECK_CLASS_LUKE);
		
		check.printName(firstName,lastName);
		inPet.introduce();
		inRobo.introduce();
	}

}
