package com.www.test.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.www.test.mapper.AdminipMapper;
import com.www.test.vo.AdminipVO;

@Repository("adminipDAO")
//public class AdminipDAO extends EgovAbstractMapper {
public class AdminipDAO {

	//@Resource(name="adminipMapper") 
	//private AdminipMapper adminip;
	@Autowired
	AdminipMapper adminip;	
	
	public List<AdminipVO> selectAdminipList(AdminipVO adminipVO) throws Exception {
		//System.out.println("selectBannerList() 기능 처리");
		return adminip.selectAdminipList(adminipVO);
	}
	
	public List<AdminipVO> selectAdminipListCheck(AdminipVO adminipVO) throws Exception {
		//System.out.println("selectBannerList() 기능 처리");
		return adminip.selectAdminipListCheck(adminipVO);
	}

	public void insertAdminip(AdminipVO adminipVO) throws Exception {
		//System.out.println("inserSample() 기능 처리");
		adminip.insertAdminip(adminipVO);
	}
	
	public void updateAdminip(AdminipVO adminipVO) throws Exception {
		//System.out.println("updateSample() 기능 처리");
		adminip.updateAdminip(adminipVO);
	}
	
	public void updateAdminipAllState(AdminipVO adminipVO) throws Exception {
		//System.out.println("updateSample() 기능 처리");
		adminip.updateAdminipAllState(adminipVO);
	}
	
	public void deleteAdminip(AdminipVO adminipVO) throws Exception {
		//System.out.println("deleteSample() 기능 처리");
		adminip.deleteAdminip(adminipVO);
	}
	
	public AdminipVO getAdminipAll(AdminipVO adminipVO) throws Exception {
		//System.out.println("selectBanner() 기능 처리");
		return (AdminipVO) adminip.getAdminipAll(adminipVO);
	}
	
}
