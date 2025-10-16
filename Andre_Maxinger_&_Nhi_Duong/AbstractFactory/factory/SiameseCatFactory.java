package factory;

import product.KnightCat;
import product.NinjaCat;
import product.PirateCat;

import product.siamese.SiameseKnightCat;
import product.siamese.SiameseNinjaCat;
import product.siamese.SiamesePirateCat;

public class SiameseCatFactory implements CatFactory {
    
    public KnightCat createKnightCat() {
        return new SiameseKnightCat();
    }

    public NinjaCat createNinjaCat() {
        return new SiameseNinjaCat();
    }

    public PirateCat createPirateCat() {
        return new SiamesePirateCat();
    }

}