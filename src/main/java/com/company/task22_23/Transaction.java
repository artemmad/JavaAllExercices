package com.company.task22_23;

public class Transaction {

    String paymentDate;
    double amountplus;
    double amountminus;
    String reference;
    String accountBic;
    String accountName;
    String currency;
    String info;

    public Transaction() {
        this.amountplus = 0;
        this.amountminus=0;
    }
}
