package com.heima.article.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.heima.model.article.dtos.ArticleHomeDto;
import com.heima.model.article.pojos.ApArticle;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 文章mapper
 * @author Honmono
 */
@Mapper
public interface ApArticleMapper extends BaseMapper<ApArticle> {

    /**
     * 加载文章列表
     * @param dto 查询条件
     * @param type 类型：  1-加载更多   2-加载最新
     * @return
     */
    public List<ApArticle> loadArticleList(ArticleHomeDto dto,Short type);
}
