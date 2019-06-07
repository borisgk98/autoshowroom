package mera.com.borisgk98.autoshowroom.servergroovy.service;

import com.codenotfound.grpc.helloworld.Greeting;
import com.codenotfound.grpc.helloworld.Person;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class HelloWorldServiceImpl extends com.codenotfound.grpc.helloworld.HelloWorldServiceGrpc.HelloWorldServiceImplBase {

    @Override
    public void sayHello(Person request, StreamObserver<Greeting> responseObserver) {
        String message = "Hello " + request.getFirstName() + " "
                + request.getLastName() + "!";
        Greeting greeting =
                Greeting.newBuilder().setMessage(message).build();

        responseObserver.onNext(greeting);
        responseObserver.onCompleted();
    }
}
