/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5_2;

/**
 *
 * @author Btavo
 */
public class RegularPolygonLab5 {

    private int n = 3;
    private double side = 1;
    private double x = 0;
    private double y = 0;

    public RegularPolygonLab5() {

    }

    public RegularPolygonLab5(int n, double side) {
        if (n < this.n || side <= this.side) {
            System.out.println("\t    Something went wrong?\nPlease Check that number of side > 2 and lenth > 0\n");
        } else {
            this.n = n;
            this.side = side;
        }
    }

    public RegularPolygonLab5(int n, double side, double x, double y) {
        if (n < this.n || side <= this.side) {
            System.out.println("\t    Something went wrong?\nPlease Check that number of side > 2 and lenth > 0\n");
        } else {
            this.n = n;
            this.side = side;
            this.x = x;
            this.y = y;
        }
    }

    public double getPerimeter() {
        return this.n * this.side;
    }

    public double getArea() {
        return (this.n * Math.pow(this.side, 2)) / (4 * Math.tan(Math.PI / this.n));
    }
}
