package com.yarkin.patterns.command;

public interface Command
{
    void execute();
    void rollback();
}
