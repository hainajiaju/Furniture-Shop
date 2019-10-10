package cn.haina.prodetails.service;

import cn.haina.entity.Comment;
import java.util.List;

public interface CommentService {
    /**
     * 根据spuid查询相关评论
     * @param spuid
     * @return
     */
    List<Comment> queryCommetBySpuId(Long spuid);
}
