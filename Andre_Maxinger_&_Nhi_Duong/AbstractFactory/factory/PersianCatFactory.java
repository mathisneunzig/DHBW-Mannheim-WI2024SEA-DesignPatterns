package factory;

import product.KnightCat;
import product.NinjaCat;
import product.PirateCat;

import product.persian.PersianKnightCat;
import product.persian.PersianNinjaCat;
import product.persian.PersianPirateCat;

public class PersianCatFactory implements CatFactory {

    public KnightCat createKnightCat() {
        return new PersianKnightCat();
    }

    public NinjaCat createNinjaCat() {
        return new PersianNinjaCat();
    }

    public PirateCat createPirateCat() {
        return new PersianPirateCat();
    }

}
