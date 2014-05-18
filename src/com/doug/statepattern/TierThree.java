package com.doug.statepattern;

public class TierThree implements State
{
	@Override
	public void unlockTech(StateContext context)
	{
		System.out.println("Tier 3 technology unlocked!");
	}
}
