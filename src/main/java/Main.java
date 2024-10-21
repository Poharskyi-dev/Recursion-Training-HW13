public class Main {
    public static void main (String[] args) {

        int number = 6;

        System.out.println(fibonachiNumber(2));

    }

    public static int fibonachiNumber(int number) {
        if (number <= 1) {
            return number;
        }

        return fibonachiNumber(number - 1) + fibonachiNumber(number - 2);
    }



}
