package com.yarkin.patterns.state;

import com.yarkin.patterns.state.gatestate.CloseGateState;

public class Gate
{

    private GateState gateState;

    public Gate()
    {
        this.gateState = new CloseGateState(this);
    }

    public void changeState(GateState gateState)
    {
        this.gateState = gateState;
    }

    public void enter()
    {
        gateState.enter();
    }

    public void pay()
    {
        gateState.pay();
    }

    public void payOk()
    {
        gateState.payOk();
    }

    public void payFailed()
    {
        gateState.payFailed();
    }
}
