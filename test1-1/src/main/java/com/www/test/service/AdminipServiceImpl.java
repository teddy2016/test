package com.www.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.www.test.dao.AdminipDAO;
import com.www.test.vo.AdminipVO;

//public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService {
@Service("AdminipService")
public class AdminipServiceImpl implements AdminipService {
//public class BoardService extends EgovAbstractServiceImpl {

	//@Resource(name = "AdminipDAO")
	//private AdminipDAO adminipDAO;
	
	@Autowired
	AdminipDAO adminipDAO;
	
	//private static final Logger LOGGER = LoggerFactory.getLogger(BannerServiceImpl.class);
	@Override
	public List<AdminipVO> selectAdminipList(AdminipVO adminipVO) throws Exception {
		return adminipDAO.selectAdminipList(adminipVO);
	}
	
	/*
	List<AdminipVO> selectAdminipListCheck(AdminipVO adminipVO) throws Exception;

	void insertAdminip(AdminipVO adminipVO) throws Exception;

	void updateAdminip(AdminipVO adminipVO) throws Exception;

	void updateAdminipAllState(AdminipVO adminipVO) throws Exception;

	void deleteAdminip(AdminipVO adminipVO) throws Exception;
	*/
	
	public AdminipVO getAdminipAll(AdminipVO adminipVO) throws Exception {
		return adminipDAO.getAdminipAll(adminipVO);		
	}


}
