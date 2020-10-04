// Taylor Series
import java.lang.Math;
import java.util.Scanner;

class TaylorSeries {
    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        else{
            return num * factorial(num - 1);
        }
    }
}
class Cosine extends TaylorSeries {
    static double computeSeries(double x, double numTerms) {
        x  = Math.toRadians(x);
        double approximation = 0;
        for (int i = 0; i < numTerms; i++) {
            double coefficient = Math.pow((-1), i);
            double numerator = Math.pow(x, (2 * i));
            double denominator = factorial(2 * i);
            approximation += (coefficient * (numerator / denominator));
        }
        return approximation;
    } 
}
class Exponential extends TaylorSeries {
    static double computeSeries(double x, double numTerms) {
        double approximation = 0;
        for (int i = 0; i < numTerms; i++) {
            double numerator = Math.pow(x, i);
            double denominator = factorial(i);
            approximation += (numerator / denominator);
        }
        return approximation;
    }
}
class Sine extends TaylorSeries {
    static double computeSeries(double x, double numTerms) {
        x = Math.toRadians(x);
        double approximation = 0;
        for (int i = 0; i < numTerms; i++) {
            double coefficient = Math.pow((-1), i);
            double numerator = Math.pow(x, (2 * i + 1));
            double denominator = factorial(2 * i + 1);
            approximation += (coefficient * (numerator / denominator));
        }
        return approximation;
    }
}
public class Exercise_11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cosine");
        System.out.println("Value for x: ");
        double x = sc.nextDouble();
        System.out.println("Number of terms: ");
        double numTerms = sc.nextDouble();
        double cos =  Cosine.computeSeries(x, numTerms);
        System.out.println("cosine " + x + " = " + cos);

        System.out.println();
        System.out.println("Exponential");
        System.out.println("Value for x: ");
        x = sc.nextDouble();
        System.out.println("Number of terms: ");
        numTerms = sc.nextDouble();
        double exp = Exponential.computeSeries(x, numTerms);
        System.out.println("exponential " + x + " = " + exp);

        System.out.println();
        System.out.println("Sine");
        System.out.println("Value for x: ");
        x = sc.nextDouble();
        System.out.println("Number of terms: ");
        numTerms = sc.nextDouble();
        double sin = Sine.computeSeries(x, numTerms);
        System.out.println("sin " + x + " = " + sin); 
        sc.close();
    }
}