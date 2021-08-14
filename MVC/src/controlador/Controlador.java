/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author alberth
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo model;
    
    public Controlador (Vista view, Modelo model)
    {
    this.view = view;
    this.model = model;
    this.view.btnOperar.addActionListener(this);
    //this.view.btnDividir.addActionListener(this);
    }
    
    public void iniciar()
    {
    view.setTitle("MVC Operar");
    view.setLocationRelativeTo(null);
    }
    
    public void actionPerformed(ActionEvent e)
    {
    model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
    model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
    model.multiplicar();
    view.txtResultadom.setText(String.valueOf(model.getResultadom()));
    model.dividir();
    view.txtResultadod.setText(String.valueOf(model.getResultadod()));
    model.suma();
    view.txtResultados.setText(String.valueOf(model.getResultados()));
    model.resta();
    view.txtResultador.setText(String.valueOf(model.getResultador()));
    }
    
    /*public void actionPerformed2(ActionEvent e)
    {
    model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
    model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
    model.dividir();
    view.txtResultado.setText(String.valueOf(model.getResultado()));
    }*/
}
