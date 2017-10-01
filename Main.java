package HomeWorkLessonOneTaskThree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("** Please enter the coordinates as Integer for the first vector (X1,Y1,Z1; X2,Y2,Z2):");
        Scanner scanner = new Scanner(System.in);
        System.out.println("The X1 is equal: ");
        int x1 = scanner.nextInt();
        System.out.println("The Y1 is equal: ");
        int y1 = scanner.nextInt();
        System.out.println("The Z1 is equal: ");
        int z1 = scanner.nextInt();
        Vector3D a = new Vector3D(x1, y1, z1);

        System.out.println("** Now please do the same for the second vector (X1,Y1,Z1; X2,Y2,Z2):");
        Scanner vector2 = new Scanner(System.in);
        System.out.println("The X2 is equal: ");
        int x2 = scanner.nextInt();
        System.out.println("The Y2 is equal: ");
        int y2 = scanner.nextInt();
        System.out.println("The Z2 is equal: ");
        int z2 = scanner.nextInt();
        Vector3D b = new Vector3D(x2, y2, z2);
        scanner.close();

        System.out.println("So, for vectors " + a + " and " + b + ":");
        System.out.println();
        System.out.println("The sum is " + Vector3D.sumVectors(a, b));
        System.out.println("The scalar multiply is: " + Vector3D.scalmulVectors(a, b));
        System.out.println("And the vector product is: " + Vector3D.mulVectors(a, b));

    }
}
