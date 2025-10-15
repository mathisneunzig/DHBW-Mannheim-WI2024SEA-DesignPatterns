package ErikAndJessica;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       // Objekte die als Prototypen fungieren müssen einmalig instanziiert werden
       // i.d.R relativ Aufwendige Objekterzeugungen 
       Robot humanoidRobotPrototype = new Robot("black", 180, Type.HUMANOID, false, new String[] {"clean", "cook", "entertainment", "wash"});
       Robot medicineRobotPrototype = new Robot("white",100, Type.MEDICINE, false, new String[] {"support", "clean", "record", "diagnose"});
       Robot factoryRobotPrototype = new Robot("grey", 250, Type.FACTORY, false, new String[] {"weld", "inspect", "measure", "sort"});

       // Pattern wird häufig mit PrototypeRegistries verwendet, um schnell und einfach Kopien zu erzeugen
       // registry speichert zu jedem type den passenden Roboter in einer HashMap
       RobotPrototypeRegistry<Robot> registry = new RobotPrototypeRegistry<Robot>();
       registry.add(humanoidRobotPrototype.type, humanoidRobotPrototype);
       registry.add(medicineRobotPrototype.type, medicineRobotPrototype);
       registry.add(factoryRobotPrototype.type, factoryRobotPrototype);

        // neue Liste mit 100 Kopien eines Prototypen
        // schneller zugriff über Registry und einfaches kopieren über Prototype-Interface
        List<Robot> humanoidRobots = new ArrayList<Robot>();
        for (int i = 0; i<100; i++) {
            try {
                // getClone() erstellt eine kopie 
                Robot copy = registry.getClone(Type.MEDICINE);
                humanoidRobots.add(copy);
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                break;
            }
            
        }
        humanoidRobots.get(99).speak();

    }
}
