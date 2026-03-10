import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            if (i%2==1){
            System.out.println(i);}
        }
        //kotak
        int sisi=10; //5x5
        for (int i=0;i<sisi;i++){
            for (int j=0;j<sisi;j++){
            System.out.print("*");
            }
            System.out.println("*");
        }
        //segitiga
        int psisi=5;//5 X 5
        for (int i=0;i<psisi;i++){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        //segitiga siku siku terbalik
        int bsisi=5;//5 X 5
        for (int i=bsisi;i>=1;i--){

            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        //while
        int x = 0;
        while (x < sisi){
            System.out.println("x ="+x);
            x++;
        }
        //dowhile
        int y=0;
        do{
            System.out.println("y="+y);
            y++;
        } while (y <1);
         Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Silahkan input angka: ");

            int angka = scanner.nextInt();

            if (angka == 100) break; 

            //login 3xblokir
            String username="admin",password="Indonesia";
            
            System.out.println("Masukan username: ");

        String username = scanner.next();

        System.out.println("Masukan password: ");

        String password = scanner.next();

        if (username.equals("admin") && password.equals("Indonesia")) {

            System.out.println("Berhasil login");

        } else {

            System.out.println("Login gagal");

        }

        int batas = 3;

        boolean isBlocked = false;

        while (batas > 0) {

            System.out.println(batas);

            batas--;

        }

        if(isBlocked){

            System.out.println("Akun terblokir sementara hub cs");

        }
        }
    }
}
