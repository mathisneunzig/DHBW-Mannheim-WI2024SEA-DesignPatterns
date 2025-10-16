public class ManagerSupport extends Handler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getLevel() == 3;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("Manager kümmert sich um: " + request.getMessage());
    }
}
