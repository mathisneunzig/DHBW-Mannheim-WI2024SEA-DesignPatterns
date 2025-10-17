public class Pickaxe extends AbstractTool{
    public Pickaxe(MaterialInterface toolMaterial) {
        super(toolMaterial);
    }
    @Override
    public void use() {
        System.out.println("Mining Stone with "+super.toolMaterial.getMaterialName()+" Pickaxe");
    }
}
