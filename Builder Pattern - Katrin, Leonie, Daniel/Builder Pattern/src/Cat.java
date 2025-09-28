import CatEnums.CatPersonality;

public class Cat {

    private String name;
    private int age;
    private CatPersonality personality;


    public Cat(CatPersonality personality){
        this.personality = personality;
    }

    //private Cat(){}

    public static class CatBuilder{
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CatPersonality getPersonality() {
        return personality;
    }

    public void setPersonality(CatPersonality personality) {
        this.personality = personality;
    }
}
