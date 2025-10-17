package factory;

public class CatFactoryHelper {
    public enum Breed {
        MAINE_COON,
        PERSIAN,
        SIAMESE
    }

    public static CatFactory getFactory(Breed breed) {
        switch (breed) {
            case MAINE_COON: return new MaineCoonCatFactory();
            case PERSIAN: return new PersianCatFactory();
            case SIAMESE: return new SiameseCatFactory();
            default: throw new IllegalArgumentException("Unknown breed");
        }
    }
}
