package day07_ifStatement;

public class C02_ifStatements {
    public static void main(String[] args) {



    int sayi=10;

   if (sayi>0){
        System.out.println("sayi pozitif");
    }

   if (sayi%2 == 0) {
        System.out.println("sayi çift");

        //Basit if cümleleri kodun diğer parçalarından bağımsızdır.birdennfazla if cümlesi varsa şarta bağlı olarak tumunde if body si calısabilir, kısmen if boyleri çalısabilir veya hiçbir if body si çlısmayabilir.
       //anahtar gibi dugeye basarsan yanar basmazsan yanmaz
       //bir body nin nerde bittiğibni görmek istersen suslu parantez uzerine çift tıkla

       //Bir if statement ta curly braces kullanılmazsa Java ilk satırı bağlar, sonraki satırlar bağımsız kalır

       //Eğer birden fazla satır aynı if şartına bağlanmış ise mutlaka  curly brace i kullanmalıyız
    }
 }
}