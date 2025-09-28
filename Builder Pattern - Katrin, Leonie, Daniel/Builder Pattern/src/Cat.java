import CatEnums.*;

public class Cat {

    public static final String DEFAULT_NAME = "Mietzi";
    public static final int DEFAULT_AGE = 1;
    public static final CatPersonality DEFAULT_PEERSONALITY = CatPersonality.SLEEPY;
    public static final CatRace DEFAULT_RACE = CatRace.CHARTREUX;
    public static final CatFurColor DEFAULT_FUR_COLOR = CatFurColor.GREY;
    public static final CatFurPattern DEFAULT_FUR_PATTERN = CatFurPattern.STRIPED;
    public static final CatEyeColor DEFAULT_EYE_COLOR = CatEyeColor.BLUE;
    public static final CatToy DEFAULT_FAVOURITE_TOY = CatToy.LASER_POINTER;
    public static final CatConsumable DEFAULT_FAVOURITE_CONSUMABLE = CatConsumable.TUNA;

    private String name;
    private int age;
    private CatPersonality personality;
    private CatRace race;
    private CatFurColor furColor;
    private CatFurPattern furPattern;
    private CatEyeColor eyeColor;
    private CatToy favouriteToy;
    private CatConsumable favouriteConsumable;

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
