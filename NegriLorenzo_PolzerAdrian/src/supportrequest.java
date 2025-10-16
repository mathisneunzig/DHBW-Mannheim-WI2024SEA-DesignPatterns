public class supportrequest {
    private final String message; 
    private final int level;

    public supportrequest(String message, int level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public int getLevel() {
        return level;
    }
    
}
