package com.yoann.dahouet.ui;

import java.awt.BorderLayout;





import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JTextField;

import com.yoann.dahouet.dao.ClasseDAO;
import com.yoann.dahouet.dao.SerieDAO;


public class UIVoilier extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	public static JComboBox cbserie = new JComboBox();
	public static JComboBox cbclasse = new JComboBox();

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
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new MigLayout("", "[][][][][][grow]", "[][][][][][][][][]"));
		
		JLabel lblNomVoilier = new JLabel("Nom Voilier");
		panel.add(lblNomVoilier, "cell 4 1,alignx trailing");
		
		textField = new JTextField();
		panel.add(textField, "cell 5 1,growx");
		textField.setColumns(10);
		
		JLabel lblPropritaire = new JLabel("Propri\u00E9taire");
		panel.add(lblPropritaire, "cell 0 2,alignx trailing");
		
		JComboBox proprietaire = new JComboBox();
		panel.add(proprietaire, "cell 1 2 5 1,growx");
		
		JLabel lblClasse = new JLabel("Classe");
		panel.add(lblClasse, "cell 0 3,alignx trailing");
		
		
		ClasseDAO.remplirListClasse();
		panel.add(cbclasse, "cell 1 3 5 1,growx");
		
		JLabel lblSrie = new JLabel("S\u00E9rie");
		panel.add(lblSrie, "cell 0 4,alignx trailing");
		
		
		SerieDAO.remplirlistSerie();		
		panel.add(cbserie, "cell 1 4 5 1,growx");
		
		
		JButton btnOk = new JButton("OK");
		panel.add(btnOk, "flowx,cell 5 8,alignx right");
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		panel.add(btnCancel, "cell 5 8");
	}

}
