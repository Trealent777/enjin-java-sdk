package com.enjin.sdk.events;

import com.enjin.sdk.models.NotificationEvent;

/**
 * Notification event listener.
 *
 * @author Evan Lindsay
 */
public interface NotificationListener {

    /**
     * Called when an event is received.
     *
     * @param event the event received.
     */
    void notificationReceived(NotificationEvent event);

}
