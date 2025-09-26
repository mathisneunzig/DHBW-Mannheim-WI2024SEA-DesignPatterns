public class Stone implements MaterialInterface {
    @Override
    public String getMaterialName() {
        return "Stone";
    }

    @Override
    public int getDurability() {
        return 131;
    }

    @Override
    public double getMiningSpeed() {
        return 2 ;
    }

    @Override
    public double getDamage() {
        return 2;
    }
}
