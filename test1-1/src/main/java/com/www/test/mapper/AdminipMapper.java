package com.www.test.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.www.test.vo.AdminipVO;

//@Mapper("adminipMapper")
@Repository
@Mapper
public interface AdminipMapper {

	public List<AdminipVO> selectAdminipList(AdminipVO adminipVO) throws Exception;
	
	public List<AdminipVO> selectAdminipListCheck(AdminipVO adminipVO) throws Exception;
	
	public void insertAdminip(AdminipVO adminipVO) throws Exception;
	
	public void updateAdminip(AdminipVO adminipVO) throws Exception;
	
	public void updateAdminipAllState(AdminipVO adminipVO) throws Exception;
	
	public void deleteAdminip(AdminipVO adminipVO) throws Exception;
	
	public AdminipVO getAdminipAll(AdminipVO adminipVO) throws Exception;
}
