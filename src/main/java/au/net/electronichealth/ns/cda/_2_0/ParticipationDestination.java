//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.03 at 09:15:32 AM AEST 
//


package au.net.electronichealth.ns.cda._2_0;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ParticipationDestination.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ParticipationDestination">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="DST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ParticipationDestination")
@XmlEnum
public enum ParticipationDestination {

    DST;

    public String value() {
        return name();
    }

    public static ParticipationDestination fromValue(String v) {
        return valueOf(v);
    }

}
