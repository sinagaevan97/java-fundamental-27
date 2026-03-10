public class Main {
    public static void main (String[]args){
        //subtotal
        //like count
        //tombol increment decrement
        //rata rata rating
        
        int modulus = 5 % 2;
        System.out.println(modulus);
        int x = 2;
        int num1=10*x++; //suffix
        System.out.println(num1);
        
        int y=2;
        int num2 = 10 * ++y; //prefix
        System.out.println(num2);

        int num3 = 10 + 5*5;
        System.out.println(num3);

        int a= 10000;
        int b = 5000;
        a+=b;//a= a +b
        System.out.println(a);

        //gerbanglogika
        //operator perbandingan
        //

        int z;
        z = 9;
        if (z <1) {
          System.out.println("minimal 1");
        }
            else {
                System.out.println("Total pembelian anda adalah"+z);
            }
            int belanja = 100000,discount = belanja/10;
        
            if (belanja >= 100000){
                belanja = belanja-discount;
                System.out.println("total yang harus di bayar adalah"+belanja);
            
            }
            else {
                System.out.println("total belanja yang harus di bayar adalah"+belanja);
            }
   
    
        
        int bilangan;
        bilangan= 11;
        if (bilangan % 2 == 1){
            System.out.println("bilangan ganjil");}
            else {
                System.out.println("bilangan genap");
            }
        
            //switch
            System.out.println("Pilih Menu:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Deposit");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Exit");
            System.out.println("Silahkan pilih menu");

            int menu=Scanner.nextInt();
            switch (menu){
                case 1:
                System.out.println("Cek Saldo");
                break;
                case 2:
                System.out.println("Deposit");
                break;
                case 3:
                break;
                System.out.println("tarik tunai");
                case 4:
                System.exit(status:0);
                break;
                default:
                    System.out.println("Tidak ada pilihan");
                    break;
            }
            
    }
    // operator ternary ? :

        String attrType = "password";

        String iconEye = attrType.equals("password") ? "Hide Password" : "Show Password";

        System.out.println(iconEye);
}
