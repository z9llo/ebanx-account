package com.ebanx.dominio;

public class Account {

    private Long id;
    private Long balance;

    public Account() {

    }

    public Account(Long id) {
        this.id = id;
    }

    public Account(Long id, Long balance) {
        this.id = id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
