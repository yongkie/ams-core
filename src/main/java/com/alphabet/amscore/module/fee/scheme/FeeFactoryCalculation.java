package com.alphabet.amscore.module.fee.scheme;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class FeeFactoryCalculation {
    private final ApplicationContext applicationContext;

    public FeeCalculation getFeeCalculation(String scheme){
        return applicationContext.getBean(scheme, FeeCalculation.class);
    }
}
