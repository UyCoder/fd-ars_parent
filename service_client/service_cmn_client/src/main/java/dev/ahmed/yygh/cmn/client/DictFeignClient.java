package dev.ahmed.yygh.cmn.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author Ahmed Bughra
 * @create 2022-08-24  10:38 AM
 */

@FeignClient("service-cmn")
@Repository
public interface DictFeignClient {

    // dictcode and value search
    @GetMapping("/admin/cmn/dict/getName/{dictCode}/{value}")
    public String getName(@PathVariable("dictCode") String dictCode,
                          @PathVariable("value") String value);

    // search with value
    @GetMapping("/admin/cmn/dict/getName/{value}")
    public String getName(@PathVariable("value") String value);

}