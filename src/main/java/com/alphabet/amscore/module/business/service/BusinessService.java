package com.alphabet.amscore.module.business.service;

import com.alphabet.amscore.module.business.model.BusinessDto;
import com.alphabet.commons.module.response.base.BaseResponse;

public interface BusinessService {
    public BaseResponse<BusinessDto> createBusiness(BusinessDto businessDto);
    public BaseResponse<BusinessDto> updateBusiness(BusinessDto businessDto);
    public BaseResponse<BusinessDto> getAllBusiness();
}
