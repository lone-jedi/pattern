package com.yarkin.patterns.templatemethod;

public abstract class Record
{
    protected String sql;
    protected boolean isOk;

    public void save()
    {
        // template method
        beforeSave();

        System.out.println("execute sql: " + sql);
        boolean isOk = true;

        if (!isOk)
        {
            afterSaveFailed();
            return;
        }

        afterSave();
    }

    protected abstract void beforeSave();
    protected abstract void afterSave();
    protected abstract void afterSaveFailed();
}
