package com.cn.shop.util;

public class ThreadTest2 implements Runnable{

	@Override
	public void run() {
		System.err.println("线程名2:"+Thread.currentThread());
		
	}

}
