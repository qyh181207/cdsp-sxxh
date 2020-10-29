package com.sxxh.cdsp.dao;

import com.sxxh.cdsp.po.CustomerDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
  * 已完善客户详细信息查询——持久层接口
 * @author Administrator
 *
 */
@Mapper
public interface CustomerDetailMapper {
	
	//查询个人客户详细信息
	CustomerDetail getPersonalCustomerDetail(@Param("ecifCustNo") String ecifCustNo, @Param("servCstMGNo") String servCstMGNo);
	
	//查询企业客户详细信息
	CustomerDetail getEnterpriseCustomerDetail(@Param("ecifCustNo") String ecifCustNo,@Param("servCstMGNo") String servCstMGNo);

}
