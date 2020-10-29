package com.sxxh.cdsp.service;

import com.sxxh.cdsp.po.CustomerDetail;
import com.sxxh.cdsp.vo.CustomerDetailQueryVo;

/**
  * 已完善客户详细信息查询——业务层接口
 * @author Administrator
 *
 */
public interface ICustomerDetailService {
	
	CustomerDetail getCustomerDetail(CustomerDetailQueryVo customerDetailQueryVo);

}
