package com.ebanx.negocio;

import com.ebanx.dominio.Account;
import com.ebanx.dominio.EventInput;
import com.ebanx.dominio.EventOutput;
import com.ebanx.dominio.EventType;

import java.util.ArrayList;

public class AccountService {

    static final ArrayList<Account> accounts = new ArrayList<>();

    public AccountService() {
        accounts.add(new Account(100L, 20L));
        accounts.add(new Account(300L, 0L));
    }

    public Long getBalance(final Long accountId) {
        Account acc = getAccount(accountId);
        if (acc != null) {
            return acc.getBalance();
        }

        return null;
    }

    public EventOutput event(final EventInput event) {
        EventType type = EventType.get(event.getType());
        if (type == null) {
            return null;
        }

        if (type.equals(EventType.DEPOSIT)) {
            return deposit(event);
        } else if (type.equals(EventType.WITHDRAW)) {
            return withdraw(event);
        }

        return transfer(event);
    }

    private Account getAccount(final Long accountId) {
        int index = accounts.indexOf(new Account(accountId));
        if (index >= 0) {
            return accounts.get(index);
        }

        return null;
    }

    private EventOutput deposit(final EventInput event) {
        Account account = getAccount(event.getDestination());
        if (account == null) {
            account = new Account(event.getDestination(), event.getAmount());
        } else {
            account.deposit(event.getAmount());
        }

        return new EventOutput(null, account);
    }

    private EventOutput withdraw(final EventInput event) {
        Account account = getAccount(event.getOrigin());
        if (account == null) {
            return null;
        } else {
            account.withdraw(event.getAmount());
        }

        return new EventOutput(account, null);
    }

    private EventOutput transfer(final EventInput event) {
        Account origin = getAccount(event.getOrigin());
        Account destination = getAccount(event.getDestination());
        if (origin == null || destination == null) {
            return null;
        } else {
            origin.withdraw(event.getAmount());
            destination.deposit(event.getAmount());
        }

        return new EventOutput(origin, destination);
    }

}
