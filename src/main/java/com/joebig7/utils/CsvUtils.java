package com.joebig7.utils;

import com.joebig7.core.data.HeaderData;
import com.joebig7.exception.CsvException;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVPrinter;

import java.io.IOException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @Author JoeBig7
 * @date 2021/12/14 17:53:28
 * @description csv通用工具类
 */
public class CsvUtils {

    /**
     * 像csv文件写具体的内容
     *
     * @param csvPrinter
     * @param headerDataList
     * @param contentDataList
     */
    public static void write(CSVPrinter csvPrinter, List<HeaderData> headerDataList, List<List<Object>> contentDataList) throws IOException {
        if (Objects.isNull(csvPrinter)) {
            throw new CsvException("CSVPrinter is null");
        }

        if (Objects.nonNull(headerDataList)) {
            List<String> headerNames = headerDataList.stream().map(HeaderData::getFieldName).collect(Collectors.toList());
            csvPrinter.printRecord(headerNames);
        }

        if (Objects.nonNull(contentDataList)) {
            for (List<Object> list : contentDataList) {
                csvPrinter.printRecord(list);
            }
        }
    }

    /**
     * 关闭CSVPrinter 流
     *
     * @param csvPrinter
     */
    public static void close(CSVPrinter csvPrinter) {
        if (Objects.nonNull(csvPrinter)) {
            try {
                csvPrinter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 刷新CSVPrinter流
     *
     * @param csvPrinter
     */
    public static void flush(CSVPrinter csvPrinter) {
        if (Objects.nonNull(csvPrinter)) {
            try {
                csvPrinter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 关闭CSVParser 流
     *
     * @param csvParser
     */
    public static void close(CSVParser csvParser) {
        if (Objects.nonNull(csvParser)) {
            try {
                csvParser.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
