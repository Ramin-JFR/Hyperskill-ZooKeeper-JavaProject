import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int element = scanner.nextInt();
        int largest = 0;
        while (element != 0) {
            if (largest < element) {
                largest = element;
            }
            element = scanner.nextInt();

        }
        System.out.println(largest);
    }
}