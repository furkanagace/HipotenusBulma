import java.util.Scanner;
public class üçgenalan {
    public static void main(String[] args) {
        // Bu noktada kullanıcıdan alacağımız 3 adet değişkeni tanımlıyoruz.
        int a, b, c;
        double toplam, alan;

        // Kullanıcıdan Verileri Alıyoruz
        Scanner inp = new Scanner(System.in);
        System.out.print("1. Kenar Uzunluğunu Giriniz: ");
        a = inp.nextInt();

        System.out.print("2. Kenar Uzunluğunu Giriniz: ");
        b = inp.nextInt();

        System.out.print("3. Kenar Uzunluğunu Giriniz: ");
        c = inp.nextInt();

        // Formülleri entegre ediyoruz.

        toplam = (a + b + c)  / 2.0;
        alan = Math.sqrt(toplam*(toplam-a)*(toplam-b)*(toplam-c));
        System.out.println("Kenarları Verilen Üçgenin Alanı : " + alan);




    }
}