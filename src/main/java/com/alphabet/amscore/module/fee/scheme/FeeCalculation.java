package com.alphabet.amscore.module.fee.scheme;

import java.math.BigDecimal;

public interface FeeCalculation {
    public BigDecimal getCalculation(BigDecimal amount, BigDecimal value);
}
