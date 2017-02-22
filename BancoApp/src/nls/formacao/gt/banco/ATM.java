/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nls.formacao.gt.banco;

import java.util.Date;

/**
 *
 * @author NLS - José Inácio Rodrigues
 */
public class ATM {

    private String id;
    private Date data;
    private double saldo;

    public ATM(String id, Date date, double saldo) {
        this.id = id;
        this.data = date;
        this.saldo = saldo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean carregar(double valor) {
        return true;
    }

    public double levantar(double valor) {
        return this.saldo;
    }

    public double depositar(double valor) {
        return this.saldo;
    }

    public boolean transferir(int contaOri, int contaDes, double valor) {
        return false;
    }

    public boolean descarregar() {
        return false;
    }

}
