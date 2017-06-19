 
public class PlayerManager {

	private Player[] players;
	
	public PlayerManager(){
		players = createPlayer();
		
	
	}
private Player[] createPlayer(){
	//Player[] players = new Player[6];
	//players[0].setName("tom brady");
	//players[0].setTeam("patriots");
	
		players[0]= new Player("tom brady" , "patriots" , "QB" , "93" , "142" , "65.5" , "47.3" , "1137" ,"8.0;
	
	//Player p1 = Player("Tom Brady" , "Patriots" , "QB" , "93" , "142" , "65.5" , "47.3" , "1137" );
	//List[0] = p1;
	//Player p2 = Player( "Matt Ryan" , "Falcons" , "QB" , "70" , "98" , "71.4" , "32.7" , "1014");
	//List[1] = p2;
	//Player p1 = Player("Aaron Rodgers" , "packers" , "QB" , "80" , "128" , "62.5" , "42.7" , "1004");
	//List[2] = p3;
	//Player p1 = Player("Ben Roethlisberger" , "Steelers" , "QB" , "64" , "96" , "66.7" , "32.0" , "735" );
	//List[3] = p4;
	//Player p1 = Player("Russell Wilson" , "SeaHawks" , "QB" , "40" , "60" , "66.7" , "30.0" , "449");
	//List[4] = p5;
	//Player p1 = Player("Dak Prescott" , "Cowboys" , "24" , "38" , "63.2" , "38.0" , "302" );
	//List[5] = p6;
	
	return players;
}
}
