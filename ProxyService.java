public class ProxyService implements Service {

    RealService realService;

    @Override
    public void working() {
        if (realService == null) {
            realService = new RealService();
        }

        realService.working();
    }

}
