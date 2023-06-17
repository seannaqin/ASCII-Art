
/* Seanna Qin P.1
 * Programming Assignment #2, 9/30/22
 * The purpose of this program is to print a scalable space needle ASCII Art.
 */

public class SpaceNeedle {
	// Declare Class Constant
	public static final int SCALE = 4;
	
	// Call static methods
	public static void main(String[] args) {
		neck();
		pyramid();
		bowl();
		neck();
		body();
		pyramid();
	}
	
	// Create needle
	public static void neck() {
		// Number of lines = scale
		for (int i = 1; i <= SCALE; i++) {
			// Spacing = 3*scale
			for (int j = 1; j <= 3*SCALE; j++) {
				System.out.print(" ");
			}
			System.out.println("||");
		}
	}
	
	// Create top of head and bottom of Space Needle
	public static void pyramid() {
		// Number of colon pattern lines
		for (int i = 0; i < SCALE; i++) {
			// Spacing
			for (int space = 0; space < 3*(SCALE - i - 1); space++) {
				System.out.print(" ");
			}
			// Beginning slope
			System.out.print("__/");
			// Left colon pattern
			for (int colon = 0; colon < 3*i; colon++) {
				System.out.print(":");
			}
			// Middle split
			System.out.print("||");
			// Right colon pattern
			for (int colon = 0; colon < 3*i; colon++) {
				System.out.print(":");
			}
			// Ending slope
			System.out.println("\\__");
		}
		// Middle quotation mark line
		System.out.print("|");
		for (int rim = 1; rim <= SCALE*6; rim++) {
			System.out.print("\"");
		}
		System.out.println("|");
	}
	
	// Create bottom of head
	public static void bowl() {
		for (int i = 1; i <= SCALE; i++) {
			// Spacing
			for (int space = 1; space <= (i-1)*2; space++) {
				System.out.print(" ");
			}
			// Triangle pattern
			System.out.print("\\_");
			for (int triangle = 0; triangle <= SCALE*3 - i*2; triangle++) {
				System.out.print("/\\");
			}
			System.out.println("_/");
		}
	}
	
	// Create % body
	public static void body() {
		for (int i = 1; i <= SCALE*SCALE; i++) {
			// Spacing
			for (int space = 1; space <= 2*SCALE + 1; space++) {
				System.out.print(" ");
			}
				// Repeat pattern on left and right side
				for (int repeat = 1; repeat <= 2; repeat++) {
				System.out.print("|");
					for (int percent = 1; percent <= SCALE-2; percent++) {
						System.out.print("%");
					}
					System.out.print("|");				
			}
			System.out.println();
			
		}
	}
	
}
