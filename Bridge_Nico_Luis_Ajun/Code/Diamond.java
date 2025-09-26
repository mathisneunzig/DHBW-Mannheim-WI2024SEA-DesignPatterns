public class Diamond implements MaterialInterface {


    @Override
    public String getMaterialName() {
        return "Diamond";
    }

    @Override
    public int getDurability() {
        return 1561;
    }

    @Override
    public double getMiningSpeed() {
        return 6;
    }

    @Override
    public double getDamage() {
        return 5;
    }
}
