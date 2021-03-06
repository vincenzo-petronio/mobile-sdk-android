package com.meniga.sdk.models.budget.operators;

import com.meniga.sdk.MenigaSDK;
import com.meniga.sdk.helpers.Result;
import com.meniga.sdk.models.budget.MenigaBudget;
import com.meniga.sdk.models.budget.MenigaBudgetEntry;
import com.meniga.sdk.models.budget.enums.BudgetPeriod;
import com.meniga.sdk.models.budget.enums.BudgetType;
import com.meniga.sdk.webservices.requests.GetBudgetEntries;
import com.meniga.sdk.webservices.requests.GetBudgets;
import com.meniga.sdk.webservices.requests.QueryRequestObject;

import org.joda.time.DateTime;

import java.util.List;

/**
 * Copyright 2017 Meniga Iceland Inc.
 */
public class CreateBudget extends QueryRequestObject {
    public BudgetType type;
    public String name;
    public String description;
    public List<Long> accountIds;
    public String period;
    public int offset;

    @Override
    public long getValueHash() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (accountIds != null ? accountIds.hashCode() : 0);
        result = 31 * result + (period != null ? period.hashCode() : 0);
        result = 31 * result + offset;
        return result;
    }
}
