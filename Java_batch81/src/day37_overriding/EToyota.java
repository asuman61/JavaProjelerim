package day37_overriding;

public class EToyota extends DAraba{

    void marka(){
        System.out.println("Markamiz toyota");
        /* super.marka()
        eger hem overridden hem overriding metodun calışmasını istersel
        ilk satıra super.marka() yazabiliriz.
        once ondaki ozellikleri alalım sonra bizdekilwr calıssın diyosak
         */
    }

    void motor(){
        System.out.println("Toyota araclarToyota motorlar kullanır.");
    }


}
