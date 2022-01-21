package com.ebanx.dominio;

public class Account {

    private String id;
    private Long balance;

    public Account() {

    }

    public Account(Long id) {
        this.id = id.toString();
    }

    public Account(Long id, Long balance) {
        this.id = id.toString();
        this.balance = balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Account) {
            Account other = ((Account) obj);
            if (this.id == null || other.getId() == null) {
                return false;
            }

            return this.id.equals(other.getId());
        }

        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }

    public void deposit(Long value) {
        this.balance = this.balance + value;
    }

    public void withdraw(Long value) {
        this.balance = this.balance - value;
    }
}
