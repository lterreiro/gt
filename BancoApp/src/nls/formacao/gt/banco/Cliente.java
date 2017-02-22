/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nls.formacao.gt.banco;

/**
 *
 * @author CollerMaster
 */
public class Cliente {
    public String nome;
    public String morada;
    private int id;
    private int cartao;
    private int pin;

    public Cliente() {
        this.nome = "Carla ";
        this.morada = "Rua xpto";
        this.id = 12345;
        this.cartao = 4567;
        this.pin = 7788;
    }
        
    /*public Cliente(String nome, String morada, int id, int cartao, int pin) {
        this.nome = nome;
        this.morada = morada;
        this.id = id;
        this.cartao = cartao;
        this.pin = pin;
    } */


    
    public boolean ValidarPin(int pin){
       
        //int p;        
         //this.setPin(this.getPin());
        //this.pin = pin;
        this.setPin(pin); 
              return true;
          
      
        
    }
    
    public float levantarAtm(String atm, int conta, float valor){
     return 0.2f;   
    }
    
    public float depositarAtm(String atm, int conta, float valor){
        
     return 0.5f; 
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCartao() {
        return cartao;
    }

    public void setCartao(int cartao) {
        this.cartao = cartao;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }


    
    
    
}
