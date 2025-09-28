import CatEnums.*;

/**
 * @author Daniel Brecht<br><br>
 *
 *Objects of type {@code Cat} can only be created with a {@code CatBuilder}. <br><br>
 *
 *The {@code CatBuilder} is an Inner-Top-Level-Class and can be found at the top of the class {@code Cat}. <br><br>
 *
 *Example code to create an object of {@code Cat}: <br>
 *
 * <pre>{@code
 * Cat cat = new Cat.CatBuilder()
 *     .setName("Tommy")
 *     .setPersonality(CatPersonality.CUDLY)
 *     .build();
 * }</pre>
 */

public class Cat {

    public static class CatBuilder{
        private Cat cat = new Cat();

        /** This class is required to build a {@code Cat}. <br><br>
         *
         * For each attribute of type {@code Cat} there is a {@code CatBuilder} method to set that attribute. <br>
         * If you don´t set an attribute it will get set to it´s default value. <br><br>
         *
         * All {@code CatBuilder} setters return it´s own instance of {@code CatBuilder}
         * so you can call the setters on top of each others.<br><br>
         *
         * To get an Object of Tpye {@code Cat} you have to call the method {@code build} on top of the
         * {@code CatBuilder} instance.*/
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

        public CatBuilder setCatGender(CatGender gender){
            cat.setGender(gender);
            return this;
        }

        public CatBuilder setPersonality(CatPersonality personality){
            cat.setPersonality(personality);
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
    public static final CatGender DEFAULT_CAT_GENDER = CatGender.FEMALE;
    public static final CatPersonality DEFAULT_PEERSONALITY = CatPersonality.SLEEPY;
    public static final CatRace DEFAULT_RACE = CatRace.CHARTREUX;
    public static final CatFurColor DEFAULT_FUR_COLOR = CatFurColor.GREY;
    public static final CatFurPattern DEFAULT_FUR_PATTERN = CatFurPattern.STRIPED;
    public static final CatEyeColor DEFAULT_EYE_COLOR = CatEyeColor.BLUE;
    public static final CatToy DEFAULT_FAVOURITE_TOY = CatToy.LASER_POINTER;
    public static final CatConsumable DEFAULT_FAVOURITE_CONSUMABLE = CatConsumable.TUNA;

    private String name;
    private int age;
    private CatGender catGender;
    private CatPersonality personality;
    private CatRace race;
    private CatFurColor furColor;
    private CatFurPattern furPattern;
    private CatEyeColor eyeColor;
    private CatToy favouriteToy;
    private CatConsumable favouriteConsumable;

    private Cat(){
        name = DEFAULT_NAME;
        age = DEFAULT_AGE;
        catGender = DEFAULT_CAT_GENDER;
        personality = DEFAULT_PEERSONALITY;
        race = DEFAULT_RACE;
        furColor = DEFAULT_FUR_COLOR;
        furPattern = DEFAULT_FUR_PATTERN;
        eyeColor = DEFAULT_EYE_COLOR;
        favouriteToy = DEFAULT_FAVOURITE_TOY;
        favouriteConsumable = DEFAULT_FAVOURITE_CONSUMABLE;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public CatGender getGender() {
        return catGender;
    }

    private void setGender(CatGender catGender) {
        this.catGender = catGender;
    }

    public CatPersonality getPersonality() {
        return personality;
    }

    private void setPersonality(CatPersonality personality) {
        this.personality = personality;
    }

    public CatRace getRace() {
        return race;
    }

    private void setRace(CatRace race) {
        this.race = race;
    }

    public CatFurColor getFurColor() {
        return furColor;
    }

    private void setFurColor(CatFurColor furColor) {
        this.furColor = furColor;
    }

    public CatFurPattern getFurPattern() {
        return furPattern;
    }

    private void setFurPattern(CatFurPattern furPattern) {
        this.furPattern = furPattern;
    }

    public CatEyeColor getEyeColor() {
        return eyeColor;
    }

    private void setEyeColor(CatEyeColor eyeColor) {
        this.eyeColor = eyeColor;
    }

    public CatToy getFavouriteToy() {
        return favouriteToy;
    }

    private void setFavouriteToy(CatToy favouriteToy) {
        this.favouriteToy = favouriteToy;
    }

    public CatConsumable getFavouriteConsumable() {
        return favouriteConsumable;
    }

    private void setFavouriteConsumable(CatConsumable favouriteConsumable) {
        this.favouriteConsumable = favouriteConsumable;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", personality=" + personality +
                ", race=" + race +
                ", furColor=" + furColor +
                ", furPattern=" + furPattern +
                ", eyeColor=" + eyeColor +
                ", favouriteToy=" + favouriteToy +
                ", favouriteConsumable=" + favouriteConsumable +
                '}';
    }
}