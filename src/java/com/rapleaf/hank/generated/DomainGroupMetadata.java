/**
 * Autogenerated by Thrift Compiler (0.8.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.rapleaf.hank.generated;

import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DomainGroupMetadata implements org.apache.thrift.TBase<DomainGroupMetadata, DomainGroupMetadata._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DomainGroupMetadata");

  private static final org.apache.thrift.protocol.TField NEXT_VERSION_NUMBER_FIELD_DESC = new org.apache.thrift.protocol.TField("next_version_number", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField DOMAIN_VERSIONS_MAP_FIELD_DESC = new org.apache.thrift.protocol.TField("domain_versions_map", org.apache.thrift.protocol.TType.MAP, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DomainGroupMetadataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DomainGroupMetadataTupleSchemeFactory());
  }

  public int next_version_number; // required
  public Map<Integer,Integer> domain_versions_map; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    NEXT_VERSION_NUMBER((short)1, "next_version_number"),
    DOMAIN_VERSIONS_MAP((short)2, "domain_versions_map");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NEXT_VERSION_NUMBER
          return NEXT_VERSION_NUMBER;
        case 2: // DOMAIN_VERSIONS_MAP
          return DOMAIN_VERSIONS_MAP;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __NEXT_VERSION_NUMBER_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);
  private _Fields optionals[] = {_Fields.DOMAIN_VERSIONS_MAP};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NEXT_VERSION_NUMBER, new org.apache.thrift.meta_data.FieldMetaData("next_version_number", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.DOMAIN_VERSIONS_MAP, new org.apache.thrift.meta_data.FieldMetaData("domain_versions_map", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DomainGroupMetadata.class, metaDataMap);
  }

  public DomainGroupMetadata() {
  }

  public DomainGroupMetadata(
    int next_version_number)
  {
    this();
    this.next_version_number = next_version_number;
    set_next_version_number_isSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DomainGroupMetadata(DomainGroupMetadata other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.next_version_number = other.next_version_number;
    if (other.is_set_domain_versions_map()) {
      Map<Integer,Integer> __this__domain_versions_map = new HashMap<Integer,Integer>();
      for (Map.Entry<Integer, Integer> other_element : other.domain_versions_map.entrySet()) {

        Integer other_element_key = other_element.getKey();
        Integer other_element_value = other_element.getValue();

        Integer __this__domain_versions_map_copy_key = other_element_key;

        Integer __this__domain_versions_map_copy_value = other_element_value;

        __this__domain_versions_map.put(__this__domain_versions_map_copy_key, __this__domain_versions_map_copy_value);
      }
      this.domain_versions_map = __this__domain_versions_map;
    }
  }

  public DomainGroupMetadata deepCopy() {
    return new DomainGroupMetadata(this);
  }

  @Override
  public void clear() {
    set_next_version_number_isSet(false);
    this.next_version_number = 0;
    this.domain_versions_map = null;
  }

  public int get_next_version_number() {
    return this.next_version_number;
  }

  public DomainGroupMetadata set_next_version_number(int next_version_number) {
    this.next_version_number = next_version_number;
    set_next_version_number_isSet(true);
    return this;
  }

  public void unset_next_version_number() {
    __isset_bit_vector.clear(__NEXT_VERSION_NUMBER_ISSET_ID);
  }

  /** Returns true if field next_version_number is set (has been assigned a value) and false otherwise */
  public boolean is_set_next_version_number() {
    return __isset_bit_vector.get(__NEXT_VERSION_NUMBER_ISSET_ID);
  }

  public void set_next_version_number_isSet(boolean value) {
    __isset_bit_vector.set(__NEXT_VERSION_NUMBER_ISSET_ID, value);
  }

  public int get_domain_versions_map_size() {
    return (this.domain_versions_map == null) ? 0 : this.domain_versions_map.size();
  }

  public void put_to_domain_versions_map(int key, int val) {
    if (this.domain_versions_map == null) {
      this.domain_versions_map = new HashMap<Integer,Integer>();
    }
    this.domain_versions_map.put(key, val);
  }

  public Map<Integer,Integer> get_domain_versions_map() {
    return this.domain_versions_map;
  }

  public DomainGroupMetadata set_domain_versions_map(Map<Integer,Integer> domain_versions_map) {
    this.domain_versions_map = domain_versions_map;
    return this;
  }

  public void unset_domain_versions_map() {
    this.domain_versions_map = null;
  }

  /** Returns true if field domain_versions_map is set (has been assigned a value) and false otherwise */
  public boolean is_set_domain_versions_map() {
    return this.domain_versions_map != null;
  }

  public void set_domain_versions_map_isSet(boolean value) {
    if (!value) {
      this.domain_versions_map = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NEXT_VERSION_NUMBER:
      if (value == null) {
        unset_next_version_number();
      } else {
        set_next_version_number((Integer)value);
      }
      break;

    case DOMAIN_VERSIONS_MAP:
      if (value == null) {
        unset_domain_versions_map();
      } else {
        set_domain_versions_map((Map<Integer,Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NEXT_VERSION_NUMBER:
      return Integer.valueOf(get_next_version_number());

    case DOMAIN_VERSIONS_MAP:
      return get_domain_versions_map();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NEXT_VERSION_NUMBER:
      return is_set_next_version_number();
    case DOMAIN_VERSIONS_MAP:
      return is_set_domain_versions_map();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DomainGroupMetadata)
      return this.equals((DomainGroupMetadata)that);
    return false;
  }

  public boolean equals(DomainGroupMetadata that) {
    if (that == null)
      return false;

    boolean this_present_next_version_number = true;
    boolean that_present_next_version_number = true;
    if (this_present_next_version_number || that_present_next_version_number) {
      if (!(this_present_next_version_number && that_present_next_version_number))
        return false;
      if (this.next_version_number != that.next_version_number)
        return false;
    }

    boolean this_present_domain_versions_map = true && this.is_set_domain_versions_map();
    boolean that_present_domain_versions_map = true && that.is_set_domain_versions_map();
    if (this_present_domain_versions_map || that_present_domain_versions_map) {
      if (!(this_present_domain_versions_map && that_present_domain_versions_map))
        return false;
      if (!this.domain_versions_map.equals(that.domain_versions_map))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    HashCodeBuilder builder = new HashCodeBuilder();

    boolean present_next_version_number = true;
    builder.append(present_next_version_number);
    if (present_next_version_number)
      builder.append(next_version_number);

    boolean present_domain_versions_map = true && (is_set_domain_versions_map());
    builder.append(present_domain_versions_map);
    if (present_domain_versions_map)
      builder.append(domain_versions_map);

    return builder.toHashCode();
  }

  public int compareTo(DomainGroupMetadata other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    DomainGroupMetadata typedOther = (DomainGroupMetadata)other;

    lastComparison = Boolean.valueOf(is_set_next_version_number()).compareTo(typedOther.is_set_next_version_number());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_next_version_number()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.next_version_number, typedOther.next_version_number);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(is_set_domain_versions_map()).compareTo(typedOther.is_set_domain_versions_map());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (is_set_domain_versions_map()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.domain_versions_map, typedOther.domain_versions_map);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("DomainGroupMetadata(");
    boolean first = true;

    sb.append("next_version_number:");
    sb.append(this.next_version_number);
    first = false;
    if (is_set_domain_versions_map()) {
      if (!first) sb.append(", ");
      sb.append("domain_versions_map:");
      if (this.domain_versions_map == null) {
        sb.append("null");
      } else {
        sb.append(this.domain_versions_map);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'next_version_number' because it's a primitive and you chose the non-beans generator.
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bit_vector = new BitSet(1);
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class DomainGroupMetadataStandardSchemeFactory implements SchemeFactory {
    public DomainGroupMetadataStandardScheme getScheme() {
      return new DomainGroupMetadataStandardScheme();
    }
  }

  private static class DomainGroupMetadataStandardScheme extends StandardScheme<DomainGroupMetadata> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DomainGroupMetadata struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // NEXT_VERSION_NUMBER
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.next_version_number = iprot.readI32();
              struct.set_next_version_number_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DOMAIN_VERSIONS_MAP
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map18 = iprot.readMapBegin();
                struct.domain_versions_map = new HashMap<Integer,Integer>(2*_map18.size);
                for (int _i19 = 0; _i19 < _map18.size; ++_i19)
                {
                  int _key20; // required
                  int _val21; // required
                  _key20 = iprot.readI32();
                  _val21 = iprot.readI32();
                  struct.domain_versions_map.put(_key20, _val21);
                }
                iprot.readMapEnd();
              }
              struct.set_domain_versions_map_isSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      if (!struct.is_set_next_version_number()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'next_version_number' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, DomainGroupMetadata struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(NEXT_VERSION_NUMBER_FIELD_DESC);
      oprot.writeI32(struct.next_version_number);
      oprot.writeFieldEnd();
      if (struct.domain_versions_map != null) {
        if (struct.is_set_domain_versions_map()) {
          oprot.writeFieldBegin(DOMAIN_VERSIONS_MAP_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I32, struct.domain_versions_map.size()));
            for (Map.Entry<Integer, Integer> _iter22 : struct.domain_versions_map.entrySet())
            {
              oprot.writeI32(_iter22.getKey());
              oprot.writeI32(_iter22.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DomainGroupMetadataTupleSchemeFactory implements SchemeFactory {
    public DomainGroupMetadataTupleScheme getScheme() {
      return new DomainGroupMetadataTupleScheme();
    }
  }

  private static class DomainGroupMetadataTupleScheme extends TupleScheme<DomainGroupMetadata> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DomainGroupMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.next_version_number);
      BitSet optionals = new BitSet();
      if (struct.is_set_domain_versions_map()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.is_set_domain_versions_map()) {
        {
          oprot.writeI32(struct.domain_versions_map.size());
          for (Map.Entry<Integer, Integer> _iter23 : struct.domain_versions_map.entrySet())
          {
            oprot.writeI32(_iter23.getKey());
            oprot.writeI32(_iter23.getValue());
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DomainGroupMetadata struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.next_version_number = iprot.readI32();
      struct.set_next_version_number_isSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TMap _map24 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.I32, org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.domain_versions_map = new HashMap<Integer,Integer>(2*_map24.size);
          for (int _i25 = 0; _i25 < _map24.size; ++_i25)
          {
            int _key26; // required
            int _val27; // required
            _key26 = iprot.readI32();
            _val27 = iprot.readI32();
            struct.domain_versions_map.put(_key26, _val27);
          }
        }
        struct.set_domain_versions_map_isSet(true);
      }
    }
  }

}

