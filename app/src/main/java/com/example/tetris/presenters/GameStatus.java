package com.example.tetris.presenters;

public enum GameStatus {
    START("START"),
    PLAYING("PLAYING"),
    OVER("GAME OVER"),
    PAUSED("PAUSE");

    private final String mValue;

    GameStatus(String value) {
        mValue = value;
    }

    public String getValue() {
        return mValue;
    }
}
