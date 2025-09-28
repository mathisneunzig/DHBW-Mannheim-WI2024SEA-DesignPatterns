package CatEnums;

public enum CatFurColor {
    ORANGE("orange"),
    BROWN("brown"),
    BEIGE("beige"),
    WHITE("white"),
    GREY("grey"),
    BLACK("black");

    private final String catFurColor;

    CatFurColor(String catFurColor){
        this.catFurColor = catFurColor;
    }

    @Override
    public String toString(){
        return catFurColor;
    }
}
