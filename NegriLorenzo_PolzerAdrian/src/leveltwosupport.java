public class LevelTwoSupport extends Handler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getLevel() == 2;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println("Level 2 Support bearbeitet: " + request.getMessage());
    }
}
