package com.sxxh.cdsp.service.impl;

import com.sxxh.cdsp.dao.CustomerDetailMapper;
import com.sxxh.cdsp.po.CustomerDetail;
import com.sxxh.cdsp.service.ICustomerDetailService;
import com.sxxh.cdsp.vo.CustomerDetailQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerDetailServiceImpl implements ICustomerDetailService {
	
	@Autowired
	private CustomerDetailMapper customerDetailMapper;

	@Override
	public CustomerDetail getCustomerDetail(CustomerDetailQueryVo customerDetailQueryVo) {
		//客户类型代码（01:个人  02:企业）
		String custTypCd = customerDetailQueryVo.getCustTypCd();
		String custNo = customerDetailQueryVo.getCustNo();
		String custMgrNo = customerDetailQueryVo.getCustMgrNo();
		System.out.println("客户类型代码：" + custTypCd + "\n" + "ecif客户编号：" + custNo + ",\n" + "服务客户经理编号：" + custMgrNo);
		CustomerDetail customerDetail = null;
		if(custTypCd.equals("01")) {
			System.out.println("查询个人客户详情");
			customerDetail = customerDetailMapper.getPersonalCustomerDetail(custNo, custMgrNo);
		}else {
			System.out.println("查询个人客户详情");
			customerDetail = customerDetailMapper.getEnterpriseCustomerDetail(custNo, custMgrNo);
		}
		System.out.println(customerDetail + " ， serviceImpl");
		return customerDetail;
	}

}
