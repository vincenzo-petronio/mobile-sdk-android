package com.meniga.sdk.webservices.requests;

import com.meniga.sdk.helpers.MenigaDecimal;

import org.joda.time.DateTime;

import java.util.List;

/**
 * Copyright 2017 Meniga Iceland Inc.
 */

public class UpdateBudget extends QueryRequestObject {
    public transient long budgetId;
    public List<UpdateBudgetData> rules;

    @Override
    public long getValueHash() {
        int result = (int) (budgetId ^ (budgetId >>> 32));
        result = 31 * result + (rules != null ? rules.hashCode() : 0);
        return result;
    }

    public static class UpdateBudgetData {
        public MenigaDecimal targetAmount;
        public DateTime startDate;
        public DateTime endDate;
        public List<Long> categoryIds;
        public int generationType;
        public RecurringPattern recurringPattern;
        public DateTime repeatUntil;

        @Override
        public int hashCode() {
            int result = targetAmount != null ? targetAmount.hashCode() : 0;
            result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
            result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
            result = 31 * result + (categoryIds != null ? categoryIds.hashCode() : 0);
            result = 31 * result + generationType;
            result = 31 * result + (recurringPattern != null ? recurringPattern.hashCode() : 0);
            result = 31 * result + (repeatUntil != null ? repeatUntil.hashCode() : 0);
            return result;
        }
    }

    public static class RecurringPattern {
        public int monthInterval = 1;

        @Override
        public int hashCode() {
            return monthInterval;
        }
    }
}
