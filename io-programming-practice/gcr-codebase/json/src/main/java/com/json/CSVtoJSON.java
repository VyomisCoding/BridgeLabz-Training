package com.json;

import java.io.File;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

public class CSVtoJSON {
    public static void main(String[] args) throws Exception {

        File csvFile = new File("data.csv");

        CsvMapper csvMapper = new CsvMapper();
        CsvSchema schema = CsvSchema.emptySchema().withHeader();

        MappingIterator<Map<String, String>> it =
                csvMapper.readerFor(Map.class).with(schema).readValues(csvFile);

        List<Map<String, String>> rows = it.readAll();

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(rows);

        System.out.println(json);
    }
}
