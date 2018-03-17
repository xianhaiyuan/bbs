package com.lny.bbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lny.bbs.dao.CommentMapper;
import com.lny.bbs.pojo.Comment;
import com.lny.bbs.pojo.CommentVo;
import com.lny.bbs.pojo.pageQueryVo;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentMapper commentMapper;

	public Integer addComment(Comment comment) {
		return commentMapper.insertComment(comment);
	}

	public Integer getCommentCountByAid(Integer aid) {
		return commentMapper.selectCommentCountByAid(aid);
	}

	public List<CommentVo> getCommentPageByAid(pageQueryVo pageQueryVo, Integer aid) {
		return commentMapper.selectCommentPageByAid(pageQueryVo,aid);
	}
}