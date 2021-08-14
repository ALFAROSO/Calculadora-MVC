/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author alberth
 */
public class Modelo {
    
    private int numeroUno;
    private int numeroDos;
    private int resultadom;
    private double resultadod;
    private int resultados;
    private int resultador;

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numeroUno) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }

    public int getResultadom() {
        return resultadom;
    }

    public void setResultadom(int resultado) {
        this.resultadom = resultado;
    }
    
    public int multiplicar()
    {
    
    this.resultadom = this.numeroUno * this.numeroDos;
    
    return this.resultadom;
    
    }
    
    public double getResultadod() {
        return resultadod;
    }

    public void setResultadod(int resultado) {
        this.resultadod = resultado;
    }
    
    public double dividir()
    {
    
    this.resultadod = (double)this.numeroUno / (double)this.numeroDos;
    
    return this.resultadod;
    
    }
    
    public int getResultados() {
        return resultados;
    }

    public void setResultados(int resultado) {
        this.resultados = resultado;
    }
    
    public int suma()
    {
    
    this.resultados = this.numeroUno + this.numeroDos;
    
    return this.resultados;
    
    }

    public int getResultador() {
        return resultador;
    }

    public void setResultador(int resultado) {
        this.resultador = resultado;
    }
    
    public int resta()
    {
    
    this.resultador = this.numeroUno - this.numeroDos;
    
    return this.resultador;
    
    }    
    
}
