package com.ar.main.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user.userId
     *
     * @mbg.generated Tue Mar 05 19:01:58 CST 2019
     */
    private String userid;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Mar 05 19:01:58 CST 2019
     */
    public User(String userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Tue Mar 05 19:01:58 CST 2019
     */
    public User() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user.userId
     *
     * @return the value of user.userId
     *
     * @mbg.generated Tue Mar 05 19:01:58 CST 2019
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user.userId
     *
     * @param userid the value for user.userId
     *
     * @mbg.generated Tue Mar 05 19:01:58 CST 2019
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }
}