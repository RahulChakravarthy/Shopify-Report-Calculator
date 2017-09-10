
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "variant_id",
    "title",
    "quantity",
    "price",
    "grams",
    "sku",
    "variant_title",
    "vendor",
    "fulfillment_service",
    "product_id",
    "requires_shipping",
    "taxable",
    "gift_card",
    "name",
    "variant_inventory_management",
    "properties",
    "product_exists",
    "fulfillable_quantity",
    "total_discount",
    "fulfillment_status",
    "tax_lines"
})
public class LineItem {

    @SerializedName("id")
    private BigInteger id;
    @SerializedName("variant_id")
    private BigInteger variantId;
    @SerializedName("title")
    private String title;
    @SerializedName("quantity")
    private Integer quantity;
    @SerializedName("price")
    private String price;
    @SerializedName("grams")
    private Integer grams;
    @SerializedName("sku")
    private String sku;
    @SerializedName("variant_title")
    private String variantTitle;
    @SerializedName("vendor")
    private Object vendor;
    @SerializedName("fulfillment_service")
    private String fulfillmentService;
    @SerializedName("product_id")
    private BigInteger productId;
    @SerializedName("requires_shipping")
    private Boolean requiresShipping;
    @SerializedName("taxable")
    private Boolean taxable;
    @SerializedName("gift_card")
    private Boolean giftCard;
    @SerializedName("name")
    private String name;
    @SerializedName("variant_inventory_management")
    private Object variantInventoryManagement;
    @SerializedName("properties")
    private List<Object> properties = new ArrayList<Object>();
    @SerializedName("product_exists")
    private Boolean productExists;
    @SerializedName("fulfillable_quantity")
    private Integer fulfillableQuantity;
    @SerializedName("total_discount")
    private String totalDiscount;
    @SerializedName("fulfillment_status")
    private Object fulfillmentStatus;
    @SerializedName("tax_lines")
    private List<Object> taxLines = new ArrayList<Object>();
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

    public LineItem withId(BigInteger id) {
        this.id = id;
        return this;
    }

    @SerializedName("variant_id")
    public BigInteger getVariantId() {
        return variantId;
    }

    @SerializedName("variant_id")
    public void setVariantId(BigInteger variantId) {
        this.variantId = variantId;
    }

    public LineItem withVariantId(BigInteger variantId) {
        this.variantId = variantId;
        return this;
    }

    @SerializedName("title")
    public String getTitle() {
        return title;
    }

    @SerializedName("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public LineItem withTitle(String title) {
        this.title = title;
        return this;
    }

    @SerializedName("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @SerializedName("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public LineItem withQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    @SerializedName("price")
    public String getPrice() {
        return price;
    }

    @SerializedName("price")
    public void setPrice(String price) {
        this.price = price;
    }

    public LineItem withPrice(String price) {
        this.price = price;
        return this;
    }

    @SerializedName("grams")
    public Integer getGrams() {
        return grams;
    }

    @SerializedName("grams")
    public void setGrams(Integer grams) {
        this.grams = grams;
    }

    public LineItem withGrams(Integer grams) {
        this.grams = grams;
        return this;
    }

    @SerializedName("sku")
    public String getSku() {
        return sku;
    }

    @SerializedName("sku")
    public void setSku(String sku) {
        this.sku = sku;
    }

    public LineItem withSku(String sku) {
        this.sku = sku;
        return this;
    }

    @SerializedName("variant_title")
    public String getVariantTitle() {
        return variantTitle;
    }

    @SerializedName("variant_title")
    public void setVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle;
    }

    public LineItem withVariantTitle(String variantTitle) {
        this.variantTitle = variantTitle;
        return this;
    }

    @SerializedName("vendor")
    public Object getVendor() {
        return vendor;
    }

    @SerializedName("vendor")
    public void setVendor(Object vendor) {
        this.vendor = vendor;
    }

    public LineItem withVendor(Object vendor) {
        this.vendor = vendor;
        return this;
    }

    @SerializedName("fulfillment_service")
    public String getFulfillmentService() {
        return fulfillmentService;
    }

    @SerializedName("fulfillment_service")
    public void setFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
    }

    public LineItem withFulfillmentService(String fulfillmentService) {
        this.fulfillmentService = fulfillmentService;
        return this;
    }

    @SerializedName("product_id")
    public BigInteger getProductId() {
        return productId;
    }

    @SerializedName("product_id")
    public void setProductId(BigInteger productId) {
        this.productId = productId;
    }

    public LineItem withProductId(BigInteger productId) {
        this.productId = productId;
        return this;
    }

    @SerializedName("requires_shipping")
    public Boolean getRequiresShipping() {
        return requiresShipping;
    }

    @SerializedName("requires_shipping")
    public void setRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
    }

    public LineItem withRequiresShipping(Boolean requiresShipping) {
        this.requiresShipping = requiresShipping;
        return this;
    }

    @SerializedName("taxable")
    public Boolean getTaxable() {
        return taxable;
    }

    @SerializedName("taxable")
    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    public LineItem withTaxable(Boolean taxable) {
        this.taxable = taxable;
        return this;
    }

    @SerializedName("gift_card")
    public Boolean getGiftCard() {
        return giftCard;
    }

    @SerializedName("gift_card")
    public void setGiftCard(Boolean giftCard) {
        this.giftCard = giftCard;
    }

    public LineItem withGiftCard(Boolean giftCard) {
        this.giftCard = giftCard;
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

    public LineItem withName(String name) {
        this.name = name;
        return this;
    }

    @SerializedName("variant_inventory_management")
    public Object getVariantInventoryManagement() {
        return variantInventoryManagement;
    }

    @SerializedName("variant_inventory_management")
    public void setVariantInventoryManagement(Object variantInventoryManagement) {
        this.variantInventoryManagement = variantInventoryManagement;
    }

    public LineItem withVariantInventoryManagement(Object variantInventoryManagement) {
        this.variantInventoryManagement = variantInventoryManagement;
        return this;
    }

    @SerializedName("properties")
    public List<Object> getProperties() {
        return properties;
    }

    @SerializedName("properties")
    public void setProperties(List<Object> properties) {
        this.properties = properties;
    }

    public LineItem withProperties(List<Object> properties) {
        this.properties = properties;
        return this;
    }

    @SerializedName("product_exists")
    public Boolean getProductExists() {
        return productExists;
    }

    @SerializedName("product_exists")
    public void setProductExists(Boolean productExists) {
        this.productExists = productExists;
    }

    public LineItem withProductExists(Boolean productExists) {
        this.productExists = productExists;
        return this;
    }

    @SerializedName("fulfillable_quantity")
    public Integer getFulfillableQuantity() {
        return fulfillableQuantity;
    }

    @SerializedName("fulfillable_quantity")
    public void setFulfillableQuantity(Integer fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
    }

    public LineItem withFulfillableQuantity(Integer fulfillableQuantity) {
        this.fulfillableQuantity = fulfillableQuantity;
        return this;
    }

    @SerializedName("total_discount")
    public String getTotalDiscount() {
        return totalDiscount;
    }

    @SerializedName("total_discount")
    public void setTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    public LineItem withTotalDiscount(String totalDiscount) {
        this.totalDiscount = totalDiscount;
        return this;
    }

    @SerializedName("fulfillment_status")
    public Object getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    @SerializedName("fulfillment_status")
    public void setFulfillmentStatus(Object fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
    }

    public LineItem withFulfillmentStatus(Object fulfillmentStatus) {
        this.fulfillmentStatus = fulfillmentStatus;
        return this;
    }

    @SerializedName("tax_lines")
    public List<Object> getTaxLines() {
        return taxLines;
    }

    @SerializedName("tax_lines")
    public void setTaxLines(List<Object> taxLines) {
        this.taxLines = taxLines;
    }

    public LineItem withTaxLines(List<Object> taxLines) {
        this.taxLines = taxLines;
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

    public LineItem withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(variantId).append(title).append(quantity).append(price).append(grams).append(sku).append(variantTitle).append(vendor).append(fulfillmentService).append(productId).append(requiresShipping).append(taxable).append(giftCard).append(name).append(variantInventoryManagement).append(properties).append(productExists).append(fulfillableQuantity).append(totalDiscount).append(fulfillmentStatus).append(taxLines).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LineItem) == false) {
            return false;
        }
        LineItem rhs = ((LineItem) other);
        return new EqualsBuilder().append(id, rhs.id).append(variantId, rhs.variantId).append(title, rhs.title).append(quantity, rhs.quantity).append(price, rhs.price).append(grams, rhs.grams).append(sku, rhs.sku).append(variantTitle, rhs.variantTitle).append(vendor, rhs.vendor).append(fulfillmentService, rhs.fulfillmentService).append(productId, rhs.productId).append(requiresShipping, rhs.requiresShipping).append(taxable, rhs.taxable).append(giftCard, rhs.giftCard).append(name, rhs.name).append(variantInventoryManagement, rhs.variantInventoryManagement).append(properties, rhs.properties).append(productExists, rhs.productExists).append(fulfillableQuantity, rhs.fulfillableQuantity).append(totalDiscount, rhs.totalDiscount).append(fulfillmentStatus, rhs.fulfillmentStatus).append(taxLines, rhs.taxLines).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
