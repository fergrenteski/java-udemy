
package model.entities;

import model.exceptions.BusinessException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    /**
     * Contrutor padrão
     */
    public Account() {
    }

    /**
     * Contrutor com parâmetros
     * @param number
     * @param holder
     * @param balance
     * @param withDrawLimit 
     */
    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    /**
     * Retorna o número da conta.
     * @return
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Coloca o numero da conta.
     * @param number
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * Retorna o dono da conta.
     * @return 
     */
    public String getHolder() {
        return holder;
    }

    /**
     * Coloca o dono da conta.
     * @param holder 
     */
    public void setHolder(String holder) {
        this.holder = holder;
    }

    /**
     * Retorna o saldo da conta.
     * @return 
     */
    public Double getBalance() {
        return balance;
    }

    /**
     * Retorna o limite de saque da conta.
     * @return 
     */
    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    /**
     * Coloca o limite de saque da conta.
     * @param withDrawLimit 
     */
    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }
    
    /**
     * Realiza um depósito na conta.
     * @param amount 
     */
    public void deposit(Double amount) {
        // Incluí o valor do deposito no saldo da conta.
        balance += amount;
    }
    
    /**
     * Realiza um saque da conta.
     * @param amount
     */
    public void withDraw(Double amount){
        // Retira o valor do saque do saldo da conta.
        balance -= amount;
    }
    
    public void validateWithdraw(Double amount) throws BusinessException {
        // Verifica o saldo da conta.
        if(amount > balance || balance <= 0.0) {
            throw new BusinessException("Withdraw error: Not enough balance");
        }
        // Verifica o limite de saque da conta.
        if (amount > withDrawLimit) {
            throw new BusinessException("Withdraw error: The amount exceeds withdraw limit");
        }
        
    }
}
