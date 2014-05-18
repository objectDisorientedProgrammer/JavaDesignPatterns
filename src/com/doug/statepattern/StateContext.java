package com.doug.statepattern;

public class StateContext
{
	State state = null;
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
