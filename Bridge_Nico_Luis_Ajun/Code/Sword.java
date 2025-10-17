public class Sword extends  AbstractTool {
    public Sword(MaterialInterface toolMaterial) {
        super(toolMaterial);
    }
    @Override
    public void use() {
        System.out.println("Attacking Mobs with "+ super.toolMaterial.getMaterialName()+" Sword");
    }
}
