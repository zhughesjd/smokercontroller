package net.joshuahughes.cookcontrol.fan;


public class SimulatedFan implements Fan{

	@Override
	public float getRPM(float speed) {
		return 2*speed;
	}
}