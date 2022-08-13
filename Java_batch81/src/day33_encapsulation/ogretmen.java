package day33_encapsulation;

public class ogretmen {

   private String isim;
   private String soyisim;
   private String brans;

   /*Bazen de yetkileri sınırlamak değil de yapılan
   işi daha iyi tanımlamak için encapsulation kullanılır


   Bu yaklasımı kullanan classlarda  tum
   variable lar private yapılıp
   hepsi için getter ve setter olusturulur
   */

   public String getBrans() {
      return brans;
   }

   public void setBrans(String brans) {
      this.brans = brans;
   }

   public String getIsim() {
      return isim;
   }
}
