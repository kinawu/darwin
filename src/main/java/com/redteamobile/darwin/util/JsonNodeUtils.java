package com.redteamobile.darwin.util;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.Collection;

public class JsonNodeUtils {
    public static void addJsonNodeArray(ObjectNode node, String name, Collection<JsonNode> collection) {
        ArrayNode arrayNode = node.arrayNode();
        collection.stream().forEach(i -> arrayNode.add(i));
        node.set(name, arrayNode);
    }

    public static void addStringArray(ObjectNode node, String name, Collection<String> collection) {
        ArrayNode arrayNode = node.arrayNode();
        collection.stream().forEach(i -> arrayNode.add(i));
        node.set(name, arrayNode);
    }

    public static JsonNode getOrElse(JsonNode node, String field) {
        if (node == null) return null;
        return (node.get(field) == null || node.get(field) instanceof NullNode) ? null : node.get(field);
    }

    public static String getOrElse(JsonNode node, String field, String defaultValue) {
        if (node == null) return defaultValue;
        return (node.get(field) == null || node.get(field) instanceof NullNode ) ? defaultValue : node.get(field).asText();
    }

    public static int getOrElse(JsonNode node, String field, int defaultValue) {
        if (node == null) return defaultValue;
        return (node.get(field) == null || node.get(field) instanceof NullNode ) ? defaultValue : node.get(field).asInt();
    }

    public static boolean getOrElse(JsonNode node, String field, boolean defaultValue) {
        if (node == null) return defaultValue;
        return (node.get(field) == null || node.get(field) instanceof NullNode ) ? defaultValue : node.get(field).asBoolean();
    }

    public static long getOrElse(JsonNode node, String field, long defaultValue) {
        if (node == null) return defaultValue;
        return (node.get(field) == null || node.get(field) instanceof NullNode ) ? defaultValue : node.get(field).asLong();
    }
}
