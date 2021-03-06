package com.example.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description：
 *
 * @author fangliangsheng
 * @date 2019-04-04
 */
@FeignClient(name = "order-service", url = "127.0.0.1:8082")
public interface OrderFeignClient {

    @GetMapping("/create")
    void create(@RequestParam String userId, @RequestParam String commodityCode,@RequestParam Integer count);

}
