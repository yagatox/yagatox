package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Locale;
import modelo.Modelo;
import vista.Vista;


public class Controlador implements ActionListener{
    
    private Vista view;
    private Modelo model;
    
    public Controlador (Vista view, Modelo model){
    
    this.view = view;
    this.model = model;
    this.view.btnMultiplicar.addActionListener(this);
    }
    
    public void iniciar(){
    
        view.setTitle("MVS Multiplicar");
        view.setLocationRelativeTo(null);// la ventana inicie en la pocicion 0 es decir en el centro de la pantalla
    }
    
    public void actionPerformed(ActionEvent e){
    
        model.setNumeroUno(Integer.parseInt(view.txtNumero1.getText()));
        model.setNumeroDos(Integer.parseInt(view.txtNumero2.getText()));
        model.multiplicar();
        
        view.txtResultado.setText(String.valueOf(model.getResultado()));
        
    }
    
}
