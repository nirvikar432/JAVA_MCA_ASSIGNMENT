//Write a program to compute area of right angle triangle, equilateral triangle, 
// isosceles triangle using function overloading concept.

class Triangle {
    public double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public double calculateArea(double sideLength) {
        return (Math.sqrt(3) / 4) * sideLength * sideLength;
    }

    public double calculateArea(double base, double equalSide1, double equalSide2) {
        if (equalSide1 == equalSide2) {
            return 0.5 * base * Math.sqrt(equalSide1 * equalSide1 - (0.25 * base * base));
        } else {
            double s = (base + equalSide1 + equalSide2) / 2;
            return Math.sqrt(s * (s - base) * (s - equalSide1) * (s - equalSide2));
        }
    }
}

public class Question09 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        double rightAngleArea = triangle.calculateArea(5.0, 4.0);
        System.out.println("Area of right-angled triangle: " + rightAngleArea);

        double equilateralArea = triangle.calculateArea(6.0);
        System.out.println("Area of equilateral triangle: " + equilateralArea);

        double isoscelesArea = triangle.calculateArea(8.0, 6.0, 6.0);
        System.out.println("Area of isosceles triangle: " + isoscelesArea);
    }
}

/*
 * 
 * 
 * Area of right-angled triangle: 10.0
 * Area of equilateral triangle: 15.588457268119896
 * Area of isosceles triangle: 17.88854381999832
 * 
 */