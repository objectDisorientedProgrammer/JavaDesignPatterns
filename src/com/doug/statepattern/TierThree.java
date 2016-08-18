package com.doug.statepattern;

public class TierThree implements State
{
	private boolean isFinalState = false;
	@Override
	public void unlockTech(StateContext context)
	{
		if(!isFinalState)
		{
			System.out.println("Tier 3 technology unlocked!");
			isFinalState = true;
		}
		else
			System.out.println("Already at Tier 3!");
	}
}
