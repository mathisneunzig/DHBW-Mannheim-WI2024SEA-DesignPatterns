package ErikAndJessica;

public class Roboter implements Prototype<Roboter>{
    
    String color;
    double height;
    String modell;
    boolean state;

    public  Roboter(String color, double height, String modell, boolean state){
        this.color = color;
        this.height = height;
        this.modell = modell;
        this.state = state;
    }

    public void changeState(){
        this.state = !this.state;
    }

    public void speak(){
        System.out.println("Ich bin vom Typ: "+ this.modell);
    }

    @Override
    public Roboter clone(){
        return new Roboter(this.color, this.height,this.modell, this.state);
    }

    
}
