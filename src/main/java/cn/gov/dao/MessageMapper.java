package cn.gov.dao;

import cn.gov.model.Message;
import cn.gov.model.MessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MessageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    int countByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    int deleteByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    @Delete({
        "delete from message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    @Insert({
        "insert into message (id, net_name, ",
        "ip, title, date, ",
        "display, telephone, ",
        "content)",
        "values (#{id,jdbcType=INTEGER}, #{netName,jdbcType=VARCHAR}, ",
        "#{ip,jdbcType=VARCHAR}, #{title,jdbcType=VARCHAR}, #{date,jdbcType=TIMESTAMP}, ",
        "#{display,jdbcType=BIT}, #{telephone,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    int insertSelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    List<Message> selectByExampleWithBLOBs(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    List<Message> selectByExample(MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, net_name, ip, title, date, display, telephone, content",
        "from message",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("ResultMapWithBLOBs")
    Message selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    int updateByExampleWithBLOBs(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    @Update({
        "update message",
        "set net_name = #{netName,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=TIMESTAMP},",
          "display = #{display,jdbcType=BIT},",
          "telephone = #{telephone,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKeyWithBLOBs(Message record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table message
     *
     * @mbggenerated
     */
    @Update({
        "update message",
        "set net_name = #{netName,jdbcType=VARCHAR},",
          "ip = #{ip,jdbcType=VARCHAR},",
          "title = #{title,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=TIMESTAMP},",
          "display = #{display,jdbcType=BIT},",
          "telephone = #{telephone,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Message record);
}