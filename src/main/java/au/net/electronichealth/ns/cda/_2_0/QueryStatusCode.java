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
 * <p>Java class for QueryStatusCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QueryStatusCode">
 *   &lt;restriction base="{urn:hl7-org:v3}cs">
 *     &lt;enumeration value="aborted"/>
 *     &lt;enumeration value="deliveredResponse"/>
 *     &lt;enumeration value="executing"/>
 *     &lt;enumeration value="new"/>
 *     &lt;enumeration value="waitContinuedQueryResponse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QueryStatusCode")
@XmlEnum
public enum QueryStatusCode {

    @XmlEnumValue("aborted")
    ABORTED("aborted"),
    @XmlEnumValue("deliveredResponse")
    DELIVERED_RESPONSE("deliveredResponse"),
    @XmlEnumValue("executing")
    EXECUTING("executing"),
    @XmlEnumValue("new")
    NEW("new"),
    @XmlEnumValue("waitContinuedQueryResponse")
    WAIT_CONTINUED_QUERY_RESPONSE("waitContinuedQueryResponse");
    private final String value;

    QueryStatusCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryStatusCode fromValue(String v) {
        for (QueryStatusCode c: QueryStatusCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
