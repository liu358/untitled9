package 输入输出流;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Fenxi {
    public static double getTotalScore(String s) {
        Scanner scanner = new Scanner(s);
        scanner.useDelimiter("[^0123456789.]+");
        double totalScore = 0;
        while (scanner.hasNext()) {
            try {
                double score = scanner.nextDouble();
                totalScore = totalScore + score;
            } catch (InputMismatchException exp) {
                String t = scanner.next();

            }
        }
        return totalScore;
    }
        public static double getAverageScore (String a){
            Scanner scanner = new Scanner(a);
            scanner.useDelimiter("[^0123456789.]+");
            double averageScore = 0;
            double count=3;
            while (scanner.hasNext()) {
                try {
                    double totalScore = scanner.nextDouble();

                    averageScore = totalScore / count;
                } catch (InputMismatchException exp) {
                    String t = scanner.next();

                }
            }
            return averageScore;
        }
    }
