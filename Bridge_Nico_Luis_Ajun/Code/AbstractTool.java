

public abstract class   AbstractTool {
    protected MaterialInterface toolMaterial;
    public AbstractTool(MaterialInterface toolMaterial) {
        this.toolMaterial = toolMaterial;
    }
    public abstract  void use();
    public void info(){
        System.out.println("MiningSpeed: "+toolMaterial.getMiningSpeed());
        System.out.println("Damage: "+toolMaterial.getDamage());
        System.out.println("Material: "+toolMaterial.getMaterialName());
        System.out.println("AttackDamage: "+ toolMaterial.getDamage());
    }
}
