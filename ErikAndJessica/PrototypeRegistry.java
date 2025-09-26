package ErikAndJessica;

import java.util.HashMap;
import java.util.Map;

public class PrototypeRegistry<T>{
    private Map<String, Prototype<T>> prototypes = new HashMap<>();

    public void add(String key, Prototype<T> prototype){
        prototypes.put(key, prototype);

    }
    public T getClone(String key){
        Prototype<T> prototype = prototypes.get(key);
        if (prototype == null){
            System.out.println("Prototype not found");
            return null;
        } else {
            return (T) prototype.clone();
        } 
        

    }


}