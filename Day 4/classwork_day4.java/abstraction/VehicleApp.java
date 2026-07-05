package com.coforge.day4.abstraction;

public class VehicleApp {

	public static void main(String[] args) {
		/*
		Bike TVS = new Bike();
		TVS.typeOfEngine();
		TVS.noOfwheels();
		TVS.brandName();
		Scooty HONDA = new Scooty();
		HONDA.typeOfEngine();
		HONDA.noOfwheels();
		HONDA.brandname();
		*/
		VehiclePlan vehicle;
		
		vehicle = new Bike();
		vehicle.noOfwheels();
		vehicle.typeOfEngine();
		vehicle.brandName();
		
		vehicle = new Scooty();
		vehicle.noOfwheels();
		vehicle.typeOfEngine();
		vehicle.brandName();
		
	}

}
