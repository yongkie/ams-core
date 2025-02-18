package com.alphabet.amscore.module.account.service;

import com.alphabet.amscore.module.account.model.AccountDto;
import com.alphabet.amsdocument.entity.Account;
import com.alphabet.amsdocument.repository.AccountRepository;
import com.alphabet.commons.enums.EResponseCode;
import com.alphabet.commons.module.response.base.BaseResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
    private final AccountRepository accountRepository;
    @Override
    public BaseResponse<AccountDto> createAccount(AccountDto accountDto) {
        var account = new Account();
        BeanUtils.copyProperties(accountDto, account);
        var accountSaved = accountRepository.save(account);
        BeanUtils.copyProperties(accountSaved, accountDto);
        return new BaseResponse<>(EResponseCode.SUCCESS, accountDto);
    }

    @Override
    public BaseResponse<AccountDto> updateAccount(AccountDto accountDto) {
        var account = accountRepository.findById(accountDto.getId()).orElseThrow(NullPointerException::new);
        BeanUtils.copyProperties(accountDto, account);
        var accountUpdated = accountRepository.save(account);
        BeanUtils.copyProperties(accountUpdated, accountDto);
        return new BaseResponse<>(EResponseCode.SUCCESS, accountDto);
    }

    @Override
    public BaseResponse<List<AccountDto>> listAccount() {
        var accountList = accountRepository.findAll();
        var accountDtos = new ArrayList<AccountDto>();
        accountList.forEach(account -> {
            var accountDto = new AccountDto();
            BeanUtils.copyProperties(account, accountDto);
            accountDtos.add(accountDto);
        });
        return new BaseResponse<>(EResponseCode.SUCCESS, accountDtos);
    }


}
