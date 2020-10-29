package com.sxxh.cdsp.controller;



import com.sxxh.cdsp.po.CustomerDetail;
import com.sxxh.cdsp.service.ICustomerDetailService;
import com.sxxh.cdsp.vo.CustomerDetailQueryVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class CustomerDetailController {

    @Autowired
    private ICustomerDetailService customerDetailService;

    @PostMapping(value="/queryCompleteDetail",produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public CustomerDetail queryCompleteDetail(@RequestBody CustomerDetailQueryVo customerDetailQueryVo) {
        System.out.println(customerDetailQueryVo);
        CustomerDetail customerDetail = customerDetailService.getCustomerDetail(customerDetailQueryVo);
//		CustomerDetail customerDetail = new CustomerDetail();
//		customerDetail.setCustApltn("客户名称1");
//		customerDetail.setCustTypCd("客户标签类型代码-01农户");
//		customerDetail.setLnStgCd("贷款阶段名称01");
//		customerDetail.setTuchPhnNbr("123456");
//		customerDetail.setCustAddr("客户地址01");
//		customerDetail.setFstmHapnBizDt("首次发生业务日期01");
//		customerDetail.setBrthdyDt("2020-10-29");
//		customerDetail.setRgstrCaptl("注册资金01");
//		customerDetail.setBltoNtecmIndsClsfCd("行业类别代码001");
//		customerDetail.setRgstrDt("注册日期01");
//		customerDetail.setServCstmgNm("服务客户经理姓名01");
        System.out.println(customerDetail + " ， controller");
        return customerDetail;
    }

}
