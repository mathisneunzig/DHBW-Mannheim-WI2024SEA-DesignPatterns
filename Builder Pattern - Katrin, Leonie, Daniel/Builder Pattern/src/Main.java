import CatEnums.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println(new Cat.CatBuilder().
                setName("Tommy").
                setAge(9).
                setPersonality(CatPersonality.CUDLY).
                setRace(CatRace.SIAM).
                setFurColor(CatFurColor.GREY).
                setFurPattern(CatFurPattern.SOLID).
                setEyeColor(CatEyeColor.BLUE).
                setFavouriteToy(CatToy.LASER_POINTER).
                setFavouriteConsumable(CatConsumable.SCRAMBLED_EGGS).
                build());
    }
}
