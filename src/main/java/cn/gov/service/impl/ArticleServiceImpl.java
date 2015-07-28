package cn.gov.service.impl;

import java.util.List;
import java.util.Map;

import cn.gov.dao.ArticleMapper;
import cn.gov.dao.ArticleMapper;
import cn.gov.dao.ExtraMapper;
import cn.gov.model.Article;
import cn.gov.model.ArticleExample;
import cn.gov.service.ArticleService;

public class ArticleServiceImpl implements ArticleService {
	private ArticleExample articleExample;
	private ArticleMapper articleMapper;
	private ExtraMapper extraMapper;
	public void insert(Article article) {
		articleMapper.insert(article);
	}

	public int update(Article article) {
		return articleMapper.updateByPrimaryKeyWithBLOBs(article);
	}

	public int updateSelective(Article article) {
		return articleMapper.updateByPrimaryKeySelective(article);
	}

	public int delete(Integer id) {
		return articleMapper.deleteByPrimaryKey(id);
	}

	public Article queryArticleById(Integer id) {
		return articleMapper.selectByPrimaryKey(id);
	}

	public List query(Map map) {
		return extraMapper.queryArticle(map);
	}

	public int count(Map map) {
		return extraMapper.countArticle(map);
	}

	public List queryTopArticle(Map map) {
		return extraMapper.queryTopArticle(map);
	}

	public List queryHotArticle(Map map) {
		return extraMapper.queryHotArticle(map);
	}

	public ArticleExample getArticleExample() {
		return articleExample;
	}

	public void setArticleExample(ArticleExample articleExample) {
		this.articleExample = articleExample;
	}

	public ArticleMapper getArticleMapper() {
		return articleMapper;
	}

	public void setArticleMapper(ArticleMapper articleMapper) {
		this.articleMapper = articleMapper;
	}

	public ExtraMapper getExtraMapper() {
		return extraMapper;
	}

	public void setExtraMapper(ExtraMapper extraMapper) {
		this.extraMapper = extraMapper;
	}
	
}
