package CatEnums;

public enum CatPersonality {
    FRIENDLY("friendly"),
    ANGRY("angry"),
    SHY("shy"),
    CUDLY("cudly"),
    SLEEPY("sleepy"),
    HUNGRY("hungry"),
    NOSY("nosy"),
    MOODY("moody");

    private final String catPersonality;

    CatPersonality(String catPersonality){
        this.catPersonality = catPersonality;
    }

    @Override
    public String toString() {
        return catPersonality;
    }
}
