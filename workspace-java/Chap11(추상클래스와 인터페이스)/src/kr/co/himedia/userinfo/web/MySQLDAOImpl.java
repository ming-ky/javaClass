package kr.co.himedia.userinfo.web;

import kr.co.himedia.utilitiesinterface.userinfo.UserInfoDTO;
import kr.co.himedia.utilitiesinterface.userinfo.dao.UserInfoDAO;

public class MySQLDAOImpl implements UserInfoDAO {

	@Override
	public void insertUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("insert into MySql DB userId = " + userInfoDTO.getUserId());

	}

	@Override
	public void updateUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("update into MySql DB userId = " + userInfoDTO.getUserId());

	}

	@Override
	public void deleteUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("delete into MySql DB userId = " + userInfoDTO.getUserId());

	}

	@Override
	public void selectUserInfo(UserInfoDTO userInfoDTO) {
		System.out.println("select into MySql DB userId = " + userInfoDTO.getUserId());

	}

}
