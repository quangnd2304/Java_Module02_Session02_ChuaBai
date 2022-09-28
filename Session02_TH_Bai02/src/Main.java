import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Khai bao cac bien luu tru thong tin sinh vien
        String studentId = "",studentName="", phone="", email="", address="";
        int year=2022,age=0;
        boolean sex=false;
        do {
            System.out.println("**********MENU******************");
            System.out.println("1. Nhap thong tin sinh vien");
            System.out.println("2. Hien thi thong tin sinh vien");
            System.out.println("3. Tinh tuoi sinh vien");
            System.out.println("4. Thoat");
            System.out.print("Su lua chon cua ban: ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhap ma sinh vien: ");
                    studentId = sc.nextLine();
                    System.out.println("Nhap ten sinh vien: ");
                    studentName = sc.nextLine();
                    System.out.println("nhap vao nam sinh sinh vien:");
                    year = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhap vao gioi tinh sinh vien:");
                    sex = Boolean.parseBoolean(sc.nextLine());
                    System.out.println("Nhap vao so dien thoai cua sinh vien: ");
                    phone = sc.nextLine();
                    System.out.println("Nhap vao email cua sinh vien: ");
                    email = sc.nextLine();
                    System.out.println("Nhap vao dia chia cua sinh vien: ");
                    address = sc.nextLine();
                    break;
                case 2:
                    System.out.printf("Ma SV: %s - Ten SV: %s - Nam sinh: %d - Tuoi: %d\n",studentId,studentName,year,age);
                    System.out.printf("Gioi tinh: %b - SDT: %s - Email: %s - Dia chi: %s\n",sex,phone,email,address);
                    break;
                case 3:
                    age = 2022-year;
                    System.out.println("Da tinh tuoi sinh vien");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.err.println("Vui long nhap tu 1-4");
            }
        }while(true);

    }
}