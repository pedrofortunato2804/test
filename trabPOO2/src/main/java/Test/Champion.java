package Test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;

import org.json.JSONObject;

import ApiSearch.Api;
import ApiSearch.JsonParser;

public class Champion {
	private static final String EXIT_ON_CLOSE = null;
	String Champion;
	String token = "RGAPI-e326a15e-78fd-4bad-9b06-95fe4cdb79fc";
	
	JLabel lore;
	JButton voltar;
	
	public void TelaDados(String championName, String ptoken) throws IOException {
		
		Champion = championName;
		token = ptoken;
		this.setSize(1000, 700);
		this.setTitle(Champion);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		componentes();
		ação();
		this.setVisible(true);
		this.getContentPane().setBackground(Color.white);
	}

	private void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private JComponent getContentPane() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setDefaultCloseOperation(String exitOnClose) {
		// TODO Auto-generated method stub
		
	}

	private void setLocationRelativeTo(Object object) {
		// TODO Auto-generated method stub
		
	}

	private void setLayout(Object object) {
		// TODO Auto-generated method stub
		
	}

	private void setTitle(String nomeInvocador2) {
		// TODO Auto-generated method stub
		
	}

	private void setSize(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	private void componentes() throws IOException 
	{

		String urlChampion = String.format("http://ddragon.leagueoflegends.com/cdn/10.14.1/data/pt_BR/champion/%s.json", Champion);
		Map<String, String> cabecalhos = new HashMap<String, String>();
		cabecalhos.put("X-Riot-Token",token);
		
		lore.setLayout(new java.awt.GridBagLayout());
	    JLabel label = new JLabel("lore");
	    lore.add(label);
		
		String[] nameChampions = new String[] {"Aatrox", "Ahri", "Akali", "Alistar", "Amumu", "Anivia", "Annie", "Aphelios", "Ashe", "AurelionSol", "Azir", "Bard", "Blitzcrank", "Brand", "Braum", "Caitlyn", "Camille", "Cassiopeia", "Chogath", "Corki", "Darius", "Diana", "DrMundo", "Draven", "Ekko", "Elise", "Evelynn", "Ezreal", "Fiddlesticks", "Fiora", "Fizz", "Galio", "Gangplank", "Garen", "Gnar", "Gragas", "Graves", "Hecarim", "Heimerdinger", "Illaoi", "Irelia", "Ivern", "Janna", "JarvanIV", "Jax", "Jayce", "Jhin", "Jinx", "Kaisa", "Kalista", "Karma", "Karthus", "Kassadin", "Katarina", "Kayle", "Kayn", "Kennen", "Khazix", "Kindred", "Kled", "KogMaw", "Leblanc", "LeeSin", "Leona", "Lissandra", "Lucian", "Lulu", "Lux", "Malphite", "Malzahar", "Maokai", "MasterYi", "MissFortune", "Mordekaiser", "Morgana", "Nami", "Nasus", "Nautilus", "Neeko", "Nidalee", "Nocturne", "Nunu", "Olaf", "Orianna", "Ornn", "Pantheon", "Poppy", "Pyke", "Qiyana", "Quinn", "Rakan", "Rammus", "RekSai", "Renekton", "Rengar", "Riven", "Rumble", "Ryze", "Sejuani", "Senna", "Sett", "Shaco", "Shen", "Shyvana", "Singed", "Sion", "Sivir", "Skarner", "Sona", "Soraka", "Swain", "Sylas", "Syndra", "TahmKench", "Taliyah", "Talon", "Taric", "Teemo", "Thresh", "Tristana", "Trundle", "Tryndamere", "TwistedFate", "Twitch", "Udyr", "Urgot", "Varus", "Vayne", "Veigar", "Velkoz", "Vi", "Viktor", "Vladimir", "Volibear", "Warwick", "Xayah", "Xerath", "XinZhao", "Yasuo", "Yorick", "Yuumi", "Zac", "Zed", "Ziggs", "Zilean", "Zoe", "Zyra"};	
		ArrayList<String> idChampions = new ArrayList<String>();
		for(int i = 0; i < nameChampions.length; i++) {
			String url_apiChampions = String.format("http://ddragon.leagueoflegends.com/cdn/10.14.1/data/pt_BR/champion/%s.json", nameChampions[i]);
			Api apiChampions = new Api(url_apiChampions);
					
			JSONObject champions = JsonParser.parseToObject(apiChampions.executar(cabecalhos));
			JSONObject idChampion = champions.getJSONObject("data");
			JSONObject nome = idChampion.getJSONObject(nameChampions[i]);
			int idNome = nome.getInt("key");
			String strIdNome = Integer.toString(idNome);
			idChampions.add(strIdNome);
		
		}							
	}

	private void ação() 
	{
		voltar.addActionListener( new ActionListener(){
					
					public void actionPerformed(ActionEvent e) {
						ApiGetData ApiGetData = new ApiGetData();
						Champion.this.dispose();
					}
				});
		
	}
	
	protected void dispose() {
		// TODO Auto-generated method stub
		
	}
}
