
package com.bug.iwinner.ws.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for bugDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bugDTO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bugDesc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bugDoubleId" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="bugFloatId" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="bugInfo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bugLongId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="bugName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bugDTO", propOrder = {
    "bugDesc",
    "bugDoubleId",
    "bugFloatId",
    "bugInfo",
    "bugLongId",
    "bugName",
    "date",
    "id"
})
public class BugDTO {

    protected String bugDesc;
    protected Double bugDoubleId;
    protected Float bugFloatId;
    protected String bugInfo;
    protected Long bugLongId;
    protected String bugName;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    protected Integer id;

    /**
     * Gets the value of the bugDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBugDesc() {
        return bugDesc;
    }

    /**
     * Sets the value of the bugDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBugDesc(String value) {
        this.bugDesc = value;
    }

    /**
     * Gets the value of the bugDoubleId property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getBugDoubleId() {
        return bugDoubleId;
    }

    /**
     * Sets the value of the bugDoubleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setBugDoubleId(Double value) {
        this.bugDoubleId = value;
    }

    /**
     * Gets the value of the bugFloatId property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getBugFloatId() {
        return bugFloatId;
    }

    /**
     * Sets the value of the bugFloatId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setBugFloatId(Float value) {
        this.bugFloatId = value;
    }

    /**
     * Gets the value of the bugInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBugInfo() {
        return bugInfo;
    }

    /**
     * Sets the value of the bugInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBugInfo(String value) {
        this.bugInfo = value;
    }

    /**
     * Gets the value of the bugLongId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBugLongId() {
        return bugLongId;
    }

    /**
     * Sets the value of the bugLongId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBugLongId(Long value) {
        this.bugLongId = value;
    }

    /**
     * Gets the value of the bugName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBugName() {
        return bugName;
    }

    /**
     * Sets the value of the bugName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBugName(String value) {
        this.bugName = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDate(XMLGregorianCalendar value) {
        this.date = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

}
