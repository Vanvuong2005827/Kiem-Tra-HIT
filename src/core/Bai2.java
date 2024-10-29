package core;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String Num="";
        String Word="";
        for (int i = 0; i < S.length()-1; i++) {
            if (S.charAt(i) <= '9' && S.charAt(i) >= '0') {
                Num +=  S.charAt(i) + ((S.charAt(i+1) > '9' || S.charAt(i+1) < '0') ? " " : "")  ;
            }

            if (S.charAt(i) > '9' || S.charAt(i) < '0') {
                Word += S.charAt(i) + ((S.charAt(i+1) <= '9' && S.charAt(i+1) >= '0') ? " " : "")  ;
            }

        }
       if (S.charAt(S.length()-1) > '9' || S.charAt(S.length()-1) < '0') Word += S.charAt(S.length()-1); else Num += S.charAt(S.length()-1);

       System.out.println(Num);
        System.out.println(Word);
    }
}
