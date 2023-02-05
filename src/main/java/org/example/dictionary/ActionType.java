package org.example.dictionary;

import lombok.Getter;

public enum ActionType {

    I("I"), U("U"), D("D");

    @Getter
    private final String actionValue;

    ActionType(String actionValue) {
        this.actionValue = actionValue;
    }
}
