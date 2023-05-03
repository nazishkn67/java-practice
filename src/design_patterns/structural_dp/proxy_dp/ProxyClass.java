package design_patterns.structural_dp.proxy_dp;

public class ProxyClass extends RealSubjectClass {

    @Override
    public void method() {
        System.out.println("I am proxy and I will perform authentication and security check");

        //logic to check if user authentic or not
        //if yes, then call real object
        //if not, don't call below method

        System.out.println("calling real method of real subject after the call is authenticated");
        super.method();
    }
}
