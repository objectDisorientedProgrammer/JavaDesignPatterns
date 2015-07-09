package com.doug.statepattern;

public class StateContext
{
	State state = null;
	
	/**
	 * Default constructor initializes to Tier One.
	 * @param s
	 */
	public StateContext(State s)
	{
		this.setState(new TierOne());
	}
	
	public void setState(State s)
	{
		this.state = s;
	}
	
	public void runLifeCycle()
	{
		state.unlockTech(this);
	}
}
