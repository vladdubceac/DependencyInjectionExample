package academy.learnprogramming;

public class ServiceA implements Service {
    @Override
    public void write(String message) {
        System.out.println("ServiceA : " + message);
    }
}
