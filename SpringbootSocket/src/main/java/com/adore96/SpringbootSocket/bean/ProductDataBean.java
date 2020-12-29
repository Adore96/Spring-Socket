package com.adore96.SpringbootSocket.bean;

/**
 * @author kalharaperera ON 12/28/20
 * @project SpringbootSocket
 */

public class ProductDataBean {
    private String pid;
    private String name;
    private String description;
    private String price;

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
