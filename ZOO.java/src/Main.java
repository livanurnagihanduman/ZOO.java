
public class Main {


    public static void baslikYazdir(){
        System.out.println("*********************************************\n" +
                "***ANİMAL GİRİŞ VE SORGULAMA PROGRAMI***\n" +
                "**********************************************");
    }

    public static void sonYazdir(){
        System.out.println("*********************************************\n" +
                "***PROGRAM SONLANDI***\n" +
                "**********************************************");
    }

    public static void main(String[] args) {

        baslikYazdir();

        Animal animal = new KaraAnimal();
        animal.gir("Duman","Kedi",2);

        SeaAnimal  animal1 = new SeaAnimal();
        animal1.gir("Moli","Balık",1);

        sonYazdir();




    }
}
