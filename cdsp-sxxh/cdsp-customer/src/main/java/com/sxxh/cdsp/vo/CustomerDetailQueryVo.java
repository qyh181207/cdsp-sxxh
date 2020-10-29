package com.sxxh.cdsp.vo;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "CustomerDetailQueryVo")
public class CustomerDetailQueryVo {
	
	//客户经理编号
	@JacksonXmlProperty(localName = "CUST_MGR_NO")
	private String custMgrNo;
	//ecif客户编号
	@JacksonXmlProperty(localName = "ECIF_CUST_NO")
	private String custNo;
	//客户类型代码
	@JacksonXmlProperty(localName = "CUST_TYP_CD")
	private String custTypCd;

}
