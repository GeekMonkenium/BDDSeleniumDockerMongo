package utils;

import java.util.List;
import java.util.Map;

public class Context {

    Map<String, Object> config;

    public Context(Map<String, Object> config) throws Exception{
        this.config = config;
    }

    public String getValue(String key) {

        return (String) config.get(key);
    }

    public String getValue(String key1, String key2) {

        if (config.containsKey(key1)) {
            return (String) ((Map) config.get(key1)).get(key2);
        }
        return null;
    }

    public List getValues(String key) {

        return (List) config.get(key);
    }

    public List getValues(String key1, String key2) {

        if (config.containsKey(key1)) {
            return (List) ((Map) config.get(key1)).get(key2);
        }
        return null;
    }

    public String getApplicationURL() {
        return getValue("ui_url");
    }
}