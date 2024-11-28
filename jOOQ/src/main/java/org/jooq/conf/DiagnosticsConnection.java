
package org.jooq.conf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiagnosticsConnection.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DiagnosticsConnection"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="DEFAULT"/&gt;
 *     &lt;enumeration value="ON"/&gt;
 *     &lt;enumeration value="OFF"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DiagnosticsConnection")
@XmlEnum
public enum DiagnosticsConnection {


    /**
     * The DiagnosticsConnection is turned on if used explicitly.
     * 
     */
    DEFAULT,

    /**
     * The DiagnosticsConnection is always turned on for any user connection.
     * 
     */
    ON,

    /**
     * The DiagnosticsConnection is turned off, even when used explicitly.
     * 
     */
    OFF;

    public String value() {
        return name();
    }

    public static DiagnosticsConnection fromValue(String v) {
        return valueOf(v);
    }

}
