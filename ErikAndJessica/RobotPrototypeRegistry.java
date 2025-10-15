package ErikAndJessica;

import java.util.HashMap;
import java.util.Map;

public class RobotPrototypeRegistry<T extends Prototype<T>>{
    private Map<Type, T> prototypes = new HashMap<>();

    public void add(Type key, T prototype){
        prototypes.put(key, prototype);

    }
    public T getClone(Type key){
        T prototype = prototypes.get(key);
        if (prototype == null){
          throw new IllegalArgumentException("No prototype registered for type: " + key.toString().toLowerCase());
        } else {
            return prototype.clone();
        } 
        
    }
}