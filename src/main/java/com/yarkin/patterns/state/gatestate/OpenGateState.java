package com.yarkin.patterns.state.gatestate;

import com.yarkin.patterns.state.Gate;
import com.yarkin.patterns.state.GateState;

public class OpenGateState implements GateState
{
    private final Gate gate;

    public OpenGateState(Gate gate)
    {
        this.gate = gate;
    }

    @Override
    public void enter() {

    }

    @Override
    public void pay() {

    }

    @Override
    public void payOk() {

    }

    @Override
    public void payFailed() {

    }
}
