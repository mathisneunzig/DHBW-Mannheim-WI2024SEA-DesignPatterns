package CatEnums;

public enum CatEyeColor {
    BLUE("blue"),
    ORANGE("orange"),
    GREY("grey"),
    YELLOW("yellow"),
    GREEN("green"),
    BROWN("brown");

    private final String catEyeColor;

    CatEyeColor(String catEyeColor){
        this.catEyeColor = catEyeColor;
    }

    @Override
    public String toString(){
        return catEyeColor;
    }
}
