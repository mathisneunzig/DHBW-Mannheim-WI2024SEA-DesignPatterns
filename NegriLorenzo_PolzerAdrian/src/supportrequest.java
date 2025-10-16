public class SupportRequest {
    private final String message; 
    private final int level;

    public SupportRequest(String message, int level) {
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
