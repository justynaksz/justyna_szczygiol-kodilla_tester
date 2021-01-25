package com.kodilla.bank.homework;

public class CashMachine {
    private int[] transactions;
    private int size;
    private int balance;
    private int numOfTransactions;
    private int sumOfPositiveTransactions;
    private int sumOfNegativeTransactions;
    private int numOfPositiveTransactions;
    private int numOfNegativeTransactions;


    public CashMachine() {
        this.size = 0;
        this.transactions = new int[0];
        this.balance = 0;
        this.sumOfPositiveTransactions = 0;
        this.sumOfNegativeTransactions = 0;
        this.numOfTransactions = 0;
        this.numOfPositiveTransactions = 0;
        this.numOfNegativeTransactions = 0;
    }

    public void transaction(int value) {
        if (value % 10 != 0) {
            return;
        }
        else if (value == 0) {
            return;
        }
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(transactions, 0, newTab, 0, transactions.length);
        newTab[this.size - 1] = value;
        this.transactions = newTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int cashMachineBalance() {
        for (int i = 0; i < transactions.length; i++) {
            balance += transactions[i];
            numOfTransactions++;
            if (transactions[i] > 0) {
                numOfPositiveTransactions++;
                sumOfPositiveTransactions += transactions[i];
            }
        }
        return balance;
    }

    public int sumOfNegativeTransactions() {
        sumOfNegativeTransactions = sumOfPositiveTransactions - balance;
        return sumOfNegativeTransactions;
    }

    public int getBalance() {
        return balance;
    }

    public int getNumberOfTransactions() {
        return numOfTransactions;
    }

    public int getNumOfPositiveTransactions() {
        return numOfPositiveTransactions;
    }

    public int getSumOfPositiveTransactions() { return sumOfPositiveTransactions; }

    public int getSumOfNegativeTransactions() {
        return sumOfNegativeTransactions;
    }
}