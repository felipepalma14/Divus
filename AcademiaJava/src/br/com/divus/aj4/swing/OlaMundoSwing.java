package br.com.divus.aj4.swing;

import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class OlaMundoSwing extends JFrame {
	
	public OlaMundoSwing(){
		setTitle("Minha primeira janela top na balada");
		setSize(250,250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel label = new JLabel("Nome Completo");
		
		Icon salvarIcon = new ImageIcon("C:\\Users\\LAB101\\Pictures\\save.png");
		//C:\Users\LAB101\Pictures\save.png
		JButton btnSalvar = new JButton("Salvar",salvarIcon);
		
		
		btnSalvar.setMnemonic(KeyEvent.VK_S); // Alt + S
		
		JTextField textField = new JTextField();
		JComboBox<String> comboNomes = new JComboBox<String>();
		
		comboNomes.addItem("Felipe");
		comboNomes.addItem("Clara");
		add(label);
		add(btnSalvar);
		add(textField);
		add(comboNomes);
		setVisible(true);
	}
	//Start a aplica��o
	public static void main(String[] args) {
		// main deve ser externo as classes frames
		
		OlaMundoSwing tela = new OlaMundoSwing();
	}

}
