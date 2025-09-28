import CatEnums.CatPersonality;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Cat(CatPersonality.CUDLY).getPersonality());
    }
}
