package mera.com.borisgk98.autoshowroom.servergroovy.kafka

interface Sender<T> {

    void send(T model)

}