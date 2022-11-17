package org.training.design.patterns.atm.with.patterns;

import org.training.design.patterns.atm.EAccountType;

public abstract class AbstractAtmCommand implements IAtmCommand {
    protected EAccountType accountType;

    public AbstractAtmCommand(EAccountType accountType) {
        this.accountType = accountType;
    }
}
