package com.joebig7.core.data;

import com.joebig7.enums.FieldTypeEnum;

/**
 * @Author JoeBig7
 * @date 2021/7/19 15:22:17
 * @description Header数据
 */
public class HeaderData {
    public HeaderData(String fieldName, FieldTypeEnum fieldTypeEnum) {
        this.fieldName = fieldName;
        this.fieldTypeEnum = fieldTypeEnum;
    }

    private String fieldName;
    private FieldTypeEnum fieldTypeEnum;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public FieldTypeEnum getFieldTypeEnum() {
        return fieldTypeEnum;
    }

    public void setFieldTypeEnum(FieldTypeEnum fieldTypeEnum) {
        this.fieldTypeEnum = fieldTypeEnum;
    }
}
