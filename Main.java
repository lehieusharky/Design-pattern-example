public class Main {
    public static void main(String[] args) {
        // client want to use working method of realservice
        // but apply proxy pattern
        // we also access client use working method
        // but now client is working with proxy instead of realService
        ProxyService proxyService = new ProxyService();

        proxyService.working(); // use Realservice contructor

        proxyService.working(); // don't use RealService constructor
    }
}
