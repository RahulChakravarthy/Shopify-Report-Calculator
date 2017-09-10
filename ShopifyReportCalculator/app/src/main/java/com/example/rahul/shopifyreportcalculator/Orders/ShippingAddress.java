
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

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "first_name",
    "address1",
    "phone",
    "city",
    "zip",
    "province",
    "country",
    "last_name",
    "address2",
    "company",
    "latitude",
    "longitude",
    "name",
    "country_code",
    "province_code"
})
public class ShippingAddress {

    @SerializedName("first_name")
    private String firstName;
    @SerializedName("address1")
    private String address1;
    @SerializedName("phone")
    private String phone;
    @SerializedName("city")
    private String city;
    @SerializedName("zip")
    private String zip;
    @SerializedName("province")
    private String province;
    @SerializedName("country")
    private String country;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("address2")
    private Object address2;
    @SerializedName("company")
    private Object company;
    @SerializedName("latitude")
    private Double latitude;
    @SerializedName("longitude")
    private Double longitude;
    @SerializedName("name")
    private String name;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("province_code")
    private String provinceCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @SerializedName("first_name")
    public String getFirstName() {
        return firstName;
    }

    @SerializedName("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public ShippingAddress withFirstName(String firstName) {
        this.firstName = firstName;
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

    public ShippingAddress withAddress1(String address1) {
        this.address1 = address1;
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

    public ShippingAddress withPhone(String phone) {
        this.phone = phone;
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

    public ShippingAddress withCity(String city) {
        this.city = city;
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

    public ShippingAddress withZip(String zip) {
        this.zip = zip;
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

    public ShippingAddress withProvince(String province) {
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

    public ShippingAddress withCountry(String country) {
        this.country = country;
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

    public ShippingAddress withLastName(String lastName) {
        this.lastName = lastName;
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

    public ShippingAddress withAddress2(Object address2) {
        this.address2 = address2;
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

    public ShippingAddress withCompany(Object company) {
        this.company = company;
        return this;
    }

    @SerializedName("latitude")
    public Double getLatitude() {
        return latitude;
    }

    @SerializedName("latitude")
    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public ShippingAddress withLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    @SerializedName("longitude")
    public Double getLongitude() {
        return longitude;
    }

    @SerializedName("longitude")
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public ShippingAddress withLongitude(Double longitude) {
        this.longitude = longitude;
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

    public ShippingAddress withName(String name) {
        this.name = name;
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

    public ShippingAddress withCountryCode(String countryCode) {
        this.countryCode = countryCode;
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

    public ShippingAddress withProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
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

    public ShippingAddress withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(firstName).append(address1).append(phone).append(city).append(zip).append(province).append(country).append(lastName).append(address2).append(company).append(latitude).append(longitude).append(name).append(countryCode).append(provinceCode).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ShippingAddress) == false) {
            return false;
        }
        ShippingAddress rhs = ((ShippingAddress) other);
        return new EqualsBuilder().append(firstName, rhs.firstName).append(address1, rhs.address1).append(phone, rhs.phone).append(city, rhs.city).append(zip, rhs.zip).append(province, rhs.province).append(country, rhs.country).append(lastName, rhs.lastName).append(address2, rhs.address2).append(company, rhs.company).append(latitude, rhs.latitude).append(longitude, rhs.longitude).append(name, rhs.name).append(countryCode, rhs.countryCode).append(provinceCode, rhs.provinceCode).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
