package com.yoann.dahouet;

import java.awt.EventQueue;

import javax.swing.JFrame;

import com.yoann.dahouet.dao.ClasseDAO;
import com.yoann.dahouet.dao.VoilierDAO;
import com.yoann.dahouet.ui.UIVoilier;

public class AppDahouet1 {

	private UIVoilier mainUI;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppDahouet1 window = new AppDahouet1();
					window.mainUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		ClasseDAO.getListClasse();
	}

	/**
	 * Create the application.
	 */
	public AppDahouet1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		mainUI = new UIVoilier();
		mainUI.setBounds(100, 100, 450, 300);
		mainUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
