package CatEnums;

public enum CatGender {
    FEMALE("female"),
    MALE("male");
    private final String gender;

    CatGender(String gender){
        this.gender = gender;
    }

    @Override
    public String toString(){
        return gender;
    }
}
