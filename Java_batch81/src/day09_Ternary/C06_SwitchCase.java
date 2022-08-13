package day09_Ternary;

public class C06_SwitchCase {
    public static void main(String[] args) {

        //scanner yerine input kullanabilirsin
        String input = "pazartesi";

        switch (input) {
            case "pazartesi":
                System.out.println("Hafta ici");
                break;
            case  "sali":
                System.out.println("Hafta ici");
                break;
            case "carsamba":
                System.out.println("Hafta ici");
                break;
            case "persembe":
                System.out.println("Hafta ici");
                break;
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli  gun ismi giriniz");
        }

//sonucu ayni olanlar icin kısayol



        switch (input) {
            case "pazartesi":

            case  "sali":

            case "carsamba":

            case "persembe":

            case "cuma":
                System.out.println("Hafta ici");
                break;

            case "cumartesi":

            case "pazar":
                System.out.println("Hafta sonu");
                break;

            default:
                System.out.println("Lutfen gecerli  gun ismi giriniz");
        }














    }

}
