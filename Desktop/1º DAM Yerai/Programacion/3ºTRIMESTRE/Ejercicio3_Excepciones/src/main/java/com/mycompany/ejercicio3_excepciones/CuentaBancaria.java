

package com.mycompany.ejercicio3_excepciones;


public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    

    @Override
    public String toString() {
        return "CuentaBancaria{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    
    public void ingresar(double cantidad){
       
        if (cantidad <= 0) {
            throw new IllegalArgumentException();
        }
        saldo += cantidad;
    }
    
    public void retirar(double cantidad) throws SaldoInsuficienteException  {
          if (cantidad < 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor o igual a cero.");
        }
        if (cantidad > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para realizar la operación.");
        }
        saldo -= cantidad;
    }
    
     public void consultarSaldo() {
        System.out.println("Saldo actual: " + saldo);
    }
    
    
    
}
