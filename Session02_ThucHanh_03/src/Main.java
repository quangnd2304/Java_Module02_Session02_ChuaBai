import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tim uoc chung lon nhat cua hai so a,b nhap tu ban phim
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu nhat: ");
        int a = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap so nguyen thu hai: ");
        int b = Integer.parseInt(sc.nextLine());
        if (a == b && a != 0) {
            System.out.println("Uoc chung lon nhat 2 so la: " + a);
        } else if (a == b && a == 0) {
            System.out.println("Hai so khong co uoc chung lon nhat");
        } else {
            while (a != b) {
                if (a > b) {
                    a -= b;
                } else {
                    b -= a;
                }
            }
            System.out.println("Uoc chung lon nhat cua 2 so la: "+a);
        }
    }
}