package org.example;

import java.util.Properties;

public class PropertiesBean {

    private Properties prop = new Properties();

    public PropertiesBean(Properties prop) {
        this.prop = prop;
    }

    public PropertiesBean() {
        super();
    }


    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "PropertiesBean{" +
                "prop=" + prop +
                '}';
    }
}
