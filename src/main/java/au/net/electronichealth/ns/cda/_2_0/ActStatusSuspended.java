//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.03 at 09:15:32 AM AEST 
//


package au.net.electronichealth.ns.cda._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ActStatusSuspended.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActStatusSuspended">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="suspended"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActStatusSuspended")
@XmlEnum
public enum ActStatusSuspended {

    @XmlEnumValue("suspended")
    SUSPENDED("suspended");
    private final String value;

    ActStatusSuspended(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActStatusSuspended fromValue(String v) {
        for (ActStatusSuspended c: ActStatusSuspended.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
