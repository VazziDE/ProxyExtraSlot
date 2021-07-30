package de.vazzi;

import dev.waterdog.waterdogpe.event.defaults.ProxyPingEvent;

public class EventListener {

    public static void changePlayerCount(ProxyPingEvent event){

        event.setMaximumPlayerCount(event.getPlayerCount() + ProxyExtraSlot.slots);

    }

}
