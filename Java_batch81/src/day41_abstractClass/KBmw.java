package day41_abstractClass;

public abstract class KBmw extends DAraba{

    /*
    BMW abstract bir classın
    abstract bir child ı oldugu için
    Parent classdaki abstract metodları implement etme
    zorunda kalmadı
    araba classındaki bodysi olmayan metodlar: ya kural koy ya kurala uy der
     */

    public abstract void amblem();
    public abstract void guvenlik();
}
