import java.util.Scanner;

public class GradeStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        double[] grades = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        double average = calculateAverage(grades);
        double highest = calculateHighest(grades);
        double lowest = calculateLowest(grades);

        System.out.println("The average score is: " + average);
        System.out.println("The highest score is: " + highest);
        System.out.println("The lowest score is: " + lowest);
    }

    public static double calculateAverage(double[] grades) {
        if (grades.length == 0) {
            return 0.0; 
        }
        double sum = 0.0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    public static double calculateHighest(double[] grades) {
        double highest = Double.NEGATIVE_INFINITY;
        for (double grade : grades) {
            highest = Math.max(highest, grade);
        }
        return highest;
    }

    public static double calculateLowest(double[] grades) {
        double lowest = Double.POSITIVE_INFINITY;
        for (double grade : grades) {
            lowest = Math.min(lowest, grade);
        }
        return lowest;
    }
}
