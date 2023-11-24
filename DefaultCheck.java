package com.test.intv;

public interface DefaultCheck {
	
	double getSpeed();
	
	
	default String turnAlarmOn() {
        return "Turning the alarm on.";
    }
    

}
