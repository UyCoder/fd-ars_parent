package dev.ahmed.yygh.hosp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import dev.ahmed.yygh.model.hosp.HospitalSet;

/**
 * @Created: 4/8/2022 00:32
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public interface HospitalSetService extends IService<HospitalSet> {

    // 2. search hospital by hoscode then get sign
    String getSignKey(String hoscode);
}
