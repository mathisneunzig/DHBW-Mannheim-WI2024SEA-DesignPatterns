package ErikAndJessica;

public class Main {
    public static void main(String[] args) {
        Roboter robert = new Roboter("black", 1.80, "humanoid", false);
        Roboter robert2 = robert.clone();
        robert2.speak();
        
    }


}
