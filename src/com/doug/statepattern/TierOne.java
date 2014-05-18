package com.doug.statepattern;

public class TierOne implements State
{
	@Override
	public void unlockTech(StateContext context)
	{
		System.out.println("Tier 1 technology unlocked!");
		context.setState(new TierTwo());
	}
}
