package com.dyz.persist.gamedata.user;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_id
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_name
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_age
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    private Byte age;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.f_addr
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    private String addr;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_id
     *
     * @return the value of t_user.f_id
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_id
     *
     * @param id the value for t_user.f_id
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_name
     *
     * @return the value of t_user.f_name
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_name
     *
     * @param name the value for t_user.f_name
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_age
     *
     * @return the value of t_user.f_age
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    public Byte getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_age
     *
     * @param age the value for t_user.f_age
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    public void setAge(Byte age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.f_addr
     *
     * @return the value of t_user.f_addr
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    public String getAddr() {
        return addr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.f_addr
     *
     * @param addr the value for t_user.f_addr
     *
     * @mbggenerated Sun Jan 25 12:46:09 CST 2015
     */
    public void setAddr(String addr) {
        this.addr = addr == null ? null : addr.trim();
    }
}