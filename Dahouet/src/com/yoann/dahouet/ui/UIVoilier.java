package com.yoann.dahouet.ui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

import com.yoann.dahouet.controller.DahouetController;

import javax.swing.SwingConstants;

public class UIVoilier extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNomDuVoilier;
	public static JComboBox<String> cbserie = new JComboBox<>();
	public static JComboBox<String> cbclasse = new JComboBox<>();
	public static JComboBox<String> cbproprietaire = new JComboBox<>();
	
	/**
	 * 
	 */
	
	public UIVoilier() {
		this.setTitle("Enregistrement d'un VOILIER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		final JButton btnOk = new JButton("Enregistrer");
		btnOk.setEnabled(false);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][][][][][grow]", "[][][][][][][][][]"));
		
		JLabel lblNomVoilier = new JLabel("Nom Voilier");
		panel.add(lblNomVoilier, "cell 4 1,alignx trailing");
		
	//nom du voilier------------------------------------------------------------------------------
		txtNomDuVoilier = new JTextField();
		txtNomDuVoilier.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtNomDuVoilier.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtNomDuVoilier.selectAll();
			}
		});
		
		txtNomDuVoilier.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyPressed(KeyEvent e) {
				if(!txtNomDuVoilier.getText().equals ("Nom du voilier") )
					btnOk.setEnabled(true);
				else{btnOk.setEnabled(false);
			 	}
			}				
		});
		
		txtNomDuVoilier.setText("Nom du voilier");
		panel.add(txtNomDuVoilier, "cell 5 1,alignx center");
		txtNomDuVoilier.setColumns(10);
	//-------------------------------------------------------------------------------------------------	
		JLabel lblPropritaire = new JLabel("Propri\u00E9taire");
		panel.add(lblPropritaire, "cell 0 2,alignx trailing");
		
		// cbox proprietaire + new proprio
		cbproprietaire = new JComboBox<String>();
		
		  				  
		DahouetController.remplirListProprietaire();
		panel.add(cbproprietaire, "cell 1 2 4 1,growx");
		
		JButton btnNewButton = new JButton(" New propri\u00E9taire");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JDialog UIProprietaire = null;
				try {
					UIProprietaire = new UIProprietaire();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				UIProprietaire.setVisible(true);
			}
		});
		panel.add(btnNewButton, "cell 5 2,alignx right");
		
		JLabel lblClasse = new JLabel("S\u00E9rie");
		panel.add(lblClasse, "cell 0 3,alignx trailing");
		
		// cbox serie  ---------------------------------------------------------
		 
				cbserie = new JComboBox<String>();
				cbserie.addActionListener(new ActionListener() {
				   
				   public void actionPerformed(ActionEvent e) {
					   cbserie.getSelectedItem().toString();
				   
					   cbclasse.removeAllItems();
				    String nomSerie = (String) cbserie.getSelectedItem();
				    
				   
				    DahouetController.remplirListClasse(nomSerie);
				   }
				  });
				  
				DahouetController.remplirListSerie();
				panel.add(cbserie, "cell 1 3 4 1,growx");
		// cbox classe ------------------------------------------------
		cbclasse.removeAllItems();
		cbclasse = new JComboBox<String>();
		 
		
		  String nomSerie = (String) cbserie.getSelectedItem();
		 
		
		  
		  DahouetController.remplirListClasse(nomSerie);
		panel.add(cbclasse, "cell 1 4 4 1,growx");
		
		JLabel lblSrie = new JLabel("Classe");
		panel.add(lblSrie, "cell 0 4,alignx trailing");
		
		
		
	//--------------------------------------------------------------------------------	
		
		panel.add(btnOk, "flowx,cell 5 8,alignx right");
		
		JButton btnCancel = new JButton("Quitter");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel.add(btnCancel, "cell 5 8");
	}

}
