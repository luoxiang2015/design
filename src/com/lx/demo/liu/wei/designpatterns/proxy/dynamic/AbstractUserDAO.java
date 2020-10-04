//designpatterns.proxy.dynamic.AbstractUserDAO.java
package com.lx.demo.liu.wei.designpatterns.proxy.dynamic;

//抽象UserDAO：抽象主题角色
public interface AbstractUserDAO {
	public Boolean findUserById(String userId);
}
