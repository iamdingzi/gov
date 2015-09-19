package cn.gov.dao;

import cn.gov.model.Article;
import cn.gov.model.ArticleExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int countByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int deleteByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @Delete({
        "delete from article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @Insert({
        "insert into article (id, title, ",
        "cat_id, date, source, ",
        "short_title, position_id, ",
        "display, read_time, keyword, ",
        "summary, thumb, ",
        "url, doc, redirect, ",
        "content)",
        "values (#{id,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR}, ",
        "#{catId,jdbcType=INTEGER}, #{date,jdbcType=TIMESTAMP}, #{source,jdbcType=VARCHAR}, ",
        "#{shortTitle,jdbcType=VARCHAR}, #{positionId,jdbcType=INTEGER}, ",
        "#{display,jdbcType=BIT}, #{readTime,jdbcType=INTEGER}, #{keyword,jdbcType=VARCHAR}, ",
        "#{summary,jdbcType=VARCHAR}, #{thumb,jdbcType=VARCHAR}, ",
        "#{url,jdbcType=VARCHAR}, #{doc,jdbcType=VARCHAR}, #{redirect,jdbcType=BIT}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int insertSelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    List<Article> selectByExampleWithBLOBs(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    List<Article> selectByExample(ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, title, cat_id, date, source, short_title, position_id, display, read_time, ",
        "keyword, summary, thumb, url, doc, redirect, content",
        "from article",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    Article selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Article record, @Param("example") ArticleExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @Update({
        "update article",
        "set title = #{title,jdbcType=VARCHAR},",
          "cat_id = #{catId,jdbcType=INTEGER},",
          "date = #{date,jdbcType=TIMESTAMP},",
          "source = #{source,jdbcType=VARCHAR},",
          "short_title = #{shortTitle,jdbcType=VARCHAR},",
          "position_id = #{positionId,jdbcType=INTEGER},",
          "display = #{display,jdbcType=BIT},",
          "read_time = #{readTime,jdbcType=INTEGER},",
          "keyword = #{keyword,jdbcType=VARCHAR},",
          "summary = #{summary,jdbcType=VARCHAR},",
          "thumb = #{thumb,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "doc = #{doc,jdbcType=VARCHAR},",
          "redirect = #{redirect,jdbcType=BIT},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table article
     *
     * @mbggenerated
     */
    @Update({
        "update article",
        "set title = #{title,jdbcType=VARCHAR},",
          "cat_id = #{catId,jdbcType=INTEGER},",
          "date = #{date,jdbcType=TIMESTAMP},",
          "source = #{source,jdbcType=VARCHAR},",
          "short_title = #{shortTitle,jdbcType=VARCHAR},",
          "position_id = #{positionId,jdbcType=INTEGER},",
          "display = #{display,jdbcType=BIT},",
          "read_time = #{readTime,jdbcType=INTEGER},",
          "keyword = #{keyword,jdbcType=VARCHAR},",
          "summary = #{summary,jdbcType=VARCHAR},",
          "thumb = #{thumb,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "doc = #{doc,jdbcType=VARCHAR},",
          "redirect = #{redirect,jdbcType=BIT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Article record);
}