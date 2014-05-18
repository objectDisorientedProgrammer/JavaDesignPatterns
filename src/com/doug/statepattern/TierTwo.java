package com.doug.statepattern;

public class TierTwo implements State
{
	@Override
	public void unlockTech(StateContext context)
	{
		System.out.println("Tier 2 technology unlocked!");
		context.setState(new TierThree());
	}
}
