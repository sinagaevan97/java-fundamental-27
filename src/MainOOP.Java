public class MainOOP {

    public static void main(String[] args) {
        
        Fruit orange = new Fruit();
        orange.grams = 1000/100;
        orange.calsPerGram = 47;
        System.out.println(orange.totalCalories());

        Fruit apple = new Fruit();
        apple.grams = 1500/100;
        apple.calsPerGram = 52;
        System.out.println(apple.totalCalories());

        Kotak kotak1 = new Kotak(5);
        kotak1.draw();
        System.out.println(kotak1.luas());

        Kotak kotak2 = new Kotak(10);
        kotak2.draw();
        System.out.println(kotak2.luas());

    }

}