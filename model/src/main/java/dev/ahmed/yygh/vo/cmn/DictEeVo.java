package dev.ahmed.yygh.vo.cmn;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;
import lombok.Data;

/**
 * <p>
 * Dict
 * </p>
 *
 * @author qy
 */
@Data
public class DictEeVo {

	@ExcelProperty(value = "id" ,index = 0)
	private Long id;

	@ExcelProperty(value = "parentId" ,index = 1)
	private Long parentId;

	@ExcelProperty(value = "name" ,index = 2)
	private String name;

	@ExcelProperty(value = "value" ,index = 3)
	private String value;

	@ExcelProperty(value = "dictCode" ,index = 4)
	private String dictCode;

}

