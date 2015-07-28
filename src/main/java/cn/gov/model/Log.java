package cn.gov.model;

import java.util.Date;

public class Log {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.ip
     *
     * @mbggenerated
     */
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.user
     *
     * @mbggenerated
     */
    private String user;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.drsj
     *
     * @mbggenerated
     */
    private Date drsj;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column log.sfcg
     *
     * @mbggenerated
     */
    private Boolean sfcg;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.id
     *
     * @return the value of log.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.id
     *
     * @param id the value for log.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.ip
     *
     * @return the value of log.ip
     *
     * @mbggenerated
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.ip
     *
     * @param ip the value for log.ip
     *
     * @mbggenerated
     */
    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.user
     *
     * @return the value of log.user
     *
     * @mbggenerated
     */
    public String getUser() {
        return user;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.user
     *
     * @param user the value for log.user
     *
     * @mbggenerated
     */
    public void setUser(String user) {
        this.user = user == null ? null : user.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.drsj
     *
     * @return the value of log.drsj
     *
     * @mbggenerated
     */
    public Date getDrsj() {
        return drsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.drsj
     *
     * @param drsj the value for log.drsj
     *
     * @mbggenerated
     */
    public void setDrsj(Date drsj) {
        this.drsj = drsj;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column log.sfcg
     *
     * @return the value of log.sfcg
     *
     * @mbggenerated
     */
    public Boolean getSfcg() {
        return sfcg;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column log.sfcg
     *
     * @param sfcg the value for log.sfcg
     *
     * @mbggenerated
     */
    public void setSfcg(Boolean sfcg) {
        this.sfcg = sfcg;
    }
}