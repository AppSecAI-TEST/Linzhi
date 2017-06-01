package com.linzhi.model;

import java.io.Serializable;

/**
 * Created by sjy on 2017/4/12.
 */

public class MessageListModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String clientID;
    private String name;
    private String time;
    private String clientLevel;
    private String remake;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getRemake() {
        return remake;
    }

    public void setRemake(String remake) {
        this.remake = remake;
    }

    public String getClientId() {
        return clientID;
    }

    public void setClientId(String clientId) {
        this.clientID = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getClientLevel() {
        return clientLevel;
    }

    public void setClientLevel(String clientLevel) {
        this.clientLevel = clientLevel;
    }
}
