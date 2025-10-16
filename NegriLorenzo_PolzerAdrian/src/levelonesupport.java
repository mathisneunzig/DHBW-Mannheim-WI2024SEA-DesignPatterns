public class levelonesupport extends handler {
    @Override
    protected boolean canHandle(supportrequest request) {
        return request.getLevel() == 1;
    }

    @Override
    protected void process(supportrequest request) {
        System.out.println(" Level 1 Support bearbeitet: " + request.getMessage());
    }
}

