public abstract class handler {
    protected handler nextHandler;

    public void setNextHandler(handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handle(supportrequest request) {
        if (canHandle(request)) {
            process(request);
        } else if (nextHandler != null) {
            nextHandler.handle(request);
        } else {
            System.out.println(" Keine passende Stelle für: " + request.getMessage());
        }
    }

    protected abstract boolean canHandle(supportrequest request);
    protected abstract void process(supportrequest request);
}
