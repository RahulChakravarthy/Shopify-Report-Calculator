
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
    "email",
    "closed_at",
    "created_at",
    "updated_at",
    "number",
    "note",
    "token",
    "gateway",
    "test",
    "total_price",
    "subtotal_price",
    "total_weight",
    "total_tax",
    "taxes_included",
    "currency",
    "financial_status",
    "confirmed",
    "total_discounts",
    "total_line_items_price",
    "cart_token",
    "buyer_accepts_marketing",
    "name",
    "referring_site",
    "landing_site",
    "cancelled_at",
    "cancel_reason",
    "total_price_usd",
    "checkout_token",
    "reference",
    "user_id",
    "location_id",
    "source_identifier",
    "source_url",
    "processed_at",
    "device_id",
    "phone",
    "customer_locale",
    "app_id",
    "browser_ip",
    "landing_site_ref",
    "order_number",
    "discount_codes",
    "note_attributes",
    "payment_gateway_names",
    "processing_method",
    "checkout_id",
    "source_name",
    "fulfillment_status",
    "tax_lines",
    "tags",
    "contact_email",
    "order_status_url",
    "line_items",
    "shipping_lines",
    "billing_address",
    "shipping_address",
    "fulfillments",
    "refunds",
    "customer"
})
public class Order {

    @SerializedName("id")
    private BigInteger id;
    @SerializedName("email")
    private String email;
    @SerializedName("closed_at")
    private Object closedAt;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("number")
    private Integer number;
    @SerializedName("note")
    private Object note;
    @SerializedName("token")
    private String token;
    @SerializedName("gateway")
    private String gateway;
    @SerializedName("test")
    private Boolean test;
    @SerializedName("total_price")
    private String totalPrice;
    @SerializedName("subtotal_price")
    private String subtotalPrice;
    @SerializedName("total_weight")
    private Integer totalWeight;
    @SerializedName("total_tax")
    private String totalTax;
    @SerializedName("taxes_included")
    private Boolean taxesIncluded;
    @SerializedName("currency")
    private String currency;
    @SerializedName("financial_status")
    private String financialStatus;
    @SerializedName("confirmed")
    private Boolean confirmed;
    @SerializedName("total_discounts")
    private String totalDiscounts;
    @SerializedName("total_line_items_price")
    private String totalLineItemsPrice;
    @SerializedName("cart_token")
    private Object cartToken;
    @SerializedName("buyer_accepts_marketing")
    private Boolean buyerAcceptsMarketing;
    @SerializedName("name")
    private String name;
    @SerializedName("referring_site")
    private Object referringSite;
    @SerializedName("landing_site")
    private Object landingSite;
    @SerializedName("cancelled_at")
    private Object cancelledAt;
    @SerializedName("cancel_reason")
    private Object cancelReason;
    @SerializedName("total_price_usd")
    private String totalPriceUsd;
    @SerializedName("checkout_token")
    private Object checkoutToken;
    @SerializedName("reference")
    private Object reference;
    @SerializedName("user_id")
    private Object userId;
    @SerializedName("location_id")
    private Object locationId;
    @SerializedName("source_identifier")
    private Object sourceIdentifier;
    @SerializedName("source_url")
    private Object sourceUrl;
    @SerializedName("processed_at")
    private String processedAt;
    @SerializedName("device_id")
    private Object deviceId;
    @SerializedName("phone")
    private Object phone;
    @SerializedName("customer_locale")
    private Object customerLocale;
    @SerializedName("app_id")
    private Integer appId;
    @SerializedName("browser_ip")
    private Object browserIp;
    @SerializedName("landing_site_ref")
    private Object landingSiteRef;
    @SerializedName("order_number")
    private Integer orderNumber;
    @SerializedName("discount_codes")
    private List<Object> discountCodes = new ArrayList<Object>();
    @SerializedName("note_attributes")
    private List<Object> noteAttributes = new ArrayList<Object>();
    @SerializedName("payment_gateway_names")
    private List<String> paymentGatewayNames = new ArrayList<String>();
    @SerializedName("processing_method")
    private String processingMethod;
    @SerializedName("checkout_id")
    private Object checkoutId;
    @SerializedName("source_name")
    private String sourceName;
    @SerializedName("fulfillment_status")
    private Object fulfillmentStatus;
    @SerializedName("tax_lines")
    private List<Object> taxLines = new ArrayList<Object>();
    @SerializedName("tags")
    private String tags;
    @SerializedName("contact_email")
    private String contactEmail;
    @SerializedName("order_status_url")
    private Object orderStatusUrl;
    @SerializedName("line_items")
    private List<LineItem> lineItems = new ArrayList<LineItem>();
    @SerializedName("shipping_lines")
    private List<Object> shippingLines = new ArrayList<Object>();
    @SerializedName("billing_address")
    private BillingAddress billingAddress;
    @SerializedName("shipping_address")
    private ShippingAddress shippingAddress;
    @SerializedName("fulfillments")
    private List<Object> fulfillments = new ArrayList<Object>();
    @SerializedName("refunds")
    private List<Object> refunds = new ArrayList<Object>();
    @SerializedName("customer")
    private Customer customer;
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

    public Order withId(BigInteger id) {
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

    public Order withEmail(String email) {
        this.email = email;
        return this;
    }

    @SerializedName("closed_at")
    public Object getClosedAt() {
        return closedAt;
    }

    @SerializedName("closed_at")
    public void setClosedAt(Object closedAt) {
        this.closedAt = closedAt;
    }

    public Order withClosedAt(Object closedAt) {
        this.closedAt = closedAt;
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

    public Order withCreatedAt(String createdAt) {
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

    public Order withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @SerializedName("number")
    public Integer getNumber() {
        return number;
    }

    @SerializedName("number")
    public void setNumber(Integer number) {
        this.number = number;
    }

    public Order withNumber(Integer number) {
        this.number = number;
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

    public Order withNote(Object note) {
        this.note = note;
        return this;
    }

    @SerializedName("token")
    public String getToken() {
        return token;
    }

    @SerializedName("token")
    public void setToken(String token) {
        this.token = token;
    }

    public Order withToken(String token) {
        this.token = token;
        return this;
    }

    @SerializedName("gateway")
    public String getGateway() {
        return gateway;
    }

    @SerializedName("gateway")
    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public Order withGateway(String gateway) {
        this.gateway = gateway;
        return this;
    }

    @SerializedName("test")
    public Boolean getTest() {
        return test;
    }

    @SerializedName("test")
    public void setTest(Boolean test) {
        this.test = test;
    }

    public Order withTest(Boolean test) {
        this.test = test;
        return this;
    }

    @SerializedName("total_price")
    public String getTotalPrice() {
        return totalPrice;
    }

    @SerializedName("total_price")
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Order withTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
        return this;
    }

    @SerializedName("subtotal_price")
    public String getSubtotalPrice() {
        return subtotalPrice;
    }

    @SerializedName("subtotal_price")
    public void setSubtotalPrice(String subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
    }

    public Order withSubtotalPrice(String subtotalPrice) {
        this.subtotalPrice = subtotalPrice;
        return this;
    }

    @SerializedName("total_weight")
    public Integer getTotalWeight() {
        return totalWeight;
    }

    @SerializedName("total_weight")
    public void setTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
    }

    public Order withTotalWeight(Integer totalWeight) {
        this.totalWeight = totalWeight;
        return this;
    }

    @SerializedName("total_tax")
    public String getTotalTax() {
        return totalTax;
    }

    @SerializedName("total_tax")
    public void setTotalTax(String totalTax) {
        this.totalTax = totalTax;
    }

    public Order withTotalTax(String totalTax) {
        this.totalTax = totalTax;
        return this;
    }

    @SerializedName("taxes_included")
    public Boolean getTaxesIncluded() {
        return taxesIncluded;
    }

    @SerializedName("taxes_included")
    public void setTaxesIncluded(Boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
    }

    public Order withTaxesIncluded(Boolean taxesIncluded) {
        this.taxesIncluded = taxesIncluded;
        return this;
    }

    @SerializedName("currency")
    public String getCurrency() {
        return currency;
    }

    @SerializedName("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Order withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    @SerializedName("financial_status")
    public String getFinancialStatus() {
        return financialStatus;
    }

    @SerializedName("financial_status")
    public void setFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
    }

    public Order withFinancialStatus(String financialStatus) {
        this.financialStatus = financialStatus;
        return this;
    }

    @SerializedName("confirmed")
    public Boolean getConfirmed() {
        return confirmed;
    }

    @SerializedName("confirmed")
    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    public Order withConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
        return this;
    }

    @SerializedName("total_discounts")
    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    @SerializedName("total_discounts")
    public void setTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }

    public Order withTotalDiscounts(String totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
        return this;
    }

    @SerializedName("total_line_items_price")
    public String getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    @SerializedName("total_line_items_price")
    public void setTotalLineItemsPrice(String totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
    }

    public Order withTotalLineItemsPrice(String totalLineItemsPrice) {
        this.totalLineItemsPrice = totalLineItemsPrice;
        return this;
    }

    @SerializedName("cart_token")
    public Object getCartToken() {
        return cartToken;
    }

    @SerializedName("cart_token")
    public void setCartToken(Object cartToken) {
        this.cartToken = cartToken;
    }

    public Order withCartToken(Object cartToken) {
        this.cartToken = cartToken;
        return this;
    }

    @SerializedName("buyer_accepts_marketing")
    public Boolean getBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    @SerializedName("buyer_accepts_marketing")
    public void setBuyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
    }

    public Order withBuyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
        this.buyerAcceptsMarketing = buyerAcceptsMarketing;
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

    public Order withName(String name) {
        this.name = name;
        return this;
    }

    @SerializedName("referring_site")
    public Object getReferringSite() {
        return referringSite;
    }

    @SerializedName("referring_site")
    public void setReferringSite(Object referringSite) {
        this.referringSite = referringSite;
    }

    public Order withReferringSite(Object referringSite) {
        this.referringSite = referringSite;
        return this;
    }

    @SerializedName("landing_site")
    public Object getLandingSite() {
        return landingSite;
    }

    @SerializedName("landing_site")
    public void setLandingSite(Object landingSite) {
        this.landingSite = landingSite;
    }

    public Order withLandingSite(Object landingSite) {
        this.landingSite = landingSite;
        return this;
    }

    @SerializedName("cancelled_at")
    public Object getCancelledAt() {
        return cancelledAt;
    }

    @SerializedName("cancelled_at")
    public void setCancelledAt(Object cancelledAt) {
        this.cancelledAt = cancelledAt;
    }

    public Order withCancelledAt(Object cancelledAt) {
        this.cancelledAt = cancelledAt;
        return this;
    }

    @SerializedName("cancel_reason")
    public Object getCancelReason() {
        return cancelReason;
    }

    @SerializedName("cancel_reason")
    public void setCancelReason(Object cancelReason) {
        this.cancelReason = cancelReason;
    }

    public Order withCancelReason(Object cancelReason) {
        this.cancelReason = cancelReason;
        return this;
    }

    @SerializedName("total_price_usd")
    public String getTotalPriceUsd() {
        return totalPriceUsd;
    }

    @SerializedName("total_price_usd")
    public void setTotalPriceUsd(String totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
    }

    public Order withTotalPriceUsd(String totalPriceUsd) {
        this.totalPriceUsd = totalPriceUsd;
        return this;
    }

    @SerializedName("checkout_token")
    public Object getCheckoutToken() {
        return checkoutToken;
    }

    @SerializedName("checkout_token")
    public void setCheckoutToken(Object checkoutToken) {
        this.checkoutToken = checkoutToken;
    }

    public Order withCheckoutToken(Object checkoutToken) {
        this.checkoutToken = checkoutToken;
        return this;
    }

    @SerializedName("reference")
    public Object getReference() {
        return reference;
    }

    @SerializedName("reference")
    public void setReference(Object reference) {
        this.reference = reference;
    }

    public Order withReference(Object reference) {
        this.reference = reference;
        return this;
    }

    @SerializedName("user_id")
    public Object getUserId() {
        return userId;
    }

    @SerializedName("user_id")
    public void setUserId(Object userId) {
        this.userId = userId;
    }

    public Order withUserId(Object userId) {
        this.userId = userId;
        return this;
    }

    @SerializedName("location_id")
    public Object getLocationId() {
        return locationId;
    }

    @SerializedName("location_id")
    public void setLocationId(Object locationId) {
        this.locationId = locationId;
    }

    public Order withLocationId(Object locationId) {
        this.locationId = locationId;
        return this;
    }

    @SerializedName("source_identifier")
    public Object getSourceIdentifier() {
        return sourceIdentifier;
    }

    @SerializedName("source_identifier")
    public void setSourceIdentifier(Object sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public Order withSourceIdentifier(Object sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    @SerializedName("source_url")
    public Object getSourceUrl() {
        return sourceUrl;
    }

    @SerializedName("source_url")
    public void setSourceUrl(Object sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Order withSourceUrl(Object sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    @SerializedName("processed_at")
    public String getProcessedAt() {
        return processedAt;
    }

    @SerializedName("processed_at")
    public void setProcessedAt(String processedAt) {
        this.processedAt = processedAt;
    }

    public Order withProcessedAt(String processedAt) {
        this.processedAt = processedAt;
        return this;
    }

    @SerializedName("device_id")
    public Object getDeviceId() {
        return deviceId;
    }

    @SerializedName("device_id")
    public void setDeviceId(Object deviceId) {
        this.deviceId = deviceId;
    }

    public Order withDeviceId(Object deviceId) {
        this.deviceId = deviceId;
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

    public Order withPhone(Object phone) {
        this.phone = phone;
        return this;
    }

    @SerializedName("customer_locale")
    public Object getCustomerLocale() {
        return customerLocale;
    }

    @SerializedName("customer_locale")
    public void setCustomerLocale(Object customerLocale) {
        this.customerLocale = customerLocale;
    }

    public Order withCustomerLocale(Object customerLocale) {
        this.customerLocale = customerLocale;
        return this;
    }

    @SerializedName("app_id")
    public Integer getAppId() {
        return appId;
    }

    @SerializedName("app_id")
    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Order withAppId(Integer appId) {
        this.appId = appId;
        return this;
    }

    @SerializedName("browser_ip")
    public Object getBrowserIp() {
        return browserIp;
    }

    @SerializedName("browser_ip")
    public void setBrowserIp(Object browserIp) {
        this.browserIp = browserIp;
    }

    public Order withBrowserIp(Object browserIp) {
        this.browserIp = browserIp;
        return this;
    }

    @SerializedName("landing_site_ref")
    public Object getLandingSiteRef() {
        return landingSiteRef;
    }

    @SerializedName("landing_site_ref")
    public void setLandingSiteRef(Object landingSiteRef) {
        this.landingSiteRef = landingSiteRef;
    }

    public Order withLandingSiteRef(Object landingSiteRef) {
        this.landingSiteRef = landingSiteRef;
        return this;
    }

    @SerializedName("order_number")
    public Integer getOrderNumber() {
        return orderNumber;
    }

    @SerializedName("order_number")
    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Order withOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    @SerializedName("discount_codes")
    public List<Object> getDiscountCodes() {
        return discountCodes;
    }

    @SerializedName("discount_codes")
    public void setDiscountCodes(List<Object> discountCodes) {
        this.discountCodes = discountCodes;
    }

    public Order withDiscountCodes(List<Object> discountCodes) {
        this.discountCodes = discountCodes;
        return this;
    }

    @SerializedName("note_attributes")
    public List<Object> getNoteAttributes() {
        return noteAttributes;
    }

    @SerializedName("note_attributes")
    public void setNoteAttributes(List<Object> noteAttributes) {
        this.noteAttributes = noteAttributes;
    }

    public Order withNoteAttributes(List<Object> noteAttributes) {
        this.noteAttributes = noteAttributes;
        return this;
    }

    @SerializedName("payment_gateway_names")
    public List<String> getPaymentGatewayNames() {
        return paymentGatewayNames;
    }

    @SerializedName("payment_gateway_names")
    public void setPaymentGatewayNames(List<String> paymentGatewayNames) {
        this.paymentGatewayNames = paymentGatewayNames;
    }

    public Order withPaymentGatewayNames(List<String> paymentGatewayNames) {
        this.paymentGatewayNames = paymentGatewayNames;
        return this;
    }

    @SerializedName("processing_method")
    public String getProcessingMethod() {
        return processingMethod;
    }

    @SerializedName("processing_method")
    public void setProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
    }

    public Order withProcessingMethod(String processingMethod) {
        this.processingMethod = processingMethod;
        return this;
    }

    @SerializedName("checkout_id")
    public Object getCheckoutId() {
        return checkoutId;
    }

    @SerializedName("checkout_id")
    public void setCheckoutId(Object checkoutId) {
        this.checkoutId = checkoutId;
    }

    public Order withCheckoutId(Object checkoutId) {
        this.checkoutId = checkoutId;
        return this;
    }

    @SerializedName("source_name")
    public String getSourceName() {
        return sourceName;
    }

    @SerializedName("source_name")
    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public Order withSourceName(String sourceName) {
        this.sourceName = sourceName;
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

    public Order withFulfillmentStatus(Object fulfillmentStatus) {
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

    public Order withTaxLines(List<Object> taxLines) {
        this.taxLines = taxLines;
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

    public Order withTags(String tags) {
        this.tags = tags;
        return this;
    }

    @SerializedName("contact_email")
    public String getContactEmail() {
        return contactEmail;
    }

    @SerializedName("contact_email")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public Order withContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    @SerializedName("order_status_url")
    public Object getOrderStatusUrl() {
        return orderStatusUrl;
    }

    @SerializedName("order_status_url")
    public void setOrderStatusUrl(Object orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
    }

    public Order withOrderStatusUrl(Object orderStatusUrl) {
        this.orderStatusUrl = orderStatusUrl;
        return this;
    }

    @SerializedName("line_items")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @SerializedName("line_items")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    public Order withLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
        return this;
    }

    @SerializedName("shipping_lines")
    public List<Object> getShippingLines() {
        return shippingLines;
    }

    @SerializedName("shipping_lines")
    public void setShippingLines(List<Object> shippingLines) {
        this.shippingLines = shippingLines;
    }

    public Order withShippingLines(List<Object> shippingLines) {
        this.shippingLines = shippingLines;
        return this;
    }

    @SerializedName("billing_address")
    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    @SerializedName("billing_address")
    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Order withBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    @SerializedName("shipping_address")
    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    @SerializedName("shipping_address")
    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Order withShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
        return this;
    }

    @SerializedName("fulfillments")
    public List<Object> getFulfillments() {
        return fulfillments;
    }

    @SerializedName("fulfillments")
    public void setFulfillments(List<Object> fulfillments) {
        this.fulfillments = fulfillments;
    }

    public Order withFulfillments(List<Object> fulfillments) {
        this.fulfillments = fulfillments;
        return this;
    }

    @SerializedName("refunds")
    public List<Object> getRefunds() {
        return refunds;
    }

    @SerializedName("refunds")
    public void setRefunds(List<Object> refunds) {
        this.refunds = refunds;
    }

    public Order withRefunds(List<Object> refunds) {
        this.refunds = refunds;
        return this;
    }

    @SerializedName("customer")
    public Customer getCustomer() {
        return customer;
    }

    @SerializedName("customer")
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Order withCustomer(Customer customer) {
        this.customer = customer;
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

    public Order withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(id).append(email).append(closedAt).append(createdAt).append(updatedAt).append(number).append(note).append(token).append(gateway).append(test).append(totalPrice).append(subtotalPrice).append(totalWeight).append(totalTax).append(taxesIncluded).append(currency).append(financialStatus).append(confirmed).append(totalDiscounts).append(totalLineItemsPrice).append(cartToken).append(buyerAcceptsMarketing).append(name).append(referringSite).append(landingSite).append(cancelledAt).append(cancelReason).append(totalPriceUsd).append(checkoutToken).append(reference).append(userId).append(locationId).append(sourceIdentifier).append(sourceUrl).append(processedAt).append(deviceId).append(phone).append(customerLocale).append(appId).append(browserIp).append(landingSiteRef).append(orderNumber).append(discountCodes).append(noteAttributes).append(paymentGatewayNames).append(processingMethod).append(checkoutId).append(sourceName).append(fulfillmentStatus).append(taxLines).append(tags).append(contactEmail).append(orderStatusUrl).append(lineItems).append(shippingLines).append(billingAddress).append(shippingAddress).append(fulfillments).append(refunds).append(customer).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Order) == false) {
            return false;
        }
        Order rhs = ((Order) other);
        return new EqualsBuilder().append(id, rhs.id).append(email, rhs.email).append(closedAt, rhs.closedAt).append(createdAt, rhs.createdAt).append(updatedAt, rhs.updatedAt).append(number, rhs.number).append(note, rhs.note).append(token, rhs.token).append(gateway, rhs.gateway).append(test, rhs.test).append(totalPrice, rhs.totalPrice).append(subtotalPrice, rhs.subtotalPrice).append(totalWeight, rhs.totalWeight).append(totalTax, rhs.totalTax).append(taxesIncluded, rhs.taxesIncluded).append(currency, rhs.currency).append(financialStatus, rhs.financialStatus).append(confirmed, rhs.confirmed).append(totalDiscounts, rhs.totalDiscounts).append(totalLineItemsPrice, rhs.totalLineItemsPrice).append(cartToken, rhs.cartToken).append(buyerAcceptsMarketing, rhs.buyerAcceptsMarketing).append(name, rhs.name).append(referringSite, rhs.referringSite).append(landingSite, rhs.landingSite).append(cancelledAt, rhs.cancelledAt).append(cancelReason, rhs.cancelReason).append(totalPriceUsd, rhs.totalPriceUsd).append(checkoutToken, rhs.checkoutToken).append(reference, rhs.reference).append(userId, rhs.userId).append(locationId, rhs.locationId).append(sourceIdentifier, rhs.sourceIdentifier).append(sourceUrl, rhs.sourceUrl).append(processedAt, rhs.processedAt).append(deviceId, rhs.deviceId).append(phone, rhs.phone).append(customerLocale, rhs.customerLocale).append(appId, rhs.appId).append(browserIp, rhs.browserIp).append(landingSiteRef, rhs.landingSiteRef).append(orderNumber, rhs.orderNumber).append(discountCodes, rhs.discountCodes).append(noteAttributes, rhs.noteAttributes).append(paymentGatewayNames, rhs.paymentGatewayNames).append(processingMethod, rhs.processingMethod).append(checkoutId, rhs.checkoutId).append(sourceName, rhs.sourceName).append(fulfillmentStatus, rhs.fulfillmentStatus).append(taxLines, rhs.taxLines).append(tags, rhs.tags).append(contactEmail, rhs.contactEmail).append(orderStatusUrl, rhs.orderStatusUrl).append(lineItems, rhs.lineItems).append(shippingLines, rhs.shippingLines).append(billingAddress, rhs.billingAddress).append(shippingAddress, rhs.shippingAddress).append(fulfillments, rhs.fulfillments).append(refunds, rhs.refunds).append(customer, rhs.customer).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
