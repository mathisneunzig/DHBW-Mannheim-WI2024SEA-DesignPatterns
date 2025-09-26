public class Iron  implements MaterialInterface {
    @Override
    public String getMaterialName() {
        return "Iron";
    }

    @Override
    public int getDurability() {
        return 250;
    }

    @Override
    public double getMiningSpeed() {
        return 4;
    }

    @Override
    public double getDamage() {
        return 3;
    }
}
