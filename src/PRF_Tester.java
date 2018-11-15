import java.util.Scanner;

// TODO: Auto-generated Javadoc
/**
 * The Class PRF_Tester.
 */
public class PRF_Tester {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		String xString;
		String yString;
		if (args.length == 0) {
			System.out.println("Insert the X value: ");
			Scanner scan = new Scanner(System.in);
			xString = scan.nextLine();
			System.out.println("Insert the Y value: ");
			yString = scan.nextLine();
			scan.close();
		} else if (args.length == 2) {
			xString = args[0];
			yString = args[1];
		} else
			throw new IllegalArgumentException("Incorrect program arguments, check documentation");

		int x = Integer.parseInt(xString);
		int y = Integer.parseInt(yString);

		System.out.println(PRF.power(x, y));
	}
}
