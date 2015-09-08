package cn.gov.dao;

import cn.gov.model.Appointment;
import cn.gov.model.AppointmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface AppointmentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    int countByExample(AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    int deleteByExample(AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    @Delete({
        "delete from appointment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    @Insert({
        "insert into appointment (id, org_name, ",
        "leader_name, post, ",
        "contact_person, contact_info, ",
        "number, content, ",
        "date)",
        "values (#{id,jdbcType=INTEGER}, #{orgName,jdbcType=VARCHAR}, ",
        "#{leaderName,jdbcType=VARCHAR}, #{post,jdbcType=VARCHAR}, ",
        "#{contactPerson,jdbcType=VARCHAR}, #{contactInfo,jdbcType=VARCHAR}, ",
        "#{number,jdbcType=INTEGER}, #{content,jdbcType=VARCHAR}, ",
        "#{date,jdbcType=TIMESTAMP})"
    })
    int insert(Appointment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    int insertSelective(Appointment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    List<Appointment> selectByExample(AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, org_name, leader_name, post, contact_person, contact_info, number, content, ",
        "date",
        "from appointment",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Appointment selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Appointment record, @Param("example") AppointmentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Appointment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table appointment
     *
     * @mbggenerated
     */
    @Update({
        "update appointment",
        "set org_name = #{orgName,jdbcType=VARCHAR},",
          "leader_name = #{leaderName,jdbcType=VARCHAR},",
          "post = #{post,jdbcType=VARCHAR},",
          "contact_person = #{contactPerson,jdbcType=VARCHAR},",
          "contact_info = #{contactInfo,jdbcType=VARCHAR},",
          "number = #{number,jdbcType=INTEGER},",
          "content = #{content,jdbcType=VARCHAR},",
          "date = #{date,jdbcType=TIMESTAMP}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Appointment record);
}