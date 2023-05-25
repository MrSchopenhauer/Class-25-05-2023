package mx.uaemex.fi.paradgimas_i.lemuria.admin.vista;

import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import mx.uaemex.fi.paradigmas_i.lemuria.admin.control.ControlEnemigos;

public class VentanaAdminEnemigos extends JFrame implements ActionListener {
	private ControlEnemigos ctrl;
	private JSpinner spinnerNivel;
	private JSpinner spinnerVida;
	private JSpinner spinnerAtaque;
	private JSpinner spinnerDefensa;
	private JTextField campoNombre;
	
	
	
	public VentanaAdminEnemigos() throws HeadlessException {
		JLabel etq;
		JPanel panel;
		JButton btnAlta, btnBorrar;
		
		panel = new JPanel(new GridLayout(6,2));
		etq = new JLabel("Nombre");
		panel.add(etq);
		
		this.campoNombre = new JTextField();
		panel.add(campoNombre);
		
		etq = new JLabel("Nivel");
		panel.add(etq);
		this.spinnerNivel = new JSpinner();
		panel.add(this.spinnerNivel);
		

		etq = new JLabel("Defensa");
		panel.add(etq);
		this.spinnerDefensa = new JSpinner();
		panel.add(this.spinnerDefensa);
		

		etq = new JLabel("Vida");
		panel.add(etq);
		this.spinnerVida = new JSpinner();
		panel.add(this.spinnerVida);
		

		etq = new JLabel("Ataque");
		panel.add(etq);
		this.spinnerAtaque = new JSpinner();
		panel.add(this.spinnerAtaque);
		
		btnAlta = new JButton("Crear");
		panel.add(btnAlta);
		btnAlta.setActionCommand("crea");
		btnAlta.addActionListener(this);
		
		btnBorrar= new JButton("Limpiar");
		panel.add(btnBorrar);
		btnAlta.setActionCommand("Limpia");
		btnAlta.addActionListener(this);   
		
		panel.setBorder(new EmptyBorder(5,5,5,5));
		this.getContentPane().add(panel);
		
	}

	public VentanaAdminEnemigos(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public VentanaAdminEnemigos(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public VentanaAdminEnemigos(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
