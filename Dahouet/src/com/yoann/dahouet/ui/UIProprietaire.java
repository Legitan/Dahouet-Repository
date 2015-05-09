package com.yoann.dahouet.ui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JComboBox;
import com.yoann.dahouet.controller.DahouetController;
import javax.swing.SwingConstants;
public class UIProprietaire extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public static JTextField txtNomDuPropritaire;
	public static JTextField txtCoordonnesDuPropritaire;
	public static JComboBox<String> cbclub = new JComboBox<>();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIProprietaire dialog = new UIProprietaire();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 * 
	 */
	public UIProprietaire() throws Exception {
		this.setTitle("Enregistrement d'un PROPRIETAIRE");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new MigLayout("", "[10px][][][][][grow]", "[10px][][][][]"));
		
		final JButton okButton = new JButton("Enregistrer");
		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					try {
						DahouetController.save();
					} catch (Exception e) {
						 e.printStackTrace();
						throw new RuntimeException();
					}
			}
		});
		okButton.setEnabled(false);
		
		{
			JPanel panel = new JPanel();
			contentPanel.add(panel, "cell 0 0,alignx left,aligny top");
		}
		{
			JLabel lblClub = new JLabel("Club");
			contentPanel.add(lblClub, "cell 4 2,alignx trailing");
		}
		{
			DahouetController.remplirListClub();
			contentPanel.add(cbclub, "cell 5 2,growx");
		}
		
		
		
		
		//nom du proprietaire------------------------------------------------------
		{
			JLabel lblNom = new JLabel("Nom");
			contentPanel.add(lblNom, "cell 4 3,alignx trailing");
		}
		txtNomDuPropritaire = new JTextField();
		txtNomDuPropritaire.setHorizontalAlignment(SwingConstants.CENTER);
		
		txtNomDuPropritaire.addFocusListener(new FocusListener() {
			@Override
			public void focusLost(FocusEvent e) {
			}
			@Override
			public void focusGained(FocusEvent e) {
				txtNomDuPropritaire.selectAll();
			}
		});
		
		txtNomDuPropritaire.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			@Override
			public void keyReleased(KeyEvent e) {
			}
			@Override
			public void keyPressed(KeyEvent e) {
				if((!txtNomDuPropritaire.getText().equals ("Nom du propriétaire") ) && (!txtCoordonnesDuPropritaire.getText().equals ("Coordonnées du propriétaire") ))
					okButton.setEnabled(true);
				else{okButton.setEnabled(false);
			 	}
			}				
		});
		{
		
			txtNomDuPropritaire.setText("Nom du propri\u00E9taire");
			contentPanel.add(txtNomDuPropritaire, "cell 5 3,growx");
			txtNomDuPropritaire.setColumns(10);
		}
		
		//coordonnees-------------------------------------------------------------------------
		
			txtCoordonnesDuPropritaire = new JTextField();
			txtCoordonnesDuPropritaire.setHorizontalAlignment(SwingConstants.CENTER);
			
			txtCoordonnesDuPropritaire.addFocusListener(new FocusListener() {
				@Override
				public void focusLost(FocusEvent e) {
				}
				@Override
				public void focusGained(FocusEvent e) {
					txtCoordonnesDuPropritaire.selectAll();
				}
			});
			
			txtCoordonnesDuPropritaire.addKeyListener(new KeyListener() {
				@Override
				public void keyTyped(KeyEvent e) {
				}
				@Override
				public void keyReleased(KeyEvent e) {
				}
				@Override
				public void keyPressed(KeyEvent e) {
					if((!txtNomDuPropritaire.getText().equals ("Nom du propriétaire") ) && (!txtCoordonnesDuPropritaire.getText().equals ("Coordonnées du propriétaire") ))
						okButton.setEnabled(true);
					else{okButton.setEnabled(false);
				 	}
				}				
			});
		{
			JLabel lblCoordonnes = new JLabel("Coordonn\u00E9es");
			contentPanel.add(lblCoordonnes, "cell 4 4,alignx trailing");
		}
		{
			txtCoordonnesDuPropritaire.setText("Coordonn\u00E9es du propri\u00E9taire");
			contentPanel.add(txtCoordonnesDuPropritaire, "cell 5 4,growx");
			txtCoordonnesDuPropritaire.setColumns(10);
		}
		//---------------------------------------------------------------------------------------
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Quitter");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	
	
}
