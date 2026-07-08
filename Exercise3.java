
public class Exercise3 {
    public static void main(String[] args) {
        int rows = 5;
        int gap = 4; // Space between the two triangles
// ==========================
// Top Row
// ==========================
        for (int i = 1; i <= rows; i++) {
// Top-left (right-aligned upright)
            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
// Gap
            for (int j = 1; j <= gap; j++)
                System.out.print(" ");
// Top-right (left-aligned upright)
            for (int j = 1; j <= i; j++)
                System.out.print("*");
                System.out.println();
        }
            System.out.println();
// ==========================
// Bottom Row
// ==========================
        for (int i = rows; i >= 1; i--) {
// Bottom-left (right-aligned inverted)
            for (int j = 1; j <= rows - i; j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
// Gap
            for (int j = 1; j <= gap; j++)
                System.out.print(" ");
// ===========================================
// STUDENT CODE STARTS HERE
            for (int j = 1; j <= i; j++ )
                System.out.print("*");
// Print the bottom-right triangle.
// It should be an inverted triangle that
// mirrors the bottom-left triangle.
//
// Hint:
// Use a nested for loop to print '*' characters.
//
// STUDENT CODE ENDS HERE
// ===========================================
System.out.println();
            }
    }
}
