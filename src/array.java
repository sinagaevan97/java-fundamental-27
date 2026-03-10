import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        int angka[] ={1,2,3,4,5}; // array mulai dari n0
        System.out.println(angka[3]);//munculkan data baris ke 3
        
        int number[] = new int[5];
        number[0] = 80;
        number[1] = 82;
        number[2] = 84;
        number[3] = 86;
        number[4] = 88;
        number[3] = 90;
        System.out.println(number[4]);
        int sum=0;
        for (int i =0; i< number.length; i++){
            System.err.println(number[i]);
            sum +=number[i];
        }
        System.out.println("Jumlah = "+sum);
    System.err.println("Foreach");
        for (int numbers : number){
            System.out.println(number);
        }
        String products[] = {"Asus","Zotac","Msi","Gigabyte"};
        for (String product : products){
            System.out.println(product.toUpperCase());
            }

            

            Scanner scanner = new Scanner(System.in);
            System.out.println("Masukkan Jumlah Data :");
            int jumlah = scanner.nextInt();
            int prices[] = new int[jumlah];
            for (int i = 0 ; i<prices.length; i++){
                System.err.println("Masukkan Harga : ");
                prices[i] = scanner.nextInt();

                System.out.println(prices);

               
            }
            String cities[] = {"Jakarta", "Medan", "Surabaya", "Bali", "Bandung"};

        String kotaTerpanjang = "";

        int index = 0;

        for (int i = 0; i < cities.length; i++) {

            if(cities[i].length() > kotaTerpanjang.length()){

                kotaTerpanjang = cities[i];

                index = i;

            }

        }

        System.out.println(kotaTerpanjang+" index ke "+index);
             
    }
            
}
