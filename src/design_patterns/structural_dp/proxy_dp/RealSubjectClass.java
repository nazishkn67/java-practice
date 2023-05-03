package design_patterns.structural_dp.proxy_dp;

public class RealSubjectClass implements Subject{

    @Override
    public void method() {
        System.out.println("I am an actual implementation of subject, rest all are proxies : D ");
    }
}
