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
 * <p>Java class for ActRelationshipConditional.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ActRelationshipConditional">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="BLOCK"/>
 *     &lt;enumeration value="CIND"/>
 *     &lt;enumeration value="CURE"/>
 *     &lt;enumeration value="CURE.ADJ"/>
 *     &lt;enumeration value="DIAG"/>
 *     &lt;enumeration value="MITGT"/>
 *     &lt;enumeration value="MTGT.ADJ"/>
 *     &lt;enumeration value="PRCN"/>
 *     &lt;enumeration value="RCVY"/>
 *     &lt;enumeration value="RSON"/>
 *     &lt;enumeration value="SYMP"/>
 *     &lt;enumeration value="TRIG"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActRelationshipConditional")
@XmlEnum
public enum ActRelationshipConditional {

    BLOCK("BLOCK"),
    CIND("CIND"),
    CURE("CURE"),
    @XmlEnumValue("CURE.ADJ")
    CURE_ADJ("CURE.ADJ"),
    DIAG("DIAG"),
    MITGT("MITGT"),
    @XmlEnumValue("MTGT.ADJ")
    MTGT_ADJ("MTGT.ADJ"),
    PRCN("PRCN"),
    RCVY("RCVY"),
    RSON("RSON"),
    SYMP("SYMP"),
    TRIG("TRIG");
    private final String value;

    ActRelationshipConditional(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActRelationshipConditional fromValue(String v) {
        for (ActRelationshipConditional c: ActRelationshipConditional.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
