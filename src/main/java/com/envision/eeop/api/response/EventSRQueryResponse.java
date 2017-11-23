package com.envision.eeop.api.response;

import com.envision.eeop.api.EnvisionPaginationResponse;
import com.envision.eos.event.api.bo.EventSR;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Copyright http://www.envisioncn.com/
 * All rights reserved.
 *
 * @author jonnas.li
 */
public class EventSRQueryResponse extends EnvisionPaginationResponse {
    private static final long serialVersionUID = 7566092919106718222L;

    @SerializedName("data")
    private List<EventSR> eventSRList;

    public List<EventSR> getEventSRList() {
        return eventSRList;
    }

    public void setEventSRList(List<EventSR> eventSRList) {
        this.eventSRList = eventSRList;
    }

    @Override
    public EnvisionPaginationResponse merge(EnvisionPaginationResponse another) {
        if (another.isSuccess() &&
                another instanceof EventSRQueryResponse) {
            eventSRList.addAll(((EventSRQueryResponse)another).eventSRList);
        }
        return this;
    }
}

