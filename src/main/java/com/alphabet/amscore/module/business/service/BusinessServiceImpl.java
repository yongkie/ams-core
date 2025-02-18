package com.alphabet.amscore.module.business.service;

import com.alphabet.amscore.module.business.model.BusinessDto;
import com.alphabet.amsdocument.entity.Business;
import com.alphabet.amsdocument.repository.BusinessRepository;
import com.alphabet.commons.enums.EResponseCode;
import com.alphabet.commons.module.response.base.BaseResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class BusinessServiceImpl implements BusinessService {
    private final BusinessRepository businessRepository;


    @Override
    public BaseResponse<BusinessDto> createBusiness(BusinessDto businessDto) {
        var business = new Business();
        BeanUtils.copyProperties(businessDto, business);
        var businessSaved = businessRepository.save(business);
        BeanUtils.copyProperties(businessSaved, businessDto);
        return new BaseResponse<>(EResponseCode.SUCCESS, businessDto);
    }

    @Override
    public BaseResponse<BusinessDto> updateBusiness(BusinessDto businessDto) {
        var business = businessRepository.findById(businessDto.getId()).orElseThrow(NullPointerException::new);
        BeanUtils.copyProperties(businessDto, business);
        var businessSaved = businessRepository.save(business);
        BeanUtils.copyProperties(businessSaved, businessDto);
        return new BaseResponse<>(EResponseCode.SUCCESS, businessDto);
    }

    @Override
    public BaseResponse<BusinessDto> getAllBusiness() {
        return null;
    }
}
