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
		Pet inPet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		RobotPet inRobo = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		
		check.printName(firstName,lastName);
		inPet.introduce();
		inRobo.introduce();
	}

}
