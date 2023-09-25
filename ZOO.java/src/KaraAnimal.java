import java.util.Scanner;
public class KaraAnimal extends Animal{
    private int  foot;
    private int yasam;

    public int getFoot(){
        return foot;
    }
    public void setFoot(int foot){
        this.foot = foot;
    }
    public int getYasam(){
        return yasam;
    }
    public void setYasam(int yasam){
        this.yasam = yasam;
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
        System.out.println("Etçil mi Otçul mu? ");
        int foot = key.nextInt();
        setFoot(foot);
        System.out.println("Hayvanın yaşam süresi nedir? ");
        int  yasam = key.nextInt();
        setYasam(yasam);

        return gir;
    }



}
