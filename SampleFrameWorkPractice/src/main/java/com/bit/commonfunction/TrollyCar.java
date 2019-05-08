package com.bit.commonfunction;

import com.bit.bean.Bean;

public abstract class TrollyCar implements SUVCar{

	public void move() {
		// TODO Auto-generated method stub
		System.out.println("200");
	}

	public abstract void openDoor() ;
	
	protected TrollyCar()
	{
		
	}
}
