public class managersupport extends handler {
    @Override
    protected boolean canHandle(supportrequest request) {
        return request.getLevel() == 3;
    }

    @Override
    protected void process(supportrequest request) {
        System.out.println("Manager kümmert sich um: " + request.getMessage());
    }
}
