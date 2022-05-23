public class Main {
    public static void main(String[] args) {

        Lab51 lab51 = new Lab51();
        double sum1 = lab51.calculate(lab51.readOneDimensionalArray("Lab51.txt"));
        System.out.println("Різниця першого та останнього додатних елементів масиву: " + sum1);

        Lab52 lab52 = new Lab52();
        double sum2 = lab52.calculate(lab52.readTwoDimensionalArray("Lab52.txt"));
        System.out.println("Сума елементів заштрихованої частини, які кратні 3: " + sum2);
    }
}
