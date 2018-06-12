package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import vo.Board;

public class BoardDAO {
	private SqlSessionFactory factory = MybatisConfig.getResourceAsReader();
	public boolean insertBoard(Board board) {
		SqlSession session = null;
		boolean result = false;
		int cnt = 0;
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			cnt = mapper.insertBoard(board);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("인설트실패");
			return false;
		} finally {
			if (session != null) session.close();
		}
		if (cnt > 0) {
			result = true;
		}
		
		return result;
	}
	public List<Board> selectBoard() {
		SqlSession session = null;
		List<Board> listboard;
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			listboard = mapper.selectBoard();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("보드셀랙실패");
			return null;
		} finally {
			if (session != null) session.close();
		}
		
		return listboard;
	}
	public Board selectBoardRead(Board sboard) {
		SqlSession session = null;
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			sboard = mapper.selectBoardRead(sboard);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("보드셀랙실패");
			return null;
		} finally {
			if (session != null) session.close();
		}
		return sboard;
	}
	public int countBoard() {
		int count = 0;
		SqlSession session = null;
		try {
			session = factory.openSession();
			BoardMapper mapper = session.getMapper(BoardMapper.class);
			count = mapper.countBoard();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("보드셀랙실패");
			return 0;
		} finally {
			if (session != null) session.close();
		}
		return count;
	}
}
