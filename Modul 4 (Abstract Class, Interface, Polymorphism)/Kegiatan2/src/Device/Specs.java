package Device;

public class Specs {
    private Laptop Asus;
    private String Specs1, Specs2, Specs3;

    public Specs(String Specs1, String Specs2, String Specs3, Laptop Asus){
        this.Specs1 = Specs1;
        this.Specs2 = Specs2;
        this.Specs3 = Specs3;
        this.Asus = Asus;
    }

    public Laptop getLaptop(){
        return Asus;
    }

    public Laptop getSpecs1(){
        return Asus;
    }
    
    public String getSpecs2(){
        return Specs2;
    }

    public String getSpecs3(){
        return Specs3;
    }

}
