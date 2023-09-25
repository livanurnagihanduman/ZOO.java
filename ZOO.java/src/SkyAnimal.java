import java.util.Scanner;
public class SkyAnimal extends Animal {

    private int kanatSayisi;

    public int getKanatSayisi() {
        return kanatSayisi;
    }
    public void setKanatSayisi(int kanatSayisi){
        this.kanatSayisi = kanatSayisi;
    }

    public Object gir(Object gir, String kedigiller, int i){
        Scanner key = new Scanner(System.in);
        System.out.println("Hayvanın ismini giriniz: ");
        String name = key.nextLine();
        setName(name);
        System.out.println("Hayvanın türünü girinzi: ");
        String tur = key.nextLine();
        setTur(tur);
        System.out.println("Hayvan sayısını giriniz: ");
        int zooNumber = key.nextInt();
        setZooNumber(zooNumber);
        System.out.println("Bu deniz hayvanı nerelerde yaşar? ");
        int kanatSayisi = key.nextInt();
        setKanatSayisi(kanatSayisi);

        return gir;
    }



}




