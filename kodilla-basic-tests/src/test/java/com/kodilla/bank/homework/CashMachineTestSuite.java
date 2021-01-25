package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldNotChangeLengthIfValueIsZero() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(0);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldNotChangeLengthIfValueIsNotMultipleOFTen() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(5);
        cashMachine.transaction(-3);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(150);
        cashMachine.transaction(-100);
        cashMachine.transaction(1);
        int[] transactions = cashMachine.getTransactions();
        assertEquals(2, transactions.length);
    }

    @Test
    public void shouldReturnZeroBalance() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.cashMachineBalance());
    }

    @Test
    public void shouldNotChangeBalanceIfValueIsNotMultipleOFTen() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(5);
        cashMachine.transaction(-3);
        assertEquals(0, cashMachine.cashMachineBalance());
    }

    @Test
    public void shouldNotChangeBalanceIfValueIsZero() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(0);
        cashMachine.transaction(0);
        assertEquals(0, cashMachine.cashMachineBalance());
    }

    @Test
    public void shouldCalculateBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(50);
        cashMachine.transaction(0);
        cashMachine.transaction(-220);
        cashMachine.transaction(-1);
        assertEquals(-170, cashMachine.cashMachineBalance());
    }

    @Test
    public void shouldReturnZeroNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldNotChangeNumberOfTransactionsIfValueIsZero() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(0);
        assertEquals(0, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldNotChangeNumberOfTransactionsIfValueIsNotMultipleOFTen() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(5);
        cashMachine.transaction(-3);
        assertEquals(0, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldCalculateNumberOfTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(150);
        cashMachine.transaction(-100);
        cashMachine.transaction(1);
        cashMachine.transaction(4500);
        cashMachine.cashMachineBalance();
        assertEquals(3, cashMachine.getNumberOfTransactions());
    }

    @Test
    public void shouldCalculateSumOfPositiveTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(150);
        cashMachine.transaction(-100);
        cashMachine.transaction(1);
        cashMachine.transaction(4500);
        cashMachine.cashMachineBalance();
        assertEquals(4650, cashMachine.getSumOfPositiveTransactions());
    }

    @Test
    public void shouldCalculateSumOfNegativeTransactions() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.transaction(150);
        cashMachine.transaction(-100);
        cashMachine.transaction(1);
        cashMachine.transaction(4500);
        cashMachine.cashMachineBalance();
        cashMachine.sumOfNegativeTransactions();
        assertEquals(100, cashMachine.getSumOfNegativeTransactions());
    }
}