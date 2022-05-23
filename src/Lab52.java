import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab52 implements DoubleArrayReader, ArrayProcessor {
    @Override
    public double[] readOneDimensionalArray(File file) {
        return new double[0];
    }

    @Override
    public double[] readOneDimensionalArray(String fileName) {
        return new double[0];
    }

    @Override
    public double[][] readTwoDimensionalArray(File file) {
        try (Scanner in = new Scanner(file)) {
            int n = in.nextInt();
            double[][] arr = new double[n][n];
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr[i][j] = in.nextInt();
                }
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }
    @Override
    public double[][] readTwoDimensionalArray(String filename) {

        return readTwoDimensionalArray(new File(filename));
    }

    @Override
    public double calculate(double[] array) {
        return 0;
    }

    public double calculate(double[][] array) {
        int res = 0;
        for (int i = 0; i < array.length/2; i++) {
            for (int j = i; j < array.length-i ; j++ ) {
                if (array[i][j] % 3 == 0 && array[i][j] > 0) {
                    res += array[i][j];
                }
            }
        }
        for (int i = array.length-1; i >= array.length/2; i-- ) {
            for (int j = i; j >= array.length-i-1; j--) {
                if (array[i][j] % 3 == 0 && array[i][j] > 0) {
                    res += array[i][j];
                }
            }
        }
        return res;
    }

    @Override
    public void processArray(double[] array) {

    }

    @Override
    public void processArray(double[][] array) {

    }

}
