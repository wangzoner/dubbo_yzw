package cn.creditease.service;


import java.util.List;

import cn.creditease.dto.UserDTO;
import cn.creditease.listener.CallBackListener;

public interface UserService {
	
	public UserDTO get(Integer id);
	
	public int save(UserDTO user);
	
	
	/**
	 * 此接口为了方便演示负载均衡设计
	 * @return
	 */
	public String loadbalance();
	/**
	 * 为了演示参数回调
	 * @param listener
	 * @param list
	 * @throws Exception
	 */
	public void batchAddUsers(CallBackListener listener, List<UserDTO> list) throws Exception;
}
