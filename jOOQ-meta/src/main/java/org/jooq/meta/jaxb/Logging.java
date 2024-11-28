
package org.jooq.meta.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Logging.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Logging"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="TRACE"/&gt;
 *     &lt;enumeration value="DEBUG"/&gt;
 *     &lt;enumeration value="INFO"/&gt;
 *     &lt;enumeration value="WARN"/&gt;
 *     &lt;enumeration value="ERROR"/&gt;
 *     &lt;enumeration value="FATAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Logging")
@XmlEnum
public enum Logging {


    /**
     * The <code>TRACE</code> log level.
     * 
     */
    TRACE,

    /**
     * The <code>DEBUG</code> log level.
     * 
     */
    DEBUG,

    /**
     * The <code>INFO</code> log level.
     * 
     */
    INFO,

    /**
     * The <code>WARN</code> log level.
     * 
     */
    WARN,

    /**
     * The <code>ERROR</code> log level.
     * 
     */
    ERROR,

    /**
     * The <code>FATAL</code> log level.
     * 
     */
    FATAL;

    public String value() {
        return name();
    }

    public static Logging fromValue(String v) {
        return valueOf(v);
    }

}
