package com.gisgraphy.addressparser.format;

import java.util.HashMap;
import java.util.Map;

/**
 * Defines the character codes used in the metadata to specify the types of fields used in address
 * formatting. Note that the metadata also has a character for newlines, which is not defined here.
 */
public enum AddressField {
    STATE('S', "state"),
    CITY('C', "city"),
    RECIPIENT('N', "name"),
    ORGANIZATION('O', "organization"),
    ADDRESS_LINE_1('1', "street1"),
    ADDRESS_LINE_2('2', "street2"),
    DEPENDENT_LOCALITY('D',"dependent locality"),
    ZIP('Z',"postcode"),
    SORTING_CODE('X',"sorting code"),

    // TODO: Remove STREET_ADDRESS and use ADDRESS_LINE_1 and ADDRESS_LINE_2
    // instead. This will involve updating the metadata to specify '1' and '2' instead
    // of 'A'.
    // Deprecated.
    STREET_ADDRESS('A',"street address"),

    COUNTRY('R',"country");

    private static final Map<Character, AddressField> FIELD_MAPPING
            = new HashMap<Character, AddressField>();

    static {
        for (AddressField value : values()) {
            FIELD_MAPPING.put(value.getChar(), value);
        }
    }

    private final char mField;

    private final String mAttributeName;

    private AddressField(char field, String attributeName) {
        mField = field;
        mAttributeName = attributeName;
    }

    private AddressField(char field) {
        this(field, null);
    }

    /**
     * Gets the corresponding AddressField for the character code. Returns null if the character is
     * not recognized.
     */
   public  static AddressField of(char field) {
        return FIELD_MAPPING.get(field);
    }

    /**
     * Gets attribute name. Attribute names are used as keys to JSON address data returned from the
     * server. Returns null if the field does not have a corresponding attribute name.
     *
     * Note: Not all address fields have attribute names. Fields like postal code, country, sorting
     * code, or street address do not have attribute names.
     */
   public String getAttributeName() {
        return mAttributeName;
    }

    /**
     * Gets the field's identification character, as used in the metadata.
     *
     * @return identification char.
     */
    public char getChar() {
        return mField;
    }
}

