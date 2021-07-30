package de.vazzi;

import dev.waterdog.waterdogpe.event.defaults.ProxyPingEvent;
import dev.waterdog.waterdogpe.plugin.Plugin;

public class ProxyExtraSlot extends Plugin {

    public static Integer slots;

    @Override
    public void onEnable() {
        loadConfig();
        slots = getConfig().getInt("extra-slots", 1);
        getProxy().getEventManager().subscribe(ProxyPingEvent.class, EventListener::changePlayerCount);
    }

}