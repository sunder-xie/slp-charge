package com.ai.runner.center.charge.api.paymentquery.param;

import java.sql.Timestamp;

import com.ai.runner.base.vo.BaseInfo;
import com.ai.runner.base.vo.PageInfo;

/**
 * 按账号查询收费流水入参.<br>
 * Date: 2015年8月11日 <br>
 * Copyright (c) 2015 asiainfo.com <br>
 * 
 * @author fanpw
 */
public class ChargeInfoQueryByAcctIdParam extends BaseInfo {

    private static final long serialVersionUID = 8799286736561421624L;

    /**
     * 账户ID
     */
    private long accountId;

    /**
     * 开始时间
     */
    private Timestamp startTime;

    /**
     * 结束时间
     */
    private Timestamp endTime;

    /**
     * 分页信息
     */
    private PageInfo<ChargeBaseInfo> pageInfo;

    public long getAccountId() {
        return accountId;
    }

    public void setAccountId(long accountId) {
        this.accountId = accountId;
    }

    public Timestamp getStartTime() {
        if (startTime == null) {
            return null;
        }

        return new Timestamp(startTime.getTime());
    }

    public void setStartTime(Timestamp startTime) {
        if (startTime != null) {
            this.startTime = new Timestamp(startTime.getTime());
        }
    }

    public Timestamp getEndTime() {
        if (endTime == null) {
            return null;
        }

        return new Timestamp(endTime.getTime());
    }

    public void setEndTime(Timestamp endTime) {
        if (endTime != null) {
            this.endTime = new Timestamp(endTime.getTime());
        }
    }

    public PageInfo<ChargeBaseInfo> getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo<ChargeBaseInfo> pageInfo) {
        this.pageInfo = pageInfo;
    }
}
