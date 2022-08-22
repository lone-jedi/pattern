package com.yarkin.patterns.state.gatestate;

import com.yarkin.patterns.state.Gate;
import com.yarkin.patterns.state.GateState;

public class CloseGateState implements GateState
{
    private final Gate gate;

    public CloseGateState(Gate gate)
    {
        this.gate = gate;
    }

    @Override
    public void enter()
    {
        System.out.println("CLOSE: not allowed to enter");
    }

    @Override
    public void pay()
    {
        gate.changeState(new ProcessingGateState(gate));
        System.out.println("PROCESSING: pay in processing");
    }

    @Override
    public void payOk()
    {
        System.out.println("CLOSED: payment cannot be ok, not in processing");
    }

    @Override
    public void payFailed()
    {
        System.out.println("CLOSED: payment cannot be failed.0, not in processing");
    }
}
