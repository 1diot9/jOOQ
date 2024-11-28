
package org.jooq.meta.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForcedTypeObjectType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ForcedTypeObjectType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="ATTRIBUTE"/&gt;
 *     &lt;enumeration value="COLUMN"/&gt;
 *     &lt;enumeration value="ELEMENT"/&gt;
 *     &lt;enumeration value="PARAMETER"/&gt;
 *     &lt;enumeration value="SEQUENCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForcedTypeObjectType")
@XmlEnum
public enum ForcedTypeObjectType {


    /**
     * A {@link ForcedType} should match all database object types.
     * 
     */
    ALL,

    /**
     * A {@link ForcedType} should match only UDT attributes.
     * 
     */
    ATTRIBUTE,

    /**
     * A {@link ForcedType} should match only table columns.
     * 
     */
    COLUMN,

    /**
     * A {@link ForcedType} should match only array elements.
     * 
     */
    ELEMENT,

    /**
     * A {@link ForcedType} should match only routine parameters.
     * 
     */
    PARAMETER,

    /**
     * A {@link ForcedType} should match only sequences.
     * 
     */
    SEQUENCE;

    public String value() {
        return name();
    }

    public static ForcedTypeObjectType fromValue(String v) {
        return valueOf(v);
    }

}
