package springstudy.mapboard.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import springstudy.mapboard.model.Board;

@Repository
public interface BoardMapper {
	List<Board> selectBoardList();
}
