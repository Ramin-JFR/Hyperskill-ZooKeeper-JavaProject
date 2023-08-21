import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int counter = 1;
        int b = 1;

        while (input >= counter * counter) {
            System.out.println(counter * counter);
            counter  += 1;

        }
    }
}