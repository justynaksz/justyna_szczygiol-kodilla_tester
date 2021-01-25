package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    CashMachine cashMachineFalata = new CashMachine();
    CashMachine cashMachineKarmelicka = new CashMachine();
    CashMachine cashMachineChopina = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
        Bank bankCracow = new Bank();
        CashMachine[] cashMachines = bankCracow.getCashMachines();
        assertEquals(0, cashMachines.length);
    }

    @Test
    public void shouldNotChangeLengthIfCashMachineIsNull() {
        Bank bankCracow = new Bank();
        bankCracow.addCashMachine(null);
        CashMachine[] cashMachines = bankCracow.getCashMachines();
        assertEquals(0, cashMachines.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        Bank bankCracow = new Bank();
        bankCracow.addCashMachine(null);
        bankCracow.addCashMachine(cashMachineFalata);
        bankCracow.addCashMachine(cashMachineKarmelicka);
        bankCracow.addCashMachine(cashMachineChopina);

        CashMachine[] cashMachines = bankCracow.getCashMachines();
        assertEquals(3, cashMachines.length);
    }

    @Test
    public void shouldReturnZeroBalance() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        bankCracow.addCashMachine(cashMachineKarmelicka);
        bankCracow.addCashMachine(cashMachineChopina);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankBalance();
        assertEquals(0, bankCracow.getBankBalance());
    }

    @Test
    public void shouldNotChangeBalanceIfValueIsNotMultipleOFTen() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(1);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(7);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(-5);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankBalance();
        assertEquals(0, bankCracow.getBankBalance());
    }

    @Test
    public void shouldNotChangeBalanceIfValueIsZero() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(0);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(0);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankBalance();
        assertEquals(0, bankCracow.getBankBalance());
    }

    @Test
    public void shouldCalculateBankBalance() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(150);
        cashMachineFalata.transaction(-100);
        cashMachineFalata.transaction(1);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(180);
        cashMachineKarmelicka.transaction(-300);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);
        cashMachineChopina.transaction(5000);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankBalance();
        assertEquals(4930, bankCracow.getBankBalance());
    }

    @Test
    public void shouldReturnZeroNumberOfTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        bankCracow.addCashMachine(cashMachineKarmelicka);
        bankCracow.addCashMachine(cashMachineChopina);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();;

        bankCracow.bankNumberOfTransactions();
        assertEquals(0, bankCracow.getBankNumberOfTransactions());
    }

    @Test
    public void shouldNotChangeNumberOfTransactionsIfValueIsNotMultipleOFTen() {

        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(1);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(7);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(-5);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankNumberOfTransactions();
        assertEquals(0, bankCracow.getBankNumberOfTransactions());
    }

    @Test
    public void shouldNotChangeNumberOfTransactionsIfValueIsZero() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(0);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(0);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankNumberOfTransactions();
        assertEquals(0, bankCracow.getBankBalance());
    }


    @Test
    public void shouldCalculateBankNumberOfTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(150);
        cashMachineFalata.transaction(-100);
        cashMachineFalata.transaction(1);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(180);
        cashMachineKarmelicka.transaction(-300);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankNumberOfTransactions();
        assertEquals(4, bankCracow.getBankNumberOfTransactions());
    }

    @Test
    public void shouldCalculateBankNumberOfPositiveTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(-100);
        cashMachineFalata.transaction(1);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(180);
        cashMachineKarmelicka.transaction(-300);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);
        cashMachineChopina.transaction(5000);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankNumberOfTransactions();
        assertEquals(2, bankCracow.getBankNumberOfPositiveTransactions());
    }

    @Test
    public void shouldCalculateBankNumberOfNegativeTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(150);
        cashMachineFalata.transaction(-100);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(180);
        cashMachineKarmelicka.transaction(-300);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);
        cashMachineChopina.transaction(5000);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankNumberOfTransactions();
        bankCracow.bankNumberOfNegativeTransactions();
        assertEquals(2, bankCracow.getNumberOfNegativeTransactions());
    }

    @Test
    public void shouldCalculateBankSumOfPositiveTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(150);
        cashMachineFalata.transaction(-100);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(180);
        cashMachineKarmelicka.transaction(-300);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);
        cashMachineChopina.transaction(5000);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankSumOfPositiveTransactions();
        assertEquals(5330, bankCracow.getBankSumOfPositiveTransactions());
    }

    @Test
    public void shouldCalculateBankSumOfNegativeTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(150);
        cashMachineFalata.transaction(-100);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(180);
        cashMachineKarmelicka.transaction(-300);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);
        cashMachineChopina.transaction(5000);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankBalance();
        bankCracow.bankSumOfPositiveTransactions();
        bankCracow.bankSumOfNegativeTransactions();
        assertEquals(400, bankCracow.getBankSumOfNegativeTransactions());
    }

    @Test
    public void shouldReturnZeroAverageOfPositiveTransactionsIfNoTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        bankCracow.addCashMachine(cashMachineKarmelicka);
        bankCracow.addCashMachine(cashMachineChopina);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();;

        bankCracow.bankNumberOfTransactions();
        bankCracow.bankSumOfPositiveTransactions();
        assertEquals(0, bankCracow.bankAverageOfPositiveTransactions());
    }

    @Test
    public void shouldReturnZeroAverageOfNegativeTransactionsIfNoTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        bankCracow.addCashMachine(cashMachineKarmelicka);
        bankCracow.addCashMachine(cashMachineChopina);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();;

        bankCracow.bankBalance();
        bankCracow.bankNumberOfTransactions();
        bankCracow.bankNumberOfNegativeTransactions();
        bankCracow.bankSumOfPositiveTransactions();
        bankCracow.bankSumOfNegativeTransactions();
        assertEquals(0, bankCracow.bankAverageOfNegativeTransactions());
    }
    @Test
    public void shouldCalculateBankAverageOfPositiveTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(150);
        cashMachineFalata.transaction(-100);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(180);
        cashMachineKarmelicka.transaction(-300);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);
        cashMachineChopina.transaction(5000);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankNumberOfTransactions();
        bankCracow.bankSumOfPositiveTransactions();
        assertEquals(1776, bankCracow.bankAverageOfPositiveTransactions());
    }

    @Test
    public void shouldCalculateBankAverageOfNegativeTransactions() {
        Bank bankCracow = new Bank();

        bankCracow.addCashMachine(cashMachineFalata);
        cashMachineFalata.transaction(150);
        cashMachineFalata.transaction(-100);

        bankCracow.addCashMachine(cashMachineKarmelicka);
        cashMachineKarmelicka.transaction(180);
        cashMachineKarmelicka.transaction(-300);

        bankCracow.addCashMachine(cashMachineChopina);
        cashMachineChopina.transaction(0);
        cashMachineChopina.transaction(5000);

        cashMachineFalata.cashMachineBalance();
        cashMachineChopina.cashMachineBalance();
        cashMachineKarmelicka.cashMachineBalance();

        bankCracow.bankBalance();
        bankCracow.bankNumberOfTransactions();
        bankCracow.bankNumberOfNegativeTransactions();
        bankCracow.bankSumOfPositiveTransactions();
        bankCracow.bankSumOfNegativeTransactions();
        assertEquals(200, bankCracow.bankAverageOfNegativeTransactions());
    }
}