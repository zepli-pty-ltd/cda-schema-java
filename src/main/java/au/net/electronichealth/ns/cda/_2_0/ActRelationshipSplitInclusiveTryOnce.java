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
 * <p>Java class for ActRelationshipSplitInclusiveTryOnce.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipSplitInclusiveTryOnce">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="I1"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipSplitInclusiveTryOnce")
@XmlEnum
public enum ActRelationshipSplitInclusiveTryOnce {

    @XmlEnumValue("I1")
    I_1("I1");
    private final String value;

    ActRelationshipSplitInclusiveTryOnce(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActRelationshipSplitInclusiveTryOnce fromValue(String v) {
        for (ActRelationshipSplitInclusiveTryOnce c: ActRelationshipSplitInclusiveTryOnce.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
