package com.example;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {

	@Autowired
	SqlSession sqlSession;

	public int insertBoard(BoardVO vo) {
		return sqlSession.insert("Board.insertBoard", vo);
	}

	// 글 삭제
	public int deleteBoard(int id) {
		return sqlSession.delete("Board.deleteBoard", id);
	}

	public int updateBoard(BoardVO vo) {
		return sqlSession.update("Board.updateBoard", vo);
	}

	public BoardVO getBoard(int seq) {
		BoardVO one = sqlSession.selectOne("Board.getBoard", seq);
		return one;
	}

	public List<BoardVO> getBoardList() {
		List<BoardVO> list = sqlSession.selectList("Board.getBoardList");
		return list;
	}

}
