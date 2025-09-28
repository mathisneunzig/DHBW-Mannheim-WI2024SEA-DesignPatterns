package CatEnums;

public enum CatRace {
    CHARTREUX("chartreux"),
    SIAM("siam"),
    ABESSINIER("abessinier"),
    BENGAL("bengal"),
    SOMALI("somali"),
    TURKEY_ANGORA("turkey angora"),
    PERSER("perser"),
    RAGDOLL("ragdoll"),
    SIBERIAN("siberian");
    private final String catRace;

    CatRace(String catRace){
        this.catRace = catRace;
    }

    @Override
    public String toString(){
        return catRace;
    }
}
