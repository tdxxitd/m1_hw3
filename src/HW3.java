import java.util.Random;

public class HW3 {
        public static void main(String[] args) {

                double[] array = new double[15];
                Random random = new Random();

                array[0] = 1 + random.nextDouble() * 9;
                array[1] = 1 + random.nextDouble() * 9;

                for (int i = 2; i < array.length; i++) {
                        array[i] = (random.nextBoolean() ? 1 : -1) * (1 + random.nextDouble() * 9); // Число от -10 до 10
                }

                // Выводим массив
                System.out.print("Сгенерированный массив: ");
                for (double num : array) {
                        System.out.printf("%.2f ", num);
                }
                System.out.println();

                boolean firstNegativeFound = false;
                double positiveSum = 0;
                int positiveCount = 0;

                for (double number : array) {
                        if (firstNegativeFound) {
                                if (number > 0) {
                                        positiveSum += number;
                                        positiveCount++;
                                }
                        } else if (number < 0) {
                                firstNegativeFound = true;
                        }
                }

                if (positiveCount > 0) {
                        double average = positiveSum / positiveCount;
                        System.out.printf("Среднее арифметическое положительных чисел после первого отрицательного: %.2f%n", average);
                } else {
                        System.out.println("Нет положительных чисел после первого отрицательного.");
                }
        }
}