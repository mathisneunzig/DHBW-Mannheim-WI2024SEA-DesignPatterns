public abstract class Handler {
    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(SupportRequest request) {
        if (canHandle(request)) {
            process(request);
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println("Keine passende Stelle für: " + request.getMessage());
        }
    }

    protected abstract boolean canHandle(SupportRequest request);
    protected abstract void process(SupportRequest request);
}
