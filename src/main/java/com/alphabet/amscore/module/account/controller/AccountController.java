package com.alphabet.amscore.module.account.controller;

import com.alphabet.amscore.module.account.model.AccountDto;
import com.alphabet.amscore.module.account.service.AccountService;
import com.alphabet.amsdocument.entity.Account;
import com.alphabet.commons.module.response.base.BaseResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController("/account")
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @PostMapping("/create")
    public BaseResponse<AccountDto> create(@RequestBody @Validated AccountDto accountDto){
        return accountService.createAccount(accountDto);
    }

    @PostMapping("/update")
    public BaseResponse<AccountDto> update(@RequestBody @Validated AccountDto accountDto){
        return accountService.updateAccount(accountDto);
    }

    @GetMapping("/all")
    public BaseResponse<List<AccountDto>> getAllAccount(@RequestBody @Validated AccountDto accountDto){
        return accountService.listAccount();
    }
}
