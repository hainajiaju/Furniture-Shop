package cn.haina;

import cn.haina.entity.Comment;
import cn.haina.prodetails.service.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CommentTest {
    @Resource
    private CommentService commentService;
    @Test
    /**
     * 根据spuid查询相关评论
     */
    public void queryCommentBySpuId(){
        List<Comment> comments = commentService.queryCommetBySpuId(1l);
        for (Comment comment : comments) {
            System.out.println(comment);
        }

    }
}
