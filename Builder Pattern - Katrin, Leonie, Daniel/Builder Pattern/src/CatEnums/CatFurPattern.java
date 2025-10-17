package CatEnums;

public enum CatFurPattern {
    STRIPED("striped"),
    SPOTTED("spotted"),
    SOLID("solid"),
    TICKED("ticked"),
    BLOTCHED("blotched");
    private final String catFurPattern;

    CatFurPattern(String catFurPattern){
        this.catFurPattern = catFurPattern;
    }

    @Override
    public String toString(){
        return catFurPattern;
    }
}
