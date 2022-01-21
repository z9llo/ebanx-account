package com.ebanx.dominio;

public class EventOutput {

    private Account origin;
    private Account destination;

    public EventOutput() {

    }

    public EventOutput(Account origin, Account destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public Account getOrigin() {
        return origin;
    }

    public void setOrigin(Account origin) {
        this.origin = origin;
    }

    public Account getDestination() {
        return destination;
    }

    public void setDestination(Account destination) {
        this.destination = destination;
    }
}
