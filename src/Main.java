import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner count = new Scanner(System.in);
        System.out.println("Nhập số cần đếm !");
        int number = count.nextInt();
        int soDau = number / 100;
        int x = number % 100;
        int soThuHai = x / 10;
        int soThuBa = x % 10;
        if (number < 10) {
            switch (number) {
                case 1:
                    System.out.println(" mot ");
                    break;
                case 2:
                    System.out.println(" hai ");
                    break;
                case 3:
                    System.out.println(" ba ");
                    break;
                case 4:
                    System.out.println(" bốn ");
                    break;
                case 5:
                    System.out.println(" năm ");
                    break;
                case 6:
                    System.out.println(" sáu ");
                    break;
                case 7:
                    System.out.println(" bẩy ");
                    break;
                case 8:
                    System.out.println(" tám ");
                    break;
                case 9:
                    System.out.println(" chín ");
                    break;
                case 0:
                    System.out.println("khong");

            }
        } else{
            switch (soDau) {
                case 1:
                    System.out.println(" mot tram");
                    break;
                case 2:
                    System.out.println(" hai tram");
                    break;
                case 3:
                    System.out.println(" ba tram");
                    break;
                case 4:
                    System.out.println(" bốn tram");
                    break;
                case 5:
                    System.out.println(" năm tram");
                    break;
                case 6:
                    System.out.println(" sáu tram");
                    break;
                case 7:
                    System.out.println(" bẩy tram");
                    break;
                case 8:
                    System.out.println(" tám tram");
                    break;
                case 9:
                    System.out.println(" chín tram");
                    break;

            }
        switch (soThuHai) {
            case 1:
                System.out.println(" muoi ");
                break;
            case 2:
                System.out.println(" hai muoi ");
                break;
            case 3:
                System.out.println(" ba muoi");
                break;
            case 4:
                System.out.println(" bốn muoi");
                break;
            case 5:
                System.out.println(" năm muoi");
                break;
            case 6:
                System.out.println(" sáu muoi");
                break;
            case 7:
                System.out.println(" bẩy muoi");
                break;
            case 8:
                System.out.println(" tám muoi");
                break;
            case 9:
                System.out.println(" chín muoi");
                break;
            case 0:
                System.out.println("linh");
                break;

        }
        switch (soThuBa) {
            case 1:
                System.out.println(" mot ");
                break;
            case 2:
                System.out.println(" hai ");
                break;
            case 3:
                System.out.println(" ba ");
                break;
            case 4:
                System.out.println(" bốn ");
                break;
            case 5:
                System.out.println(" năm ");
                break;
            case 6:
                System.out.println(" sáu ");
                break;
            case 7:
                System.out.println(" bẩy ");
                break;
            case 8:
                System.out.println(" tám ");
                break;
            case 9:
                System.out.println(" chín ");
                break;
            default:
                System.out.println("");
        }

        }
    }
}
