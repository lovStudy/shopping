package com.cn.shop.util;

public class ThreadTest1 implements Runnable{

	@Override
	public void run() {
		System.out.println("线程名1:"+Thread.currentThread());
		
	}

}
