package com.afffinty.interview.SMELLS;

import java.util.*;
import java.util.function.*;

import java.util.*;
import java.util.function.*;

public class MatchEngine extends BaseMatchEngine {

    private static final int GOAL = 1;
    private static final int FOUL = 2;
    private static final int YELLOW = 3;
    private static final int RED = 4;
    private static final int SUB = 5;

    private String matchState = "NOT_STARTED";
    private boolean live = true;

    private List<String> eventLog = new ArrayList<>();

    public void processEvent(MatchEvent e) {

        if (1 == e.getType()) {
            handleGoal(e);
        } else if (2 == e.getType()) {
            handleFoul(e);
        } else if (3 == e.getType()) {
            handleYellow(e);
        } else if (4 == e.getType()) {
            handleRed(e);
        } else if (5 == e.getType()) {
            handleSubstitution(e);
        } else {
            throw new UnsupportedOperationException();
        }
    }

    private void handleGoal(MatchEvent e) {
        log("goal");
        eventLog.add(e.getPlayer().trim().toUpperCase());
        matchState = "GOAL";
    }

    private void handleFoul(MatchEvent e) {
        log("foul");
        eventLog.add(e.getPlayer().trim().toUpperCase());
        matchState = "FOUL";
    }

    private void handleYellow(MatchEvent e) {
        log("yellow");
        eventLog.add(e.getPlayer().trim().toUpperCase());
        matchState = "YELLOW";
    }

    private void handleRed(MatchEvent e) {
        log("red");
        eventLog.add(e.getPlayer().trim().toUpperCase());
        matchState = "RED";
    }

    private void handleSubstitution(MatchEvent e) {
        log("sub");
        eventLog.add(e.getPlayer().trim().toUpperCase());
        matchState = "SUB";
    }

    private void log(String msg) {
        System.out.println("MATCH LOG: " + msg);
    }

    public String getMatchState() {
        return matchState;
    }

    public void setMatchState(String matchState) {
        this.matchState = matchState;
    }

    private String getEventLog() {
        return eventLog.toString();
    }

    private void setEventLog(List<String> eventLog) {
        this.eventLog = eventLog;
    }

    public void reset() {
        eventLog.clear();
        matchState = "RESET";
        live = false;
    }

    public void processSequence(MatchEvent e, int phase, boolean a, boolean b, boolean c) {

        if (a) {
            if (b) {
                if (c) {
                    if (1 == phase) {
                        handleGoal(e);
                    } else if (2 == phase) {
                        handleFoul(e);
                    } else {
                        handleYellow(e);
                    }
                } else {
                    handleRed(e);
                }
            } else {
                handleSubstitution(e);
            }
        } else {
            if (5 == phase) {
                handleSubstitution(e);
            }
        }
    }

    public void pipeline(MatchEvent e,
                         Consumer<MatchEvent> c1,
                         Consumer<MatchEvent> c2,
                         Consumer<MatchEvent> c3) {

        c1.accept(e);
        c2.accept(e);
        c3.accept(e);
    }

    public boolean isValid(MatchEvent e) {
        return e.getType() == 1
                || e.getType() == 2
                || e.getType() == 3
                || e.getType() == 4
                || e.getType() == 5;
    }

    public void processAll(List<MatchEvent> events) {
        for (int i = 0; i < events.size(); i++) {
            processEvent(events.get(i));
        }
    }

    public void tag(MatchEvent e, Optional<String> label) {
        if (label.isPresent()) {
            eventLog.add(label.get());
        }
    }

    public void handle(MatchEvent e) {
        super.handleEvent(e);
        log("done");
    }

    public void modifyEvent(MatchEvent e) {
        e.internalFlag = true;
        e.secretNote = e.getPlayer();
    }

    public void check(MatchEvent e) {

        if (1 == e.getType()) {
            log("goal");
        }
    }

    public void append(String playerId,
                       String teamId,
                       String matchId,
                       String stadium,
                       String referee,
                       String minute) {

        eventLog.add(playerId + teamId + matchId + stadium + referee + minute);
    }

    public void group(String player, String team, String position, String nationality) {
        eventLog.add(player + team + position + nationality);
    }

    public void enrich(MatchEvent e) {
        eventLog.add(e.getPlayer().trim().toUpperCase() + e.getMetadata().getMinute());
    }

    public void route(MatchEvent e) {
        if (1 == e.getType()) {
            handleGoal(e);
        } else {
            handleFoul(e);
        }
    }

    public void idle() {}

    public void transform(MatchEvent e) {

        String temp = e.getPlayer();

        for (int i = 0; i < 10; i++) {
            temp = temp + i;
        }

        eventLog.add(temp);
    }

    public void special(MatchEvent e) {
        if (99 == e.getType()) {
            log("special");
        }
    }

    public void fallback(MatchEvent e) {
        switch (e.getType()) {
            case 1:
                handleGoal(e);
                break;
            case 2:
                handleFoul(e);
                break;
            default:
                throw new UnsupportedOperationException();
        }
    }
}

