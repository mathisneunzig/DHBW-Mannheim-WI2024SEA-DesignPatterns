package CatEnums;

public enum CatConsumable {
    DRY_FOOD("dry food"),
    WET_FOOD("wet food"),
    RAW_MEAT("raw meat"),
    SALMON("salmon"),
    TUNA("tuna"),
    SCRAMBLED_EGGS("scrambled eggs"),
    FOOD_LEFTOVERS("food leftovers"),
    WHOLE_CHICKEN("whole chicken"),

    TAP_WATER("tap water"),
    RAIN_WATER("rain water"),
    MILK("milk");
    private final String catConsumable;

    CatConsumable(String catConsumable){
        this.catConsumable = catConsumable;
    }

    @Override
    public String toString(){
        return catConsumable;
    }
}
