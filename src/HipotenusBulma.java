import java.util.Scanner;

public class HipotenusBulma {
    public static void main(String[] args) {
        int a,b;
        double c;
        Scanner deger = new Scanner(System.in);

        System.out.println("1.kenarı giriniz: ");
        a= deger.nextInt();

        System.out.println("2.kenarı giriniz: ");
        b= deger.nextInt();


         c=Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs : "+c);

    }
}
