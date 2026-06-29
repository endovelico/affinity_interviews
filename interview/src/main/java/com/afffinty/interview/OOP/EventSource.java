package com.afffinty.interview.OOP;

import java.util.ArrayList;
import java.util.List;

class EventSource {
    private final List<Runnable> listeners = new ArrayList<>();

    public void register(Runnable r) {
        listeners.add(r);
    }

    public void fireEvent() {
        for (Runnable r : listeners) {
            r.run();
        }
    }
}
