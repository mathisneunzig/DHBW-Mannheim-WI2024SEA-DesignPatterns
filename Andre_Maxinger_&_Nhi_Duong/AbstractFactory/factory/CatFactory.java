package factory;

import product.KnightCat;
import product.NinjaCat;
import product.PirateCat;

public interface CatFactory {
    KnightCat createKnightCat();
    NinjaCat createNinjaCat();
    PirateCat createPirateCat();
}