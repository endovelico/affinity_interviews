package com.afffinty.interview.SMELLS.solution;

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

    // =========================================================
    // ❌ ISSUE: Magic numbers + primitive type dispatch
    // ❌ ISSUE: Long if-else chain (poor extensibility)
    // ❌ ISSUE: Should use enum + polymorphism or strategy pattern
    // =========================================================
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
            // ❌ ISSUE: brittle design, forces modification for new types
            throw new UnsupportedOperationException();
        }
    }

    // =========================================================
    // ❌ ISSUE: Duplicate logic across handlers
    // ❌ ISSUE: Feature envy (pulling formatting logic from entity)
    // ❌ ISSUE: Tight coupling between processing + logging + state mutation
    // =========================================================
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

    // =========================================================
    // ❌ ISSUE: Side effect + poor abstraction (just prints)
    // =========================================================
    private void log(String msg) {
        System.out.println("MATCH LOG: " + msg);
    }

    // =========================================================
    // ❌ ISSUE: Public mutable state exposure via setters
    // ❌ ISSUE: Encapsulation leak risk
    // =========================================================
    public String getMatchState() {
        return matchState;
    }

    public void setMatchState(String matchState) {
        this.matchState = matchState;
    }

    // =========================================================
    // ❌ ISSUE: Returning internal mutable structure indirectly
    // =========================================================
    private String getEventLog() {
        return eventLog.toString();
    }

    private void setEventLog(List<String> eventLog) {
        this.eventLog = eventLog;
    }

    // =========================================================
    // ❌ ISSUE: Hidden side effects + unclear lifecycle control
    // ❌ ISSUE: Boolean state toggle with no invariant enforcement
    // =========================================================
    public void reset() {
        eventLog.clear();
        matchState = "RESET";
        live = false;
    }

    // =========================================================
    // ❌ ISSUE: High cyclomatic complexity
    // ❌ ISSUE: Nested branching logic (hard to test, hard to maintain)
    // =========================================================
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

    // =========================================================
    // ❌ ISSUE: Callback pipeline hides control flow
    // ❌ ISSUE: Hard to debug execution order
    // =========================================================
    public void pipeline(MatchEvent e,
                         Consumer<MatchEvent> c1,
                         Consumer<MatchEvent> c2,
                         Consumer<MatchEvent> c3) {

        c1.accept(e);
        c2.accept(e);
        c3.accept(e);
    }

    // =========================================================
    // ❌ ISSUE: Boolean blindness (meaning of "valid" unclear)
    // ❌ ISSUE: Hard-coded domain rules
    // =========================================================
    public boolean isValid(MatchEvent e) {
        return e.getType() == 1
                || e.getType() == 2
                || e.getType() == 3
                || e.getType() == 4
                || e.getType() == 5;
    }

    // =========================================================
    // ❌ ISSUE: Primitive obsession (too many raw strings)
    // ❌ ISSUE: Data clump (parameters should be object)
    // =========================================================
    public void append(String playerId,
                       String teamId,
                       String matchId,
                       String stadium,
                       String referee,
                       String minute) {

        eventLog.add(playerId + teamId + matchId + stadium + referee + minute);
    }

    // =========================================================
    // ❌ ISSUE: Data clump duplication across methods
    // =========================================================
    public void group(String player, String team, String position, String nationality) {
        eventLog.add(player + team + position + nationality);
    }

    // =========================================================
    // ❌ ISSUE: Feature envy (depends too much on internals of MatchEvent)
    // =========================================================
    public void enrich(MatchEvent e) {
        eventLog.add(e.getPlayer().trim().toUpperCase() + e.getMetadata().getMinute());
    }

    // =========================================================
    // ❌ ISSUE: Over-simplified branching (oddball logic)
    // =========================================================
    public void route(MatchEvent e) {
        if (1 == e.getType()) {
            handleGoal(e);
        } else {
            handleFoul(e);
        }
    }

    // =========================================================
    // ❌ ISSUE: Dead code / no behavior
    // =========================================================
    public void idle() {}

    // =========================================================
    // ❌ ISSUE: Unnecessary transformation loop (inefficient, unclear intent)
    // =========================================================
    public void transform(MatchEvent e) {

        String temp = e.getPlayer();

        for (int i = 0; i < 10; i++) {
            temp = temp + i;
        }

        eventLog.add(temp);
    }

    // =========================================================
    // ❌ ISSUE: Magic number (99 has no semantic meaning)
    // =========================================================
    public void special(MatchEvent e) {
        if (99 == e.getType()) {
            log("special");
        }
    }

    // =========================================================
    // ❌ ISSUE: Switch-based dispatch (brittle, not extensible)
    // =========================================================
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

class BaseMatchEngine {
    public void handleEvent(MatchEvent e) {
        System.out.println("base handling");
    }
}

class MatchEvent {
    int internalFlag;
    String secretNote;

    private int type;
    private String player;
    private Metadata metadata;

    public int getType() { return type; }
    public String getPlayer() { return player; }
    public Metadata getMetadata() { return metadata; }
}

class Metadata {
    private int minute;
    public int getMinute() { return minute; }
}
