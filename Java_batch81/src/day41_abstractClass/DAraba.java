package day41_abstractClass;

public abstract class DAraba {
    public  static void main(String[] args) {
        /*abstract class da main method opsiyoneldir
        Eğer abstract class sadece child classların
        tasımak zorunda oldugu ozellikleri belirlemek için
        olusturulduysa main methoda ihtiyac olmaz
        sadece abs. metodlar olur

        ama bir abs. metodda
        standart belirlemek dısında da methodlar calısbilir
        bu durumda ihtiyac olursa main method olusturulabilir

         */
    }

    public abstract void motor(); //abstract metodun bodysi olmaz.

    /*sadece child classların mecburi tasıyacakları ozellikleri belirleyen methodlar  abstract metod olur
    ve abstract metodların bodysi olmaz
     */

    protected abstract void yakit();
    protected abstract void kaporta ();


public void klima(){
    System.out.println("Bazı arabalarda klima olabilir.");

    /* abstract olmayan metodlara CONCRETE METOD denir
    abstract metodu abstract keywordle belirtmelisin.
    Concrete i belirtmene gerek yok. Sadece abstract olmayan metodlardan
    bahsetmek için conc kullanırın

    concrete---bodysi var
    abstract---body si yok
     */

    }



}
