import CatEnums.*;

public class Cat {

    public static class CatBuilder{
        Cat cat = new Cat();
        public CatBuilder(){
        }

        public CatBuilder setName(String name){
            cat.setName(name);
            return this;
        }

        public CatBuilder setAge(int age){
            cat.setAge(age);
            return this;
        }

        public CatBuilder setRace(CatRace race){
            cat.setRace(race);
            return this;
        }

        public CatBuilder setFurColor(CatFurColor furColor){
            cat.setFurColor(furColor);
            return this;
        }

        public CatBuilder setFurPattern(CatFurPattern furPattern){
            cat.setFurPattern(furPattern);
            return this;
        }

        public CatBuilder setEyeColor(CatEyeColor eyeColor){
            cat.setEyeColor(eyeColor);
            return this;
        }

        public CatBuilder setFavouriteToy(CatToy favouriteToy){
            cat.setFavouriteToy(favouriteToy);
            return this;
        }

        public CatBuilder setFavouriteConsumable(CatConsumable favouriteConsumable){
            cat.setFavouriteConsumable(favouriteConsumable);
            return this;
        }

        public Cat build(){
            return cat;
        }
    }

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

    private Cat(){
        name = DEFAULT_NAME;
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

    public CatRace getRace() {
        return race;
    }

    public void setRace(CatRace race) {
        this.race = race;
    }

    public CatFurColor getFurColor() {
        return furColor;
    }

    public void setFurColor(CatFurColor furColor) {
        this.furColor = furColor;
    }

    public CatFurPattern getFurPattern() {
        return furPattern;
    }

    public void setFurPattern(CatFurPattern furPattern) {
        this.furPattern = furPattern;
    }

    public CatEyeColor getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(CatEyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    public CatToy getFavouriteToy() {
        return favouriteToy;
    }

    public void setFavouriteToy(CatToy favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public CatConsumable getFavouriteConsumable() {
        return favouriteConsumable;
    }

    public void setFavouriteConsumable(CatConsumable favouriteConsumable) {
        this.favouriteConsumable = favouriteConsumable;
    }
}
