package com.www.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.www.test.service.AdminipService;
import com.www.test.vo.AdminipVO;

@Controller
public class HomeController {
	
	//@Resource(name="adminipService")
	//private AdminipService adminipService;
	
	@Autowired
	AdminipService adminipService;
	
	/*
	@RequestMapping(value = "/index.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String homeIndex() throws Exception {
		return null;
	}
	*/
	
	@RequestMapping(value = "/main/index.do", method = {RequestMethod.GET, RequestMethod.POST})
	public String homeMainIndex(AdminipVO adminipVO) throws Exception {
		//AdminipVO adminipInfo = AdminipService.
		//List resultList = null;
		
		//resultList = new resultList();
		adminipVO.setAi_idx(1);
		List<AdminipVO> resultList = adminipService.selectAdminipList(adminipVO);
		//AdminipVO result = adminipService.getAdminipAll(adminipVO);

		if(resultList.size() > 0) {
		  for(int i=0; i < resultList.size(); i++) {
		    String ai_ip = resultList.get(i).getAi_ip();
		    System.out.println("ai_ip="+ ai_ip);
		  }
		}

		/*
		if(resultList != null) {
			System.out.println("aaa");
		} else {
			System.out.println("bbb");
		}
		*/

		System.out.println("hello22");
		return "/main/index";
	}

}
