package org.mao.tradingengine.match;

import java.math.BigDecimal;

public record OrderKey(long sequenceId, BigDecimal price) {
}
