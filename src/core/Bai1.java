package core;

import java.util.Locale;
import java.util.Scanner;

public class Bai1 {
    static String[] Check = new String[11];
    public static void One(int n){
        System.out.println(Check[n]);
    }

    public static void Two(int n){
        if (n < 20) System.out.println("Mười " + Check[n % 10].toLowerCase(Locale.ROOT));
        else{
            Check[0] = "";
            Check[1] = "mốt";
            System.out.println(Check[n / 10] + " mươi " + Check[n % 10].toLowerCase(Locale.ROOT));
        }
    }

    public static void TwoString(int n){
        if (n < 20) System.out.print("mười " + Check[n % 10].toLowerCase(Locale.ROOT));
        else{
            Check[0] = "";
            Check[1] = "mốt";
            System.out.print(Check[n / 10].toLowerCase(Locale.ROOT) + " mươi " + Check[n % 10].toLowerCase(Locale.ROOT));
        }
    }

    public static void Three(int n){
        if (n % 100 == 0){
            System.out.println(Check[n/100] + " trăm");
            return;
        }
        if (n % 100 <= 9){
            System.out.println(Check[n/100] + " trăm linh " + Check[n%100].toLowerCase(Locale.ROOT) );
            return;
        }

        if (n % 100 == 10){
            System.out.println(Check[n/100] + " trăm " + Check[n%100].toLowerCase(Locale.ROOT) );
            return;
        }
        System.out.print(Check[n/100] + " trăm ");
        TwoString(n%100);

    }

    public static void Excute(int n){
        Check[0] = "không";
        Check[1] = "Một";
        Check[2] = "Hai";
        Check[3] = "Ba";
        Check[4] = "Bốn";
        Check[5] = "Năm";
        Check[6] = "Sáu";
        Check[7] = "Bảy";
        Check[8] = "Tám";
        Check[9] = "Chín";
        Check[10] = "Mười";

        if (n <= 10) One(n);
        if (n > 10 && n < 100) Two(n);
        if (n >= 100) Three(n);


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Excute(n);


    }
}
