
/* Seanna Qin P.1
 * Programming Assignment #2 Pt.2, 9/30/22
 * The purpose of this program is to create a face that elongates horizontally as the scale increases.
 * The face will be deformed if the scale is lower than 3, but the scale can extend to any larger integer.
 */

public class AsciiArt {
	// Declare Class Constant
	public static final int SCALE = 5;
	
	// Static methods
	public static void main(String[] args) {
		border();
		center();
		border();

	}
	
	// Create face border
	public static void border() {
		System.out.print("|");
		for (int dash = 1; dash <= SCALE + (SCALE-3); dash++) {
			System.out.print("-");
		}
		System.out.println("|");
	}
	
	// Create face center
	public static void center() {
		System.out.print("|");
		for (int space = 0; space < SCALE-3; space++) {
			System.out.print(" ");
		}
		System.out.print("^_^");
		for (int space = 0; space < SCALE-3; space++) {
			System.out.print(" ");
		}
		System.out.println("|");
	}
}
