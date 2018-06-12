package dao;

import java.util.List;

import vo.Board;

public interface BoardMapper {
	public int insertBoard(Board board);
	public List<Board> selectBoard();
	public Board selectBoardRead(Board board);
	public int countBoard();
}
