package com.ebanx.negocio;

import com.ebanx.dominio.Account;

import java.util.ArrayList;

public class AccountService {

    static final ArrayList<Account> accounts = new ArrayList<>();

    public AccountService() {
        accounts.add(new Account(100L, 20L));
    }

    public Long getBalance(final Long accountId) {
        Account acc = getAccount(accountId);
        if (acc != null) {
            return acc.getBalance();
        }

        return null;
    }

    private Account getAccount(final Long accountId) {
        int index = accounts.indexOf(new Account(accountId));
        if (index >= 0) {
            return accounts.get(index);
        }

        return null;
    }


}
