package com.java.mailConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@PropertySource("classpath:mail.properties")
@Component("com/java/mailConfig")
public class MailConfig {

    @Value("${host.user}")
    private String user;
    @Value("${host.pass}")
    private String password;
    @Value("${host.clientId}")
    private String clientId;
    @Value("${host.type}")
    private String type;
    @Value("${host.port}")
    private int port;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "MailConfig{" +
                "user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", clientId='" + clientId + '\'' +
                ", type='" + type + '\'' +
                ", port=" + port +
                '}';
    }
}
