package dev.ahmed.yygh.cmn.service;

import com.baomidou.mybatisplus.extension.service.IService;
import dev.ahmed.yygh.cmn.controller.DictController;
import dev.ahmed.yygh.cmn.mapper.DictMapper;
import dev.ahmed.yygh.model.cmn.Dict;
import dev.ahmed.yygh.model.hosp.HospitalSet;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

/**
 * @Created: 4/8/2022 00:32
 * @Email: AhmedBughra@gmail.com
 * @CreatedWith: IntelliJ IDEA
 */
public interface DictService extends IService<Dict> {
    List<Dict> findChildData(Long id);

     // export dict data
     void exportDictData(HttpServletResponse response);

     // import dict data
     void importDictData(MultipartFile file);

    String getDictName(String dictCode, String value);

    //get child data with dictCode
    List<Dict> findByDictCode(String dictCode);
}

