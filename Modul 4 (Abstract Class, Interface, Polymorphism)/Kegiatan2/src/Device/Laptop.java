package Kegiatan2.src.Device;

public class Laptop {
    private String Name;
    private String Specs1;

    public Laptop(String Name, String Specs1){
        this.Name = Name;
        this.Specs1 = Specs1; 
    }

    public String getName(){
        return Name;
    }

    public String getSpecss1(){
        return Specs1;
    }
}
