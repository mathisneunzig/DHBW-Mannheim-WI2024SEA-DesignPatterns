public class Main {
    public static void main(String[] args) {

        AbstractTool Axe = new Axe(new Iron());
        AbstractTool Sword = new Sword(new Diamond());
        AbstractTool Shovel = new Shovel(new Wood());
        AbstractTool Pickaxe = new Pickaxe(new Stone());

        Axe.use();
        Axe.info();
        System.out.println();

        Sword.use();
        Sword.info();
        System.out.println();

        Pickaxe.use();
        Pickaxe.info();
        System.out.println();

       Shovel.use();
       Shovel.info();
       System.out.println();


    }

}
