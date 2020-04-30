package com.schoolSecuritySystem.pojo;

import java.io.Serializable;

public class AddressResponseInfo implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_response_info.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_response_info.address
     *
     * @mbggenerated
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_response_info.response_name
     *
     * @mbggenerated
     */
    private String responseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_response_info.response_mobile
     *
     * @mbggenerated
     */
    private String responseMobile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column address_response_info.response_email
     *
     * @mbggenerated
     */
    private String responseEmail;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table address_response_info
     *
     * @mbggenerated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_response_info.id
     *
     * @return the value of address_response_info.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_response_info.id
     *
     * @param id the value for address_response_info.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_response_info.address
     *
     * @return the value of address_response_info.address
     *
     * @mbggenerated
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_response_info.address
     *
     * @param address the value for address_response_info.address
     *
     * @mbggenerated
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_response_info.response_name
     *
     * @return the value of address_response_info.response_name
     *
     * @mbggenerated
     */
    public String getResponseName() {
        return responseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_response_info.response_name
     *
     * @param responseName the value for address_response_info.response_name
     *
     * @mbggenerated
     */
    public void setResponseName(String responseName) {
        this.responseName = responseName == null ? null : responseName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_response_info.response_mobile
     *
     * @return the value of address_response_info.response_mobile
     *
     * @mbggenerated
     */
    public String getResponseMobile() {
        return responseMobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_response_info.response_mobile
     *
     * @param responseMobile the value for address_response_info.response_mobile
     *
     * @mbggenerated
     */
    public void setResponseMobile(String responseMobile) {
        this.responseMobile = responseMobile == null ? null : responseMobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column address_response_info.response_email
     *
     * @return the value of address_response_info.response_email
     *
     * @mbggenerated
     */
    public String getResponseEmail() {
        return responseEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column address_response_info.response_email
     *
     * @param responseEmail the value for address_response_info.response_email
     *
     * @mbggenerated
     */
    public void setResponseEmail(String responseEmail) {
        this.responseEmail = responseEmail == null ? null : responseEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table address_response_info
     *
     * @mbggenerated
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", address=").append(address);
        sb.append(", responseName=").append(responseName);
        sb.append(", responseMobile=").append(responseMobile);
        sb.append(", responseEmail=").append(responseEmail);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}