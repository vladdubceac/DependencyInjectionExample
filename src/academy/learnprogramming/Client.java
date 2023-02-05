package academy.learnprogramming;

public class Client {
    private Service myService;

    public Client() {
    }

    // injects via the constructor
    public Client(Service service){
        myService = service;
    }

    public void doSomething(){
        myService.write("This is a message");
    }

    public void setService(Service service) {
        myService = service;
    }
}
