//Livanur Nagihan Duman
//Bilgisayar Mühendisliği
//2.sınıf
public abstract class Animal {

    private String name;
    private String tur;
    private int zooNumber;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getTur(){
        return tur;
    }
    public void setTur(String tur){
        this.tur = tur;
    }
    public int getZooNumber(){
        return zooNumber;
    }
    public void setZooNumber(int zooNumber){
        this.zooNumber = zooNumber;
    }

    public   abstract Object gir(Object girName, String tur, int i);



}
