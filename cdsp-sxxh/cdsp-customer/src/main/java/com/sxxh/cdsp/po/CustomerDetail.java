package com.sxxh.cdsp.po;

import java.io.Serializable;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.Data;

/**
  * 已完善客户详细信息
 * @author Administrator
 *
 */
@Data
@JacksonXmlRootElement(localName = "CustomerDetail")
public class CustomerDetail implements Serializable {
	
	private static final long serialVersionUID = 3513338193193404173L;
	
	// 客户名称
	@JacksonXmlProperty(localName = "CUST_APLTN")
	private String custApltn;
	// 客户标签类型代码
	@JacksonXmlProperty(localName = "CUST_LBL_TYP_CD")
	private String custTypCd;
	// 贷款阶段名称
	@JacksonXmlProperty(localName = "LN_STG_APLTN")
	private String lnStgCd;
	// 联系号码
	@JacksonXmlProperty(localName = "TUCH_NBR")
	private String tuchPhnNbr;
	// 客户地址
	@JacksonXmlProperty(localName = "CUST_ADDR")
	private String custAddr;
	// 首次发生业务日期
	@JacksonXmlProperty(localName = "FSTM_HAPN_BIZ_DT")
	private String fstmHapnBizDt;
	// 客户生日日期
	@JacksonXmlProperty(localName = "BRTHDY_DT")
	private String brthdyDt;
	// 注册地址
	@JacksonXmlProperty(localName = "RGSTR_ADDR")
	private String rgstrAddr;
	// 注册资金
	@JacksonXmlProperty(localName = "IDSTR_CLSFC_CD")
	private String rgstrCaptl;
	// 行业类别代码
	@JacksonXmlProperty(localName = "CUST_MGR_NO")
	private String bltoNtecmIndsClsfCd; 
	// 注册日期
	@JacksonXmlProperty(localName = "RGSTR_DT")
	private String rgstrDt;
	// 服务客户经理姓名
	@JacksonXmlProperty(localName = "SERV_CSTMG_NM")
	private String servCstmgNm;

}
