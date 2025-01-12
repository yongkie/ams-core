package com.alphabet.amscore.module.base.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class BaseDto {
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private String createBy;
    private String updateBy;
}
