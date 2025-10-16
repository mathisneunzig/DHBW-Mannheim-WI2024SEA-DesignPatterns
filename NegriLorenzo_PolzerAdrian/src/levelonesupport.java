public class LevelOneSupport extends Handler {
    @Override
    protected boolean canHandle(SupportRequest request) {
        return request.getLevel() == 1;
    }

    @Override
    protected void process(SupportRequest request) {
        System.out.println(" Level 1 Support bearbeitet: " + request.getMessage());
    }
}

