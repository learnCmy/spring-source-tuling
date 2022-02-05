package com.tuling.iocbeanlifecicle;

import org.springframework.stereotype.Component;

/**
 * Created by xsls on 2019/8/15.
 */
@Component
//public  class Car  implements FactoryBean<Tank> {
	public  class Car  {

	private String name;

	private Tank tank;

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	public Tank getTank() {
		return tank;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public Car() {
		System.out.println("car加载....");
	}

	public Car(String name) {
		this.name = name;
	}


//	@Override
//	public Tank getObject() throws Exception {
//		return new Tank();
//	}
//
//	@Override
//	public Class<?> getObjectType() {
//		return Tank.class;
//	}
}
