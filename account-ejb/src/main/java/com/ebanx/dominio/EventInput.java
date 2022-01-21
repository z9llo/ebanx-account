package com.ebanx.dominio;

public class EventInput {

    private Long destination;
    private Long origin;
    private Long amount;
    private String type;

    public Long getDestination() {
        return destination;
    }

    public void setDestination(Long destination) {
        this.destination = destination;
    }

    public Long getOrigin() {
        return origin;
    }

    public void setOrigin(Long origin) {
        this.origin = origin;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
