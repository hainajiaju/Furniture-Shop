package cn.haina.prodetails.service;

import cn.haina.dao.CommentDao;
import cn.haina.entity.Comment;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentDao commentDao;
    @Override
    /**
     * 根据spuid查询相关评论
     */
    public List<Comment> queryCommetBySpuId(Long spuid) {
        return commentDao.queryCommetBySpuId(spuid);
    }
}
