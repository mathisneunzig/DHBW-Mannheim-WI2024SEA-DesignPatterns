public class Shovel extends AbstractTool {
    public Shovel(MaterialInterface toolMaterial) {
        super(toolMaterial);
    }
    @Override
    public void use() {
        System.out.println("Digging with "+super.toolMaterial.getMaterialName()+" Shovel ");
    }
}
