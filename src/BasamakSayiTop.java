import java.util.Scanner;
public class BasamakSayiTop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayiyi giriniz : ");
        int sayi = input.nextInt();

        int bsmksysi = 0,toplam = 0;
        while(sayi != 0){
            toplam += (sayi % 10);
            sayi /= 10;
            ++bsmksysi;
        }
        System.out.println("Basamak sayisi : " + bsmksysi);
        System.out.println("Basamak sayilari toplami : " + toplam);
    }
}
