package factory;

import product.KnightCat;
import product.NinjaCat;
import product.PirateCat;

import product.mainecoon.MaineCoonKnightCat;
import product.mainecoon.MaineCoonNinjaCat;
import product.mainecoon.MaineCoonPirateCat;

public class MaineCoonCatFactory implements CatFactory {

    public KnightCat createKnightCat() {
        return new MaineCoonKnightCat();
    }

    public NinjaCat createNinjaCat() {
        return new MaineCoonNinjaCat();
    }

    public PirateCat createPirateCat() {
        return new MaineCoonPirateCat();
    }
    
}