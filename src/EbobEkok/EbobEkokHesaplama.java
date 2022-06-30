package EbobEkok;

import java.util.Scanner;

public class EbobEkokHesaplama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("1.Sayiyi Giriniz: ");
        int x = input.nextInt();
        System.out.print("2.Sayiyi Giriniz: ");
        int y = input.nextInt();

        int ebob;

        if(x<y){
            for (int i = x; x >= 1; i--){
                if (x % i == 0 && y % i == 0){
                    ebob=i;
                    System.out.println("Ebob: " + i);
                    break;
                }
            }
        } else {
            for (int k = y; k>=1; k--){
                if (x % k ==0 && y % k ==0){
                    ebob=k;
                    System.out.println("Ebob: " + k);
                    break;
                }
            }
        }
        int ekok;
        for (int t = 1; t <= (x*y); t++){
            if (t % x == 0 && t % y == 0){
                System.out.println("Ekok: " + t);
                break;
            }
        }
    }
}
