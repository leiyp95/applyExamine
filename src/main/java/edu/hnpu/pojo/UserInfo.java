
package edu.hnpu.pojo;

/**
 * 
 * 用户实体
 * @author yanpeng
 * @version 2017年5月1日
 * @see UserInfo
 * @since
 */
public class UserInfo {
	//id
	private int userId;
	//用户名
	private String userName;
	//密码
	private String userPwd;
	//职位
	private String userRole;

	public int getUserId() {
	
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
	
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPwd() {
	
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserRole() {
	
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}
}

