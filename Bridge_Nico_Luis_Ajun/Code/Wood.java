public class Wood  implements MaterialInterface {
    @Override
    public String getMaterialName() {
        return "Wood";
    }

    @Override
    public int getDurability() {
        return 59;
    }

    @Override
    public double getMiningSpeed() {
        return 1;
    }

    @Override
    public double getDamage() {
        return 1;
    }
}
