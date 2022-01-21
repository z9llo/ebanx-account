package com.ebanx.dominio;

public enum EventType {

    DEPOSIT("deposit"),
    WITHDRAW("withdraw"),
    TRANSFER("transfer");

    String name;

    EventType(String name) {
        this.name = name;
    }

    public static EventType get(String name){
        for (EventType type: EventType.values()) {
            if (type.name.equalsIgnoreCase(name)) {
                return type;
            }
        }

        return null;
    }
}
