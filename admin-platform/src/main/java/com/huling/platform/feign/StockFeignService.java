package com.huling.platform.feign;


import com.huling.platform.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-service",path = "/stock",configuration = FeignConfig.class)
public interface StockFeignService {
    //声明需要调用rest接口对应的方法
    @RequestMapping("/reduct")
    public String reduct();
}
