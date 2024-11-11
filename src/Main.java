import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random generator = new Random();

        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = generator.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.printf("%d|", dataPoints[i]);
        }

        System.out.println(" ");
        int averageDataPoints = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            averageDataPoints += dataPoints[i];
        }
        averageDataPoints = averageDataPoints / dataPoints.length;
        System.out.println("The average of the random array dataPoints is: " + averageDataPoints);

    }
    int[] dataPoints = new int[100];
    Scanner in = new Scanner(System.in);
    int count = 0; //counts the amount of instances of matching value in array based on user input
    int num = safeInput.SafeInput.getRangedInt(in, "Enter a number between 1 and 100: ", 1, 100);



}