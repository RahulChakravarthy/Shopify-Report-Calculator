
package com.example.rahul.shopifyreportcalculator.Orders;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.google.gson.annotations.SerializedName;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "customer_id",
    "first_name",
    "last_name",
    "company",
    "address1",
    "address2",
    "city",
    "province",
    "country",
    "zip",
    "phone",
    "name",
    "province_code",
    "country_code",
    "country_name",
    "default"
})
public class DefaultAddress {

    @SerializedName("id")
    private BigInteger id;
    @SerializedName("customer_id")
    private BigInteger customerId;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("company")
    private Object company;
    @SerializedName("address1")
    private String address1;
    @SerializedName("address2")
    private Object address2;
    @SerializedName("city")
    private String city;
    @SerializedName("province")
    private String province;
    @SerializedName("country")
    private String country;
    @SerializedName("zip")
    private String zip;
    @SerializedName("phone")
    private String phone;
    @SerializedName("name")
    private String name;
    @SerializedName("province_code")
    private String provinceCode;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("country_name")
    private String countryName;
    @SerializedName("default")
    private Boolean _default;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @SerializedName("id")
    public BigInteger getId() {
        return id;
    }

    @SerializedName("id")
    public void setId(BigInteger id) {
        this.id = id;
    }

    public DefaultAddress withId(BigInteger id) {
        this.id = id;
        return this;
    }

    @SerializedName("customer_id")
    public BigInteger getCustomerId() {
        return customerId;
    }

    @SerializedName("customer_id")
    public void setCustomerId(BigInteger customerId) {
        this.customerId = customerId;
    }

    public DefaultAddress withCustomerId(BigInteger customerId) {
        this.customerId = customerId;
        return this;
    }

    @SerializedName("first_name")
    public String getFirstName() {
        return firstName;
    }

    @SerializedName("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public DefaultAddress withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @SerializedName("last_name")
    public String getLastName() {
        return lastName;
    }

    @SerializedName("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public DefaultAddress withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @SerializedName("company")
    public Object getCompany() {
        return company;
    }

    @SerializedName("company")
    public void setCompany(Object company) {
        this.company = company;
    }

    public DefaultAddress withCompany(Object company) {
        this.company = company;
        return this;
    }

    @SerializedName("address1")
    public String getAddress1() {
        return address1;
    }

    @SerializedName("address1")
    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public DefaultAddress withAddress1(String address1) {
        this.address1 = address1;
        return this;
    }

    @SerializedName("address2")
    public Object getAddress2() {
        return address2;
    }

    @SerializedName("address2")
    public void setAddress2(Object address2) {
        this.address2 = address2;
    }

    public DefaultAddress withAddress2(Object address2) {
        this.address2 = address2;
        return this;
    }

    @SerializedName("city")
    public String getCity() {
        return city;
    }

    @SerializedName("city")
    public void setCity(String city) {
        this.city = city;
    }

    public DefaultAddress withCity(String city) {
        this.city = city;
        return this;
    }

    @SerializedName("province")
    public String getProvince() {
        return province;
    }

    @SerializedName("province")
    public void setProvince(String province) {
        this.province = province;
    }

    public DefaultAddress withProvince(String province) {
        this.province = province;
        return this;
    }

    @SerializedName("country")
    public String getCountry() {
        return country;
    }

    @SerializedName("country")
    public void setCountry(String country) {
        this.country = country;
    }

    public DefaultAddress withCountry(String country) {
        this.country = country;
        return this;
    }

    @SerializedName("zip")
    public String getZip() {
        return zip;
    }

    @SerializedName("zip")
    public void setZip(String zip) {
        this.zip = zip;
    }

    public DefaultAddress withZip(String zip) {
        this.zip = zip;
        return this;
    }

    @SerializedName("phone")
    public String getPhone() {
        return phone;
    }

    @SerializedName("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public DefaultAddress withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @SerializedName("name")
    public String getName() {
        return name;
    }

    @SerializedName("name")
    public void setName(String name) {
        this.name = name;
    }

    public DefaultAddress withName(String name) {
        this.name = name;
        return this;
    }

    @SerializedName("province_code")
    public String getProvinceCode() {
        return provinceCode;
    }

    @SerializedName("province_code")
    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public DefaultAddress withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
        return this;
    }

    @SerializedName("country_code")
    public String getCountryCode() {
        return countryCode;
    }

    @SerializedName("country_code")
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public DefaultAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    @SerializedName("country_name")
    public String getCountryName() {
        return countryName;
    }

    @SerializedName("country_name")
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public DefaultAddress withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    @SerializedName("default")
    public Boolean getDefault() {
        return _default;
    }

    @SerializedName("default")
    public void setDefault(Boolean _default) {
        this._default = _default;
    }

    public DefaultAddress withDefault(Boolean _default) {
        this._default = _default;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public DefaultAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(customerId).append(firstName).append(lastName).append(company).append(address1).append(address2).append(city).append(province).append(country).append(zip).append(phone).append(name).append(provinceCode).append(countryCode).append(countryName).append(_default).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DefaultAddress) == false) {
            return false;
        }
        DefaultAddress rhs = ((DefaultAddress) other);
        return new EqualsBuilder().append(id, rhs.id).append(customerId, rhs.customerId).append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(company, rhs.company).append(address1, rhs.address1).append(address2, rhs.address2).append(city, rhs.city).append(province, rhs.province).append(country, rhs.country).append(zip, rhs.zip).append(phone, rhs.phone).append(name, rhs.name).append(provinceCode, rhs.provinceCode).append(countryCode, rhs.countryCode).append(countryName, rhs.countryName).append(_default, rhs._default).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
