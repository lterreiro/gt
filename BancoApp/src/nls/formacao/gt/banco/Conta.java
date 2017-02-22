/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nls.formacao.gt.banco;

/**
 *
 * @author Formacao
 */
public class Conta {

    /**
     * @param args the command line arguments
     */
    private int numero;
    public String tipo;
    private float saldo;
    public String nib;
    boolean encerrada;
    //banco
    //cliente

    // construtor
    public Conta(int numero, String tipo, float saldo, String nib) {
        this.numero = numero;
        this.tipo = tipo;
        this.saldo = saldo;
        this.nib = nib;
        this.encerrada = false; // não é passada no construtor. por defeito esta aberta
    }

    // getters e setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNib() {
        return nib;
    }

    public void setNib(String nib) {
        this.nib = nib;
    }

    public boolean isEncerrada() {
        return encerrada;
    }

    public void setEncerrada(boolean encerrada) {
        this.encerrada = encerrada;
    }

    public boolean creditar(float valor) {
        setSaldo(getSaldo() + valor);
        return true;
    }

    ;
    
    public boolean debitar(float valor) {
        setSaldo(getSaldo() - valor);
        return true;
    }

    public boolean encerrar() {

        return true;
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }

}
