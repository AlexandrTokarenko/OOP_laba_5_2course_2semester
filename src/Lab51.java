import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab51 implements DoubleArrayReader, ArrayProcessor {
    @Override
    public double[] readOneDimensionalArray(String fileName) {
        return readOneDimensionalArray(new File(fileName));
    }

    @Override
    public double[][] readTwoDimensionalArray(File file) {
        return new double[0][];
    }

    @Override
    public double[][] readTwoDimensionalArray(String filename) {
        return new double[0][];
    }

    @Override
    public double[] readOneDimensionalArray(File file) {
        try (Scanner in = new Scanner(file)) {
            int n = in.nextInt();
            double[] arr = new double[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextDouble();
            }
            return arr;
        } catch (IOException ex) {
            System.err.println("Error reading file");
            return null;
        }
    }

    public double calculate(double[] array) {
        double one = 0;
        double two = 0;
        label1:
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                one = array[i];
                for (int j = array.length-1; j > i; j--){
                    if (array[j] > 0) {
                        two = array[j];
                        break label1;
                    }
                }
            }
        }
        return one - two;
    }

    @Override
    public double calculate(double[][] array) {
        return 0;
    }

    @Override
    public void processArray(double[] array) {

    }

    @Override
    public void processArray(double[][] array) {

    }
}
