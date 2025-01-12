package com.alphabet.amscore.module.business.model;

import com.alphabet.amscore.module.base.dto.BaseDto;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
@Builder
public class BusinessDto extends BaseDto {
    private UUID id;
    private String businessId;
    private String name;
}
