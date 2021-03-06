package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import Controlador.VistaControlador;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class InicioVista {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public InicioVista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		VistaControlador vc = new VistaControlador();
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(InicioVista.class.getResource("/Imagen/je.png")));
		frame.setTitle("MusLearn - DAM");
		frame.getContentPane().setBackground(new Color(238, 238, 238));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		Component verticalStrut = Box.createVerticalStrut(20);
		frame.getContentPane().add(verticalStrut);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(InicioVista.class.getResource("/Imagen/je.png")));
		lblNewLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		frame.getContentPane().add(lblNewLabel);
		
		Component verticalStrut_1 = Box.createVerticalStrut(20);
		frame.getContentPane().add(verticalStrut_1);
		
		JLabel lblNewLabel_1 = new JLabel("Aplicación que incorpora todas las letras del mercado, y videos..");
		lblNewLabel_1.setBackground(new Color(192, 192, 192));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Kohinoor Bangla", Font.PLAIN, 13));
		lblNewLabel_1.setAlignmentX(Component.CENTER_ALIGNMENT);
		frame.getContentPane().add(lblNewLabel_1);
		
		Component verticalGlue = Box.createVerticalGlue();
		frame.getContentPane().add(verticalGlue);
		
		JButton goMain = new JButton("Ir a la APP");
		//Método hecho en el controlador de esta vista la cual te lleva a otra.
		vc.goMain(goMain);
		goMain.setAlignmentX(Component.CENTER_ALIGNMENT);
		frame.getContentPane().add(goMain);
	}

}
