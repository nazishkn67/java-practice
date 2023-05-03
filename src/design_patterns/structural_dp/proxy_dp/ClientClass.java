package design_patterns.structural_dp.proxy_dp;

public class ClientClass {

    public static void main(String[] args) {
        Subject proxy = new ProxyClass();
        proxy.method();
    }
}
