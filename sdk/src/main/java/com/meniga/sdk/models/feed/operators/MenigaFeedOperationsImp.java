package com.meniga.sdk.models.feed.operators;

import com.meniga.sdk.MenigaSDK;
import com.meniga.sdk.helpers.Result;
import com.meniga.sdk.models.feed.MenigaFeed;
import com.meniga.sdk.models.feed.MenigaFeedItem;
import com.meniga.sdk.webservices.requests.GetEvent;
import com.meniga.sdk.webservices.requests.GetFeed;

import org.joda.time.DateTime;

/**
 * Copyright 2017 Meniga Iceland Inc.
 */
public class MenigaFeedOperationsImp implements MenigaFeedOperations {

	@Override
	public Result<MenigaFeed> getFeed(DateTime from, DateTime to) {
		GetFeed req = new GetFeed();
		req.dateFrom = from;
		req.dateTo = to;

		return MenigaSDK.executor().getFeed(req);
	}

	@Override
	public Result<MenigaFeed> getFeed(DateTime from, DateTime to, int skip, int take) {
		GetFeed req = new GetFeed();
		req.dateFrom = from;
		req.dateTo = to;
		req.skip = skip;
		req.take = take;

		return MenigaSDK.executor().getFeed(req);
	}

	public Result<MenigaFeedItem> getEvent(long id) {
		GetEvent req = new GetEvent();
		req.id = id;

		return MenigaSDK.executor().getEvent(req);
	}
}
