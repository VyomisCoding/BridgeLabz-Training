package com.json;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

public class ValidateEmailJSON {
    public static void main(String[] args) throws Exception {

        String jsonData = Files.readString(Paths.get("user.json"));

        String jsonSchema = """
        {
          "type": "object",
          "properties": {
            "email": { "type": "string", "format": "email" }
          },
          "required": ["email"]
        }
        """;

        ObjectMapper mapper = new ObjectMapper();

        JsonNode schemaNode = mapper.readTree(jsonSchema);
        JsonNode dataNode = mapper.readTree(jsonData);

        JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V201909);
        JsonSchema schema = factory.getSchema(schemaNode);

        Set<ValidationMessage> errors = schema.validate(dataNode);

        if (errors.isEmpty()) {
            System.out.println("Email is valid!");
        } else {
            System.out.println("Errors:");
            errors.forEach(System.out::println);
        }
    }
}
