public class Axe extends AbstractTool{
    public Axe(MaterialInterface toolMaterial) {
        super(toolMaterial);
    }
    @Override
    public void use() {
        System.out.println("Chopping wood with "+super.toolMaterial.getMaterialName()+" Axe");
    }
}
