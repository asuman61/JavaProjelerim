package day41_abstractClass;

public class HA160 extends  FMercedes {
    /*Abstract silsilesinden gelen ilk
       concrete class Parentı olan tum classdaki abstract metodları
       concrete hale donusturmek (override etm) zorundadır

       Bu kuralın istisnası
       parent classlardan herhangi birinde
       concrete hale donusturulmus abstract metodlardır.



     */
    public static void main(String[] args) {

        HA160 arb1=new HA160();
        //Concrete bir classdan istediğimiz obj. i uretebiliriz

        FMercedes arb2=new FMercedes();
        //Mercedes de concrete




       //!! EToyota arb3=new EToyota() {

        EToyota arb4=new GCorolla(); //Sorun yok
       //Abstract classlar constructor barındıır ama obj. uretemezler
        //toyota classı abs. oldugundan obj. uretemedi


        //abstract bir classın ozelliklerini tasıyan bir obj olusturmak istediğimizde
        //data turunu istediğimiz abs. class
       // constrctr ı ise child ı olan bir concrete classdan secmeliyiz


        }





    }

