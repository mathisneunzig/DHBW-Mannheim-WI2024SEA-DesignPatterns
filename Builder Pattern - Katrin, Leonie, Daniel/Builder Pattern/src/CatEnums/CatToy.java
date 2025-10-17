package CatEnums;

public enum CatToy {
    BALL_OF_YARN("ball of yarn"),
    CATNIP_MOUSE("catnip mouse"),
    LASER_POINTER("laser pointer"),
    BELL("bell"),
    FISHING_ROD_WITH_FEADER("fishing rod with feader");
    private final String catToy;

    CatToy(String catToy){
        this.catToy = catToy;
    }

    @Override
    public String toString(){
        return catToy;
    }
}
