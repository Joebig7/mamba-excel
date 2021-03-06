package com.joebig7.enums;

/**
 * @Author JoeBig7
 * @date 2021/7/12 17:39:40
 * @description 文件类型
 * @description  file type
 */
public enum FileTypeEnum {

    XLS("xls"),
    XLSX("xlsx"),
    CSV("csv");


    String fileType;

    FileTypeEnum(String fileType) {
        this.fileType = fileType;
    }


    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
