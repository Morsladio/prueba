import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class Calculador extends JFrame implements ActionListener{
		
	 JButton boton1, boton2;
	 JLabel label1, label2, label3, label4;
	 JTextField field1;
	 JTextArea area; 

	public Calculador(){
		setLayout(null);
		label1 = new JLabel("El IVA es: $0MXN ");
		label1.setBounds(10, 60, 150, 30);
		add(label1);
		label2 = new JLabel("Inserte el precio: $ ");
		label2.setBounds(10, 10, 400, 30);
		add(label2);
		label3 = new JLabel("$");
		label3.setBounds(350, 50, 30, 30);
		label4 = new JLabel("Dinero residual: $0MXN ");
		label4.setBounds(10, 03, 300, 200);
		add(label4);
		field1 = new JTextField();
		field1.setBounds(120, 10, 100, 30);
		add(field1);
		boton1 = new JButton("Calcular");
		boton1.setBounds(210, 10, 100, 30);
		add(boton1);
		boton1.addActionListener(this);
		area = new JTextArea();
		/*boton2 = new JButton("cerrar");
		boton2.setBounds(10, 120, 90, 30);
		add(boton2);
		boton2.addActionListener(this);*/
	}

	public void actionPerformed(ActionEvent e){

		if(e.getSource() == boton1){
			float precio, multiplicacion, division, iva = 16, resultado;
			precio = Float.parseFloat(field1.getText());

			multiplicacion = iva * precio;
			division = multiplicacion / 100;
			resultado = precio - division;


			label1.setText("El IVA es: $" + division + "MXN");

			label4.setText("Dinero residual: $" + resultado + "MXN");

		}
		/*if(e.getSource() == boton2){
			System.exit(0);
		}*/
	}


public static void main(String[] args) {
	Calculador ib = new Calculador();
	    ib.setBounds(0,0,300,200);
		ib.setVisible(true);
		ib.setResizable(false);
		ib.setLocationRelativeTo(null);
		ib.setTitle("Calculador de IVA");
}

	}