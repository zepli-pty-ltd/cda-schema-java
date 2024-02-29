//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.03 at 09:15:32 AM AEST 
//


package au.net.electronichealth.ns.cda._2_0;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 *             A character string that may have a type-tag signifying its
 *             role in the address. Typical parts that exist in about
 *             every address are street, house number, or post box,
 *             postal code, city, country but other roles may be defined
 *             regionally, nationally, or on an enterprise level (e.g. in
 *             military addresses). Addresses are usually broken up into
 *             lines, which are indicated by special line-breaking
 *             delimiter elements (e.g., DEL).
 *          
 * 
 * <p>Java class for ADXP complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ADXP">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:hl7-org:v3}ST">
 *       &lt;attribute name="partType" type="{urn:hl7-org:v3}AddressPartType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ADXP")
@XmlSeeAlso({
    AdxpPostalCode.class,
    AdxpDeliveryInstallationArea.class,
    AdxpDirection.class,
    AdxpDeliveryMode.class,
    AdxpBuildingNumberSuffix.class,
    AdxpStreetAddressLine.class,
    AdxpDeliveryInstallationType.class,
    AdxpUnitType.class,
    AdxpCity.class,
    AdxpState.class,
    AdxpDeliveryAddressLine.class,
    AdxpPrecinct.class,
    AdxpStreetNameType.class,
    AdxpStreetNameBase.class,
    AdxpPostBox.class,
    AdxpDeliveryModeIdentifier.class,
    AdxpAdditionalLocator.class,
    AdxpDeliveryInstallationQualifier.class,
    AdxpStreetName.class,
    AdxpCountry.class,
    AdxpUnitID.class,
    AdxpCareOf.class,
    AdxpHouseNumber.class,
    AdxpCounty.class,
    AdxpCensusTract.class,
    AdxpHouseNumberNumeric.class,
    AdxpDelimiter.class
})
public class ADXP
    extends ST
{

    @XmlAttribute(name = "partType")
    protected AddressPartType partType;

    /**
     * Gets the value of the partType property.
     * 
     * @return
     *     possible object is
     *     {@link AddressPartType }
     *     
     */
    public AddressPartType getPartType() {
        return partType;
    }

    /**
     * Sets the value of the partType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressPartType }
     *     
     */
    public void setPartType(AddressPartType value) {
        this.partType = value;
    }

}
