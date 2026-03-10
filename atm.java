import java.util.Scanner;

public class atm {

    static int saldo = 500000;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        if (login()) {
            int pilihan;

            do {
                System.out.println("\n=== MENU ATM ===");
                System.out.println("1. Cek Saldo");
                System.out.println("2. Setor Tunai");
                System.out.println("3. Tarik Tunai");
                System.out.println("4. Keluar");
                System.out.print("Pilih menu: ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        cekSaldo();
                        break;
                    case 2:
                        setor();
                        break;
                    case 3:
                        tarik();
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan ATM.");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                }

            } while (pilihan != 4);

        } else {
            System.out.println("Akun diblokir karena salah PIN 3 kali.");
        }
    }

    // Method Login dengan 3 percobaan
    static boolean login() {
        int pinBenar = 1234;
        int percobaan = 0;

        while (percobaan < 3) {
            System.out.print("Masukkan PIN: ");
            int pin = input.nextInt();

            if (pin == pinBenar) {
                System.out.println("Login berhasil!");
                return true;
            } else {
                percobaan++;
                System.out.println("PIN salah! Sisa percobaan: " + (3 - percobaan));
            }
        }

        return false;
    }
    //cek saldo
    static void cekSaldo() {
        System.out.println("Saldo Anda: Rp " + saldo);
    }
    //setor tunai
    static void setor() {
        System.out.print("Masukkan jumlah setor: ");
        int jumlah = input.nextInt();
        saldo += jumlah;
        System.out.println("Setor berhasil!");
        cekSaldo();
    }
    //tarik tunai
    static void tarik() {
        System.out.print("Masukkan jumlah tarik: ");
        int jumlah = input.nextInt();

        if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi!");
        } else {
            saldo -= jumlah;
            System.out.println("Penarikan berhasil!");
            cekSaldo();
        }
    }
}