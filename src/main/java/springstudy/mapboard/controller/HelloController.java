package springstudy.mapboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import springstudy.mapboard.mapper.BoardMapper;
import springstudy.mapboard.model.Board;

@RestController
public class HelloController {
	private BoardMapper boardMapper;

	@Autowired
	public HelloController(BoardMapper boardMapper) {
		this.boardMapper = boardMapper;
	}

	@GetMapping("/")
	public List<Board> hello() {
		return boardMapper.selectBoardList();
	}
}
