package nakah.tictactoe.score;

import java.io.IOException;

import nakah.tictactoe.core.Player;

public interface ScoreManager {
	
	public Integer getScore(Player player);
	
	public void saveScore(Player player) throws IOException;
	
}
