package design.patterns.behavioral.observer;

import java.util.*;

public class EventManager
{
    private final HashMap<String, List<EventListener>> listeners = new HashMap<>();

    void subscribe(EventListener eventListener, String eventType){
        listeners.putIfAbsent(eventType, new ArrayList<>());
        listeners.get(eventType).add(eventListener);
    }

    void unsubscribe(EventListener eventListener, String eventType){
        if(listeners.get(eventType)!=null)
            listeners.get(eventType).remove(eventListener);
    }

    void notifySubscribers(String eventType, String information){
        List<EventListener> specificEventListeners = listeners.get(eventType);
        for(EventListener e: specificEventListeners){
            e.update(information);
            System.out.println("Event listener = "+ e + " has been updated");
        }
    }
}
