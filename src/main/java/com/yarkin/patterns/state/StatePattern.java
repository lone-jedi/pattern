package com.yarkin.patterns.state;

import com.yarkin.patterns.Pattern;

public class StatePattern implements Pattern
{
    @Override
    public void run()
    {
            Gate gate = new Gate();

            // not allowed
            gate.enter();

            // processing...
            gate.pay();

            // not allowed
            gate.enter();

            // in processing, please wait
            gate.pay();

            // payment success, enter allowed
            gate.payOk();

            // enter allowed
            gate.enter();

            // not allowed
            gate.enter();
    }
}
