package com.meniga.sdk.webservices.requests;

/**
 * Copyright 2017 Meniga Iceland Inc.
 */
public class GetBudgetEntryById extends QueryRequestObject {
    public long budgetId;
    public long entryId;
    @Override
    public long getValueHash() {
        return budgetId * 31 + entryId;
    }
}