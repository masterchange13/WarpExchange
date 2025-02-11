package org.mao.tradingengine.match;

import org.mao.common.model.trade.OrderEntity;

import java.math.BigDecimal;



public record MatchDetailRecord(BigDecimal price, BigDecimal quantity, OrderEntity takerOrder, OrderEntity makerOrder) {
}