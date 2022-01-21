package com.ebanx.dominio;

import com.fasterxml.jackson.annotation.JsonInclude;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EventOutput {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Account origin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
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
