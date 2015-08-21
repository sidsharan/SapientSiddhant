package com.sapient.nitro.ggn;

public class Airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Airport metropolisAirport = new Airport();
				Helicopter copter=new Helicopter();
				SeaPlane splane=new SeaPlane();
				
				metropolisAirport.givePermissionToLand(copter);
				metropolisAirport.givePermissionToLand(splane);
	}

	
	private void givePermissionToLand(Flyer f) {
		f.land();
		
	}
}
