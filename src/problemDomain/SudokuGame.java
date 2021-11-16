package problemDomain;

import java.io.Serializable;

import constans.GameState;

public class SudokuGame implements Serializable {
	private final GameState gameState;
	private final int[][] gridState;

	
	public static final int GRID_BOUNDARY = 9;
	
	public SudokuGame (GameState gamestate, int[][] gridState) {
		this.gameState = gamestate;
		this.gridState = gridState;
	}
	
	public GameState getGameState() {
		return gameState;
		
	}
	
	public int[][] getCopyGridState(){
		return SudokuUtilites.copyToNewArray(gridState);
	}
	
	

}
