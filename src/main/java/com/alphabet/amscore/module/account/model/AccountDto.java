package com.alphabet.amscore.module.account.model;

import com.alphabet.amscore.module.base.dto.BaseDto;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Setter
@Getter
public class AccountDto extends BaseDto {
    private UUID id;
    private String accountId;
    private String accountName;
    private String accountMail;
}
