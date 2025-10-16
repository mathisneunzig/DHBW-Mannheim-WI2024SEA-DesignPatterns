public class leveltwosupport extends handler {
    @Override
    protected boolean canHandle(supportrequest request) {
        return request.getLevel() == 2;
    }

    @Override
    protected void process(supportrequest request) {
        System.out.println("Level 2 Support bearbeitet: " + request.getMessage());
    }
}
