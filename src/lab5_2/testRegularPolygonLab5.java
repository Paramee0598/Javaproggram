/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2;

/**
 *
 * @author Bravo
 */
import java.util.Scanner;

public class testRegularPolygonLab5 {
//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        RegularPolygonLab5 shape;

        while (choice != 4) {
            System.out.println("\t   Menu");
            System.out.println("1\tRegularPolygon()");
            System.out.println("2\tRegularPolygon(n,side)");
            System.out.println("3\tRegularPolygon(n,side,x,y)");
            System.out.println("4\tExit");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    shape = new RegularPolygonLab5();
                    System.out.println("Perimeter : " + shape.getPerimeter());
                    System.out.println("Area : " + shape.getArea());
                    System.out.println("");
                    break;
                case 2: {
                    int n;
                    double side;
                    System.out.print("Input number of sides : ");
                    n = input.nextInt();
                    System.out.print("Input length of sides : ");
                    side = input.nextDouble();
                    shape = new RegularPolygonLab5(n, side);
                    System.out.println("Perimeter : " + shape.getPerimeter());
                    System.out.println("Area : " + shape.getArea());
                    System.out.println("");
                    break;
                }
                case 3: {
                    int n;
                    double side, x, y;
                    System.out.print("Input number of sides : ");
                    n = input.nextInt();
                    System.out.print("Input length of sides : ");
                    side = input.nextDouble();
                    System.out.print("Input x-coordinate : ");
                    x = input.nextDouble();
                    System.out.print("Input y-coordinate : ");
                    y = input.nextDouble();
                    shape = new RegularPolygonLab5(n, side, x, y);
                    System.out.println("Perimeter : " + shape.getPerimeter());
                    System.out.println("Area : " + shape.getArea());
                    System.out.println("");
                    break;
                }
                case 4:
                    System.out.println("Exit\n");
                    System.exit(0);
                default:
                    System.out.println("HRY!!! Choose 1-4 ONLY!!!\n");
                    break;
            }

        }
    }
}
