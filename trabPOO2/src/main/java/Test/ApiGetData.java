package Test;

import java.awt.Color;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ApiGetData extends JPanel {
	private static final long serialVersionUID = 1L;

	private static final String EXIT_ON_CLOSE = null;
	
	public ArrayList<Champion> addContato = new ArrayList<Champion>();
	private JLabel champion, token ,icone;
	private JTextField campoChampion, campoToken;
	private JButton button;
	
	public void championNameGet() {
		setBounds(0, 0, 1250, 800);
		setBackground(Color.decode("#eeeeee")); 
		setLayout(null);
	}
	
	public ApiGetData() {
		setBackground(Color.blue);
		setSize(500, 510);
		setLayout(null);
		setDefautCloseOperation(EXIT_ON_CLOSE);
		componentes();
		ação();
		setVisible(true);		
	}

	private void ação() {
		// TODO Auto-generated method stub
		
	}

	private void componentes() {
		// TODO Auto-generated method stub
		
	}

	private void setDefautCloseOperation(String exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	public JLabel getChampion() {
		return champion;
	}

	public void setChampion(JLabel champion) {
		this.champion = champion;
	}

	public JLabel getToken() {
		return token;
	}

	public void setToken(JLabel token) {
		this.token = token;
	}

	public JLabel getIcone() {
		return icone;
	}

	public void setIcone(JLabel icone) {
		this.icone = icone;
	}

	public JTextField getCampoChampion() {
		return campoChampion;
	}

	public void setCampoChampion(JTextField campoChampion) {
		this.campoChampion = campoChampion;
	}

	public JTextField getCampoToken() {
		return campoToken;
	}

	public void setCampoToken(JTextField campoToken) {
		this.campoToken = campoToken;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}
	
}
