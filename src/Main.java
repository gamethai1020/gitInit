import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		System.out.print("Enter your name : ");
		String name = inp.nextLine();
		Hello name1 = new Hello();
		name1.setName1(name);
		System.out.println(name1.toString());
	}

}
