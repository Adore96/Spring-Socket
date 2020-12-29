package com.adore96.SpringbootSocket.webSockets;

/**
 * @author kalharaperera ON 12/29/20
 * @project SpringbootSocket
 */

public class OutputMessage {
    private String from;
    private String text;
    private String time;

    public OutputMessage(final String from, final String text, final String time) {

        this.from = from;
        this.text = text;
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public String getTime() {
        return time;
    }

    public String getFrom() {
        return from;
    }
}
