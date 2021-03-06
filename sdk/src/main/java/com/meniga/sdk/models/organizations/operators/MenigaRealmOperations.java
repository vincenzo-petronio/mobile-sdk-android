package com.meniga.sdk.models.organizations.operators;

import com.meniga.sdk.helpers.Result;
import com.meniga.sdk.models.organizations.MenigaRealmAccount;
import com.meniga.sdk.models.organizations.MenigaRealmAuthResponse;
import com.meniga.sdk.models.organizations.MenigaRealmAuthParameter;

import java.util.List;

/**
 * Copyright 2017 Meniga Iceland Inc.
 */
public interface MenigaRealmOperations {

	Result<MenigaRealmAuthResponse> performBankAuthenticationStep(long id, List<MenigaRealmAuthParameter> authParams, String userId, String sessionToken);

	Result<List<MenigaRealmAccount>> getRealmAccounts(long realmUserId, String sessionToken);

	Result<List<MenigaRealmAccount>> addRealmAccountsToMeniga(long realmUserId, List<MenigaRealmAccount> accounts, String sessionToken);
}
