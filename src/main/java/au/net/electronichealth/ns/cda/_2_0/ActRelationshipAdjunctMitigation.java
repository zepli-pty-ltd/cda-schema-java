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
 * <p>Java class for ActRelationshipAdjunctMitigation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipAdjunctMitigation">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="MTGT.ADJ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipAdjunctMitigation")
@XmlEnum
public enum ActRelationshipAdjunctMitigation {

    @XmlEnumValue("MTGT.ADJ")
    MTGT_ADJ("MTGT.ADJ");
    private final String value;

    ActRelationshipAdjunctMitigation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActRelationshipAdjunctMitigation fromValue(String v) {
        for (ActRelationshipAdjunctMitigation c: ActRelationshipAdjunctMitigation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
