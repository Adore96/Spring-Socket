package com.adore96.SpringbootSocket.webSockets;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kalharaperera ON 12/29/20
 * @project SpringbootSocket
 */

@Controller
public class BotsController {

    @MessageMapping("/chatwithbots")
    @SendTo("/topic/pushmessages")
    public OutputMessage send(final Message message) throws Exception {

        final String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }
}
