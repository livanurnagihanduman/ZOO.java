import java.util.Scanner;
public class SeaAnimal extends Animal{
    private String where;
    private String colour;

    public String getWhere(){
        return where;
    }
    public void setWhere(String where){
        this.where = where;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String colour){
        this.colour = colour;
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
        String where= key.nextLine();
        setWhere(where);
        System.out.println("Hayvan rengini giriniz: ");
        String colour = key.nextLine();
        setColour(colour);

        return gir;
    }



}



