import CatEnums.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Cat> myLittleCatTroop = new ArrayList<Cat>();

        myLittleCatTroop.add(new Cat.CatBuilder().
                setName("Tommy").
                setAge(9).
                setCatGender(CatGender.MALE).
                setPersonality(CatPersonality.CUDLY).
                setRace(CatRace.SIAM).
                setFurColor(CatFurColor.GREY).
                setFurPattern(CatFurPattern.SOLID).
                setEyeColor(CatEyeColor.BLUE).
                setFavouriteToy(CatToy.LASER_POINTER).
                setFavouriteConsumable(CatConsumable.SCRAMBLED_EGGS).
                build());

        myLittleCatTroop.add(new Cat.CatBuilder().
                setCatGender(CatGender.FEMALE).
                setPersonality(CatPersonality.NOSY).
                build());

        myLittleCatTroop.add(new Cat.CatBuilder().
                setName("Mimi").
                setFavouriteConsumable(CatConsumable.MILK).
                setAge(2).
                setEyeColor(CatEyeColor.YELLOW).
                build());

        myLittleCatTroop.add(new Cat.CatBuilder().
                setName("Luna").
                setCatGender(CatGender.FEMALE).
                setFavouriteToy(CatToy.CATNIP_MOUSE).
                build());

        myLittleCatTroop.add(new Cat.CatBuilder().
                setName("Sunny").
                setAge(3).
                setPersonality(CatPersonality.MOODY).
                setFurColor(CatFurColor.ORANGE).
                setFurPattern(CatFurPattern.STRIPED).
                setCatGender(CatGender.MALE).
                setEyeColor(CatEyeColor.GREEN).
                setFavouriteToy(CatToy.BALL_OF_YARN).
                setFavouriteConsumable(CatConsumable.WHOLE_CHICKEN).
                build());

        for (Cat cat : myLittleCatTroop){
            System.out.println(cat);
        }
    }
}
