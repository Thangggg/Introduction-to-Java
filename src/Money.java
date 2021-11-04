import java.util.Scanner;
public class Money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Nhập số tiền UDS muốn đổi");
        usd = scanner.nextDouble();
        double doi = usd * 23000;
        System.out.println(doi);

    }
}
