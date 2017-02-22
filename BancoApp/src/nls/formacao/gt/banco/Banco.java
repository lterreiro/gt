/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nls.formacao.gt.banco;

/**
 *
 * @author afonso
 */
public class Banco {

    private String nome;
    private int codigo;
    private String morada;
    private String telefone;
    private double saldo; 

    public void Banco() {
    }

    public void Banco(String nome, int codigo, String morada, String telefone) {
        Banco();
        setNome(nome);
        setCodigo(codigo);
        setMorada(morada);
        setTelefone(telefone);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     * Métodos Manuais
     *
     */
    public String adicionarATM() {
        return null;
    }

    public boolean removerATM(String idATM) {
        return true;
    }

    public int adicionarConta() {
        return 0;
    }

    public boolean removerConta() {
        return true;
    }

    public boolean adicionarCliente() {
        return true;
    }

    public boolean removerCliente() {
        return true;
    }

    public void creditar(int conta, float valor) {

    }

}
