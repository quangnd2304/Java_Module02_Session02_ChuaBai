public class Main {
    public static void main(String[] args) {
        //Hien thi 20 so nguyen to dau tien
        int cnt=0;
        int a = 2;
        System.out.println("20 so nguyen to dau tien la: ");
        do {
            //Kiem tra a co phai la so nguyen to hay khong
            boolean check = false;
            for (int i = 2; i <=Math.sqrt(a) ; i++) {
                if(a%i==0){
                    check = true;
                }
            }
            if(!check){
                //a la so nguyen to
                System.out.printf("%d\t",a);
                cnt++;
            }
            a++;
        }while(cnt!=20);
    }
}