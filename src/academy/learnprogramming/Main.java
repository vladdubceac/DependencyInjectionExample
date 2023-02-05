package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        Service service = new ServiceA(); // the injector
        Client client = new Client(service); // injects via the constructor
        client.doSomething();

        Client secondClient = new Client();
        secondClient.setService(service); // injects via setter
        client.doSomething();
    }
}
