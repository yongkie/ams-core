package com.alphabet.amscore.module.fee.scheme;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Slf4j
@Service
@RequiredArgsConstructor
public class FixSchemeCalculation implements FeeCalculation{

    @Override
    public BigDecimal getCalculation(BigDecimal amount, BigDecimal value) {
        return null;
    }
}
