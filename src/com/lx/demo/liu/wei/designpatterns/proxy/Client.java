//designpatterns.proxy.Client.java
package com.lx.demo.liu.wei.designpatterns.proxy;

public class Client {
	public static void main(String args[]) {
		Searcher searcher;  //��Գ����̣��ͻ�������ֱ���ʵ������ʹ�����
		searcher = (Searcher)XMLUtil.getBean();
		String result = searcher.doSearch("���","��Ů�ľ�");
	}
}
