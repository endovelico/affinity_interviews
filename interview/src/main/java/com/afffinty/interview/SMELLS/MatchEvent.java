package com.afffinty.interview.SMELLS;

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
