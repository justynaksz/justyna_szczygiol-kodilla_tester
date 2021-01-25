package com.kodilla.bank.homework;

public class Bank {
    private CashMachine[] cashMachines;
    private int size;
    private int bankBalance;
    private int bankSumOfPositiveTransactions;
    private int bankSumOfNegativeTransactions;
    private int bankNumberOfTransactions;
    private int bankNumberOfPositiveTransactions;
    private int bankNumberOfNegativeTransactions;


    public Bank() {
        this.size = 0;
        this.cashMachines = new CashMachine[0];
        this.bankBalance = 0;
        this.bankSumOfPositiveTransactions = 0;
        this.bankSumOfNegativeTransactions = 0;
        this.bankNumberOfTransactions = 0;
        this.bankNumberOfPositiveTransactions = 0;
        this.bankNumberOfNegativeTransactions = 0;
    }

    public void addCashMachine(CashMachine cashMachine) {
        if (cashMachine == null) {
            return;
        }
        this.size++;
        CashMachine[] newTab = new CashMachine[this.size];
        System.arraycopy(cashMachines, 0, newTab, 0, cashMachines.length);
        newTab[this.size - 1] = cashMachine;
        this.cashMachines = newTab;
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public int bankBalance() {
        for (int i = 0; i < cashMachines.length; i++) {
            bankBalance += cashMachines[i].getBalance();
        }
        return bankBalance;
    }

    public int getBankBalance() {
        return bankBalance;
    }

    public int bankNumberOfTransactions() {
        for (int i = 0; i < cashMachines.length; i++) {
            bankNumberOfTransactions += cashMachines[i].getNumberOfTransactions();
            bankNumberOfPositiveTransactions += cashMachines[i].getNumOfPositiveTransactions();
        }
        return bankNumberOfTransactions;
    }

    public int getBankNumberOfTransactions() {
        return bankNumberOfTransactions;
    }

    public int bankNumberOfNegativeTransactions() {
        bankNumberOfNegativeTransactions = bankNumberOfTransactions - bankNumberOfPositiveTransactions;
        return bankNumberOfNegativeTransactions;
    }

    public int getBankNumberOfPositiveTransactions() {
        return bankNumberOfPositiveTransactions;
    }

    public int getNumberOfNegativeTransactions() {
        return bankNumberOfNegativeTransactions;
    }

    public int bankSumOfPositiveTransactions() {
        for (int i = 0; i < cashMachines.length; i++) {
            bankSumOfPositiveTransactions += cashMachines[i].getSumOfPositiveTransactions();
        }
        return bankSumOfPositiveTransactions;
    }

    public int bankSumOfNegativeTransactions() {
        bankSumOfNegativeTransactions = bankSumOfPositiveTransactions - bankBalance;
        return bankSumOfNegativeTransactions;
    }

    public int getBankSumOfPositiveTransactions() {
        return bankSumOfPositiveTransactions;
    }

    public int getBankSumOfNegativeTransactions() {
        return bankSumOfNegativeTransactions;
    }

    public int bankAverageOfPositiveTransactions() {
        if (bankNumberOfPositiveTransactions == 0) {
            return 0;
        }
        return bankSumOfPositiveTransactions / bankNumberOfPositiveTransactions;
    }

    public int bankAverageOfNegativeTransactions() {
        if (bankNumberOfTransactions == 0) {
            return 0;
        }
        return bankSumOfNegativeTransactions / bankNumberOfNegativeTransactions;
    }
}