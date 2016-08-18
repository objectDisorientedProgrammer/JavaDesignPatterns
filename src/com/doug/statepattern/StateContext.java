package com.doug.statepattern;

public class StateContext
{
	State state = null;
	
	/**
	 * Default constructor initializes to Tier One.
	 */
	public StateContext()
	{
		this.setState(new TierOne());
	}
	
	/**
	 * Default constructor initializes to s.
	 * @param s - state to start at
	 */
	public StateContext(State s)
	{
		this.setState(s);
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
