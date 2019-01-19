/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.apache.pinot.common.request;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * AUTO GENERATED: DO NOT EDIT
 * Filter query
 * 
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2019-1-18")
public class FilterQuery implements org.apache.thrift.TBase<FilterQuery, FilterQuery._Fields>, java.io.Serializable, Cloneable, Comparable<FilterQuery> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FilterQuery");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField COLUMN_FIELD_DESC = new org.apache.thrift.protocol.TField("column", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField OPERATOR_FIELD_DESC = new org.apache.thrift.protocol.TField("operator", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField NESTED_FILTER_QUERY_IDS_FIELD_DESC = new org.apache.thrift.protocol.TField("nestedFilterQueryIds", org.apache.thrift.protocol.TType.LIST, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FilterQueryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FilterQueryTupleSchemeFactory());
  }

  private int id; // required
  private String column; // optional
  private List<String> value; // required
  private FilterOperator operator; // optional
  private List<Integer> nestedFilterQueryIds; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    /**
     * This should be unique within a single request *
     */
    COLUMN((short)2, "column"),
    VALUE((short)3, "value"),
    /**
     * 
     * @see FilterOperator
     */
    OPERATOR((short)4, "operator"),
    NESTED_FILTER_QUERY_IDS((short)5, "nestedFilterQueryIds");

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
        case 1: // ID
          return ID;
        case 2: // COLUMN
          return COLUMN;
        case 3: // VALUE
          return VALUE;
        case 4: // OPERATOR
          return OPERATOR;
        case 5: // NESTED_FILTER_QUERY_IDS
          return NESTED_FILTER_QUERY_IDS;
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
  private static final int __ID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.COLUMN,_Fields.OPERATOR};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.COLUMN, new org.apache.thrift.meta_data.FieldMetaData("column", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OPERATOR, new org.apache.thrift.meta_data.FieldMetaData("operator", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, FilterOperator.class)));
    tmpMap.put(_Fields.NESTED_FILTER_QUERY_IDS, new org.apache.thrift.meta_data.FieldMetaData("nestedFilterQueryIds", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FilterQuery.class, metaDataMap);
  }

  public FilterQuery() {
  }

  public FilterQuery(
    int id,
    List<String> value,
    List<Integer> nestedFilterQueryIds)
  {
    this();
    this.id = id;
    setIdIsSet(true);
    this.value = value;
    this.nestedFilterQueryIds = nestedFilterQueryIds;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FilterQuery(FilterQuery other) {
    __isset_bitfield = other.__isset_bitfield;
    this.id = other.id;
    if (other.isSetColumn()) {
      this.column = other.column;
    }
    if (other.isSetValue()) {
      List<String> __this__value = new ArrayList<String>(other.value);
      this.value = __this__value;
    }
    if (other.isSetOperator()) {
      this.operator = other.operator;
    }
    if (other.isSetNestedFilterQueryIds()) {
      List<Integer> __this__nestedFilterQueryIds = new ArrayList<Integer>(other.nestedFilterQueryIds);
      this.nestedFilterQueryIds = __this__nestedFilterQueryIds;
    }
  }

  public FilterQuery deepCopy() {
    return new FilterQuery(this);
  }

  @Override
  public void clear() {
    setIdIsSet(false);
    this.id = 0;
    this.column = null;
    this.value = null;
    this.operator = null;
    this.nestedFilterQueryIds = null;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
    setIdIsSet(true);
  }

  public void unsetId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ID_ISSET_ID);
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return EncodingUtils.testBit(__isset_bitfield, __ID_ISSET_ID);
  }

  public void setIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ID_ISSET_ID, value);
  }

  /**
   * This should be unique within a single request *
   */
  public String getColumn() {
    return this.column;
  }

  /**
   * This should be unique within a single request *
   */
  public void setColumn(String column) {
    this.column = column;
  }

  public void unsetColumn() {
    this.column = null;
  }

  /** Returns true if field column is set (has been assigned a value) and false otherwise */
  public boolean isSetColumn() {
    return this.column != null;
  }

  public void setColumnIsSet(boolean value) {
    if (!value) {
      this.column = null;
    }
  }

  public int getValueSize() {
    return (this.value == null) ? 0 : this.value.size();
  }

  public java.util.Iterator<String> getValueIterator() {
    return (this.value == null) ? null : this.value.iterator();
  }

  public void addToValue(String elem) {
    if (this.value == null) {
      this.value = new ArrayList<String>();
    }
    this.value.add(elem);
  }

  public List<String> getValue() {
    return this.value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }

  public void unsetValue() {
    this.value = null;
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return this.value != null;
  }

  public void setValueIsSet(boolean value) {
    if (!value) {
      this.value = null;
    }
  }

  /**
   * 
   * @see FilterOperator
   */
  public FilterOperator getOperator() {
    return this.operator;
  }

  /**
   * 
   * @see FilterOperator
   */
  public void setOperator(FilterOperator operator) {
    this.operator = operator;
  }

  public void unsetOperator() {
    this.operator = null;
  }

  /** Returns true if field operator is set (has been assigned a value) and false otherwise */
  public boolean isSetOperator() {
    return this.operator != null;
  }

  public void setOperatorIsSet(boolean value) {
    if (!value) {
      this.operator = null;
    }
  }

  public int getNestedFilterQueryIdsSize() {
    return (this.nestedFilterQueryIds == null) ? 0 : this.nestedFilterQueryIds.size();
  }

  public java.util.Iterator<Integer> getNestedFilterQueryIdsIterator() {
    return (this.nestedFilterQueryIds == null) ? null : this.nestedFilterQueryIds.iterator();
  }

  public void addToNestedFilterQueryIds(int elem) {
    if (this.nestedFilterQueryIds == null) {
      this.nestedFilterQueryIds = new ArrayList<Integer>();
    }
    this.nestedFilterQueryIds.add(elem);
  }

  public List<Integer> getNestedFilterQueryIds() {
    return this.nestedFilterQueryIds;
  }

  public void setNestedFilterQueryIds(List<Integer> nestedFilterQueryIds) {
    this.nestedFilterQueryIds = nestedFilterQueryIds;
  }

  public void unsetNestedFilterQueryIds() {
    this.nestedFilterQueryIds = null;
  }

  /** Returns true if field nestedFilterQueryIds is set (has been assigned a value) and false otherwise */
  public boolean isSetNestedFilterQueryIds() {
    return this.nestedFilterQueryIds != null;
  }

  public void setNestedFilterQueryIdsIsSet(boolean value) {
    if (!value) {
      this.nestedFilterQueryIds = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((Integer)value);
      }
      break;

    case COLUMN:
      if (value == null) {
        unsetColumn();
      } else {
        setColumn((String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((List<String>)value);
      }
      break;

    case OPERATOR:
      if (value == null) {
        unsetOperator();
      } else {
        setOperator((FilterOperator)value);
      }
      break;

    case NESTED_FILTER_QUERY_IDS:
      if (value == null) {
        unsetNestedFilterQueryIds();
      } else {
        setNestedFilterQueryIds((List<Integer>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return Integer.valueOf(getId());

    case COLUMN:
      return getColumn();

    case VALUE:
      return getValue();

    case OPERATOR:
      return getOperator();

    case NESTED_FILTER_QUERY_IDS:
      return getNestedFilterQueryIds();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case COLUMN:
      return isSetColumn();
    case VALUE:
      return isSetValue();
    case OPERATOR:
      return isSetOperator();
    case NESTED_FILTER_QUERY_IDS:
      return isSetNestedFilterQueryIds();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FilterQuery)
      return this.equals((FilterQuery)that);
    return false;
  }

  public boolean equals(FilterQuery that) {
    if (that == null)
      return false;

    boolean this_present_id = true;
    boolean that_present_id = true;
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (this.id != that.id)
        return false;
    }

    boolean this_present_column = true && this.isSetColumn();
    boolean that_present_column = true && that.isSetColumn();
    if (this_present_column || that_present_column) {
      if (!(this_present_column && that_present_column))
        return false;
      if (!this.column.equals(that.column))
        return false;
    }

    boolean this_present_value = true && this.isSetValue();
    boolean that_present_value = true && that.isSetValue();
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (!this.value.equals(that.value))
        return false;
    }

    boolean this_present_operator = true && this.isSetOperator();
    boolean that_present_operator = true && that.isSetOperator();
    if (this_present_operator || that_present_operator) {
      if (!(this_present_operator && that_present_operator))
        return false;
      if (!this.operator.equals(that.operator))
        return false;
    }

    boolean this_present_nestedFilterQueryIds = true && this.isSetNestedFilterQueryIds();
    boolean that_present_nestedFilterQueryIds = true && that.isSetNestedFilterQueryIds();
    if (this_present_nestedFilterQueryIds || that_present_nestedFilterQueryIds) {
      if (!(this_present_nestedFilterQueryIds && that_present_nestedFilterQueryIds))
        return false;
      if (!this.nestedFilterQueryIds.equals(that.nestedFilterQueryIds))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true;
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_column = true && (isSetColumn());
    list.add(present_column);
    if (present_column)
      list.add(column);

    boolean present_value = true && (isSetValue());
    list.add(present_value);
    if (present_value)
      list.add(value);

    boolean present_operator = true && (isSetOperator());
    list.add(present_operator);
    if (present_operator)
      list.add(operator.getValue());

    boolean present_nestedFilterQueryIds = true && (isSetNestedFilterQueryIds());
    list.add(present_nestedFilterQueryIds);
    if (present_nestedFilterQueryIds)
      list.add(nestedFilterQueryIds);

    return list.hashCode();
  }

  @Override
  public int compareTo(FilterQuery other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColumn()).compareTo(other.isSetColumn());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColumn()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.column, other.column);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOperator()).compareTo(other.isSetOperator());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOperator()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.operator, other.operator);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNestedFilterQueryIds()).compareTo(other.isSetNestedFilterQueryIds());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNestedFilterQueryIds()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nestedFilterQueryIds, other.nestedFilterQueryIds);
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
    StringBuilder sb = new StringBuilder("FilterQuery(");
    boolean first = true;

    sb.append("id:");
    sb.append(this.id);
    first = false;
    if (isSetColumn()) {
      if (!first) sb.append(", ");
      sb.append("column:");
      if (this.column == null) {
        sb.append("null");
      } else {
        sb.append(this.column);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("value:");
    if (this.value == null) {
      sb.append("null");
    } else {
      sb.append(this.value);
    }
    first = false;
    if (isSetOperator()) {
      if (!first) sb.append(", ");
      sb.append("operator:");
      if (this.operator == null) {
        sb.append("null");
      } else {
        sb.append(this.operator);
      }
      first = false;
    }
    if (!first) sb.append(", ");
    sb.append("nestedFilterQueryIds:");
    if (this.nestedFilterQueryIds == null) {
      sb.append("null");
    } else {
      sb.append(this.nestedFilterQueryIds);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (!isSetId()) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'id' is unset! Struct:" + toString());
    }

    // check for sub-struct validity
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
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class FilterQueryStandardSchemeFactory implements SchemeFactory {
    public FilterQueryStandardScheme getScheme() {
      return new FilterQueryStandardScheme();
    }
  }

  private static class FilterQueryStandardScheme extends StandardScheme<FilterQuery> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FilterQuery struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.id = iprot.readI32();
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COLUMN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.column = iprot.readString();
              struct.setColumnIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.value = new ArrayList<String>(_list0.size);
                String _elem1;
                for (int _i2 = 0; _i2 < _list0.size; ++_i2)
                {
                  _elem1 = iprot.readString();
                  struct.value.add(_elem1);
                }
                iprot.readListEnd();
              }
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OPERATOR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.operator = org.apache.pinot.common.request.FilterOperator.findByValue(iprot.readI32());
              struct.setOperatorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // NESTED_FILTER_QUERY_IDS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list3 = iprot.readListBegin();
                struct.nestedFilterQueryIds = new ArrayList<Integer>(_list3.size);
                int _elem4;
                for (int _i5 = 0; _i5 < _list3.size; ++_i5)
                {
                  _elem4 = iprot.readI32();
                  struct.nestedFilterQueryIds.add(_elem4);
                }
                iprot.readListEnd();
              }
              struct.setNestedFilterQueryIdsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, FilterQuery struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ID_FIELD_DESC);
      oprot.writeI32(struct.id);
      oprot.writeFieldEnd();
      if (struct.column != null) {
        if (struct.isSetColumn()) {
          oprot.writeFieldBegin(COLUMN_FIELD_DESC);
          oprot.writeString(struct.column);
          oprot.writeFieldEnd();
        }
      }
      if (struct.value != null) {
        oprot.writeFieldBegin(VALUE_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.value.size()));
          for (String _iter6 : struct.value)
          {
            oprot.writeString(_iter6);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.operator != null) {
        if (struct.isSetOperator()) {
          oprot.writeFieldBegin(OPERATOR_FIELD_DESC);
          oprot.writeI32(struct.operator.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.nestedFilterQueryIds != null) {
        oprot.writeFieldBegin(NESTED_FILTER_QUERY_IDS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, struct.nestedFilterQueryIds.size()));
          for (int _iter7 : struct.nestedFilterQueryIds)
          {
            oprot.writeI32(_iter7);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FilterQueryTupleSchemeFactory implements SchemeFactory {
    public FilterQueryTupleScheme getScheme() {
      return new FilterQueryTupleScheme();
    }
  }

  private static class FilterQueryTupleScheme extends TupleScheme<FilterQuery> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FilterQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.id);
      BitSet optionals = new BitSet();
      if (struct.isSetColumn()) {
        optionals.set(0);
      }
      if (struct.isSetValue()) {
        optionals.set(1);
      }
      if (struct.isSetOperator()) {
        optionals.set(2);
      }
      if (struct.isSetNestedFilterQueryIds()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetColumn()) {
        oprot.writeString(struct.column);
      }
      if (struct.isSetValue()) {
        {
          oprot.writeI32(struct.value.size());
          for (String _iter8 : struct.value)
          {
            oprot.writeString(_iter8);
          }
        }
      }
      if (struct.isSetOperator()) {
        oprot.writeI32(struct.operator.getValue());
      }
      if (struct.isSetNestedFilterQueryIds()) {
        {
          oprot.writeI32(struct.nestedFilterQueryIds.size());
          for (int _iter9 : struct.nestedFilterQueryIds)
          {
            oprot.writeI32(_iter9);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FilterQuery struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.id = iprot.readI32();
      struct.setIdIsSet(true);
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.column = iprot.readString();
        struct.setColumnIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list10 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.value = new ArrayList<String>(_list10.size);
          String _elem11;
          for (int _i12 = 0; _i12 < _list10.size; ++_i12)
          {
            _elem11 = iprot.readString();
            struct.value.add(_elem11);
          }
        }
        struct.setValueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.operator = org.apache.pinot.common.request.FilterOperator.findByValue(iprot.readI32());
        struct.setOperatorIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list13 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.I32, iprot.readI32());
          struct.nestedFilterQueryIds = new ArrayList<Integer>(_list13.size);
          int _elem14;
          for (int _i15 = 0; _i15 < _list13.size; ++_i15)
          {
            _elem14 = iprot.readI32();
            struct.nestedFilterQueryIds.add(_elem14);
          }
        }
        struct.setNestedFilterQueryIdsIsSet(true);
      }
    }
  }

}

