package mera.com.borisgk98.autoshowroom.servergroovy;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import mera.com.borisgk98.autoshowroom.servergroovy.service.HelloWorldServiceImpl;
import com.codenotfound.grpc.helloworld.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Client {

    private com.codenotfound.grpc.helloworld.HelloWorldServiceGrpc.HelloWorldServiceBlockingStub helloWorldServiceBlockingStub;

    @PostConstruct
    private void init() {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress("localhost", 6565).usePlaintext().build();

        helloWorldServiceBlockingStub =
                com.codenotfound.grpc.helloworld.HelloWorldServiceGrpc.newBlockingStub(managedChannel);
    }

    public String sayHello(String firstName, String lastName) {
        com.codenotfound.grpc.helloworld.Person person = com.codenotfound.grpc.helloworld.Person.newBuilder().setFirstName(firstName)
                .setLastName(lastName).build();

        com.codenotfound.grpc.helloworld.Greeting greeting =
                helloWorldServiceBlockingStub.sayHello(person);

        return greeting.getMessage();
    }

    public static void main(String[] args) {
        Client client = new Client();
        client.init();
        System.out.println(client.sayHello("Boris", "K"));
    }
}