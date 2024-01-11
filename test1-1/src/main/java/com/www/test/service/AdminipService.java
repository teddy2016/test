package com.www.test.service;

import java.util.List;

import com.www.test.vo.AdminipVO;

//public class BoardServiceImpl extends EgovAbstractServiceImpl implements BoardService {
public interface AdminipService {
//public class BoardService extends EgovAbstractServiceImpl {

	//private static final Logger LOGGER = LoggerFactory.getLogger(AdminipServiceImpl.class);
	List<AdminipVO> selectAdminipList(AdminipVO adminipVO) throws Exception;
	
	/*
	List<AdminipVO> selectAdminipListCheck(AdminipVO adminipVO);

	void insertAdminip(AdminipVO adminipVO);

	void updateAdminip(AdminipVO adminipVO);

	void updateAdminipAllState(AdminipVO adminipVO);

	void deleteAdminip(AdminipVO adminipVO);
	*/
	
	AdminipVO getAdminipAll(AdminipVO adminipVO) throws Exception;


}
