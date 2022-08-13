package day32_StringBuilder;

public class C02_Append {

    public static void main(String[] args) {

        //sb nin sonun bişe eklemek için append kullan
       StringBuilder sb=new StringBuilder("Java daha ne yapsin");
//listte indexlere ekleywbiliyosun burda o yok
       sb.append("?");  //string STRONG ne eklersen ekle sonuna uyar
        sb.append(true); //boolean ekleyebiliyosun

        System.out.println(sb);

        sb.insert(5, "herseyi dusunmus, "); //araya ekelem yapmak istediğimizde  append DEGİL INSERT kullanırız
        System.out.println(sb);

        sb.insert(22,"valla valla",5,11);
        System.out.println(sb);

 sb.append("Java",2,4);
        System.out.println(sb);










    }
}
