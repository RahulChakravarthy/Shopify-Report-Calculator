
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
    "email",
    "accepts_marketing",
    "created_at",
    "updated_at",
    "first_name",
    "last_name",
    "orders_count",
    "state",
    "total_spent",
    "last_order_id",
    "note",
    "verified_email",
    "multipass_identifier",
    "tax_exempt",
    "phone",
    "tags",
    "last_order_name",
    "default_address"
})
public class Customer {

    @SerializedName("id")
    private BigInteger id;
    @SerializedName("email")
    private String email;
    @SerializedName("accepts_marketing")
    private Boolean acceptsMarketing;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("orders_count")
    private Integer ordersCount;
    @SerializedName("state")
    private String state;
    @SerializedName("total_spent")
    private String totalSpent;
    @SerializedName("last_order_id")
    private BigInteger lastOrderId;
    @SerializedName("note")
    private Object note;
    @SerializedName("verified_email")
    private Boolean verifiedEmail;
    @SerializedName("multipass_identifier")
    private Object multipassIdentifier;
    @SerializedName("tax_exempt")
    private Boolean taxExempt;
    @SerializedName("phone")
    private Object phone;
    @SerializedName("tags")
    private String tags;
    @SerializedName("last_order_name")
    private String lastOrderName;
    @SerializedName("default_address")
    private DefaultAddress defaultAddress;
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

    public Customer withId(BigInteger id) {
        this.id = id;
        return this;
    }

    @SerializedName("email")
    public String getEmail() {
        return email;
    }

    @SerializedName("email")
    public void setEmail(String email) {
        this.email = email;
    }

    public Customer withEmail(String email) {
        this.email = email;
        return this;
    }

    @SerializedName("accepts_marketing")
    public Boolean getAcceptsMarketing() {
        return acceptsMarketing;
    }

    @SerializedName("accepts_marketing")
    public void setAcceptsMarketing(Boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
    }

    public Customer withAcceptsMarketing(Boolean acceptsMarketing) {
        this.acceptsMarketing = acceptsMarketing;
        return this;
    }

    @SerializedName("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @SerializedName("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Customer withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @SerializedName("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @SerializedName("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Customer withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
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

    public Customer withFirstName(String firstName) {
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

    public Customer withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @SerializedName("orders_count")
    public Integer getOrdersCount() {
        return ordersCount;
    }

    @SerializedName("orders_count")
    public void setOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
    }

    public Customer withOrdersCount(Integer ordersCount) {
        this.ordersCount = ordersCount;
        return this;
    }

    @SerializedName("state")
    public String getState() {
        return state;
    }

    @SerializedName("state")
    public void setState(String state) {
        this.state = state;
    }

    public Customer withState(String state) {
        this.state = state;
        return this;
    }

    @SerializedName("total_spent")
    public String getTotalSpent() {
        return totalSpent;
    }

    @SerializedName("total_spent")
    public void setTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
    }

    public Customer withTotalSpent(String totalSpent) {
        this.totalSpent = totalSpent;
        return this;
    }

    @SerializedName("last_order_id")
    public BigInteger getLastOrderId() {
        return lastOrderId;
    }

    @SerializedName("last_order_id")
    public void setLastOrderId(BigInteger lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public Customer withLastOrderId(BigInteger lastOrderId) {
        this.lastOrderId = lastOrderId;
        return this;
    }

    @SerializedName("note")
    public Object getNote() {
        return note;
    }

    @SerializedName("note")
    public void setNote(Object note) {
        this.note = note;
    }

    public Customer withNote(Object note) {
        this.note = note;
        return this;
    }

    @SerializedName("verified_email")
    public Boolean getVerifiedEmail() {
        return verifiedEmail;
    }

    @SerializedName("verified_email")
    public void setVerifiedEmail(Boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
    }

    public Customer withVerifiedEmail(Boolean verifiedEmail) {
        this.verifiedEmail = verifiedEmail;
        return this;
    }

    @SerializedName("multipass_identifier")
    public Object getMultipassIdentifier() {
        return multipassIdentifier;
    }

    @SerializedName("multipass_identifier")
    public void setMultipassIdentifier(Object multipassIdentifier) {
        this.multipassIdentifier = multipassIdentifier;
    }

    public Customer withMultipassIdentifier(Object multipassIdentifier) {
        this.multipassIdentifier = multipassIdentifier;
        return this;
    }

    @SerializedName("tax_exempt")
    public Boolean getTaxExempt() {
        return taxExempt;
    }

    @SerializedName("tax_exempt")
    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public Customer withTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
        return this;
    }

    @SerializedName("phone")
    public Object getPhone() {
        return phone;
    }

    @SerializedName("phone")
    public void setPhone(Object phone) {
        this.phone = phone;
    }

    public Customer withPhone(Object phone) {
        this.phone = phone;
        return this;
    }

    @SerializedName("tags")
    public String getTags() {
        return tags;
    }

    @SerializedName("tags")
    public void setTags(String tags) {
        this.tags = tags;
    }

    public Customer withTags(String tags) {
        this.tags = tags;
        return this;
    }

    @SerializedName("last_order_name")
    public String getLastOrderName() {
        return lastOrderName;
    }

    @SerializedName("last_order_name")
    public void setLastOrderName(String lastOrderName) {
        this.lastOrderName = lastOrderName;
    }

    public Customer withLastOrderName(String lastOrderName) {
        this.lastOrderName = lastOrderName;
        return this;
    }

    @SerializedName("default_address")
    public DefaultAddress getDefaultAddress() {
        return defaultAddress;
    }

    @SerializedName("default_address")
    public void setDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public Customer withDefaultAddress(DefaultAddress defaultAddress) {
        this.defaultAddress = defaultAddress;
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

    public Customer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(email).append(acceptsMarketing).append(createdAt).append(updatedAt).append(firstName).append(lastName).append(ordersCount).append(state).append(totalSpent).append(lastOrderId).append(note).append(verifiedEmail).append(multipassIdentifier).append(taxExempt).append(phone).append(tags).append(lastOrderName).append(defaultAddress).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Customer) == false) {
            return false;
        }
        Customer rhs = ((Customer) other);
        return new EqualsBuilder().append(id, rhs.id).append(email, rhs.email).append(acceptsMarketing, rhs.acceptsMarketing).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(firstName, rhs.firstName).append(lastName, rhs.lastName).append(ordersCount, rhs.ordersCount).append(state, rhs.state).append(totalSpent, rhs.totalSpent).append(lastOrderId, rhs.lastOrderId).append(note, rhs.note).append(verifiedEmail, rhs.verifiedEmail).append(multipassIdentifier, rhs.multipassIdentifier).append(taxExempt, rhs.taxExempt).append(phone, rhs.phone).append(tags, rhs.tags).append(lastOrderName, rhs.lastOrderName).append(defaultAddress, rhs.defaultAddress).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
