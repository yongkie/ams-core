package com.alphabet.amscore.module.account.service;

import com.alphabet.amscore.module.account.model.AccountDto;
import com.alphabet.amsdocument.entity.Account;
import com.alphabet.commons.module.response.base.BaseResponse;

import java.util.List;

public interface AccountService {
    public BaseResponse<AccountDto> createAccount(AccountDto accountDto);

    public BaseResponse<AccountDto> updateAccount(AccountDto accountDto);

    public BaseResponse<List<AccountDto>> listAccount();
}
