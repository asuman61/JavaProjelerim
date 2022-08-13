package rECAP_1;

import java.util.Scanner;

public class Q12_iFsTATEMENTS {
    public static void main(String[] args) {

        System.out.println("Lütfen iş ünvanınızı giriniz");
        Scanner scan=new Scanner(System.in);
        String jobTitle = scan.nextLine().toLowerCase();
        if(jobTitle.equals("qa")){
            System.out.println("Quality Analyst");
        }else if (jobTitle.equals("dev")){
            System.out.println("developer");
        }
       //AYNI SORUYU SWITCH CASE YÖNTEMİYLE ÇÖZELİM
        //switch case in avantajı tek body ile çok seçeneği çözebiliyosun

        switch (jobTitle){
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
            System.out.println("DEVELOPER");
                break;
            default:
                System.out.println("yanlis formatta job title girdiniz.");
        }





    }
}
