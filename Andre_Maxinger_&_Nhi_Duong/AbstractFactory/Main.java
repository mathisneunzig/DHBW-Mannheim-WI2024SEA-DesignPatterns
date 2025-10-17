import factory.CatFactory;
import factory.CatFactoryHelper;

import product.KnightCat;
import product.NinjaCat;
import product.PirateCat;

public class Main {
    public static void main(String[] args) {
        CatFactory maineCoonFactory = CatFactoryHelper.getFactory(CatFactoryHelper.Breed.MAINE_COON);

        KnightCat maineCoonKnightCat = maineCoonFactory.createKnightCat();
        NinjaCat maineCoonNinjaCat = maineCoonFactory.createNinjaCat();
        PirateCat maineCoonPirateCat = maineCoonFactory.createPirateCat();

        maineCoonKnightCat.protect();
        maineCoonNinjaCat.sneak();
        maineCoonPirateCat.attack();

        System.out.println();

        CatFactory persianFactory = CatFactoryHelper.getFactory(CatFactoryHelper.Breed.PERSIAN);

        KnightCat persianKnightCat = persianFactory.createKnightCat();
        NinjaCat persianNinjaCat = persianFactory.createNinjaCat();
        PirateCat persianPirateCat = persianFactory.createPirateCat();

        persianKnightCat.protect();
        persianNinjaCat.sneak();
        persianPirateCat.attack();

        System.out.println();

        CatFactory siameseFactory = CatFactoryHelper.getFactory(CatFactoryHelper.Breed.SIAMESE);

        KnightCat siameseKnightCat = siameseFactory.createKnightCat();
        NinjaCat siameseNinjaCat = siameseFactory.createNinjaCat();
        PirateCat siamesePirateCat = siameseFactory.createPirateCat();

        siameseKnightCat.protect();
        siameseNinjaCat.sneak();
        siamesePirateCat.attack();
    }
}
