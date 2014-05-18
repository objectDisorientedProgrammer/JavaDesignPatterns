package com.doug.statepattern;

public class StatePatternDemo
{
	public static void main(String[] args)
	{
		// Create a context
		StateContext context = new StateContext(new TierOne());
		
		// Invoke operation
		context.runLifeCycle();
		context.runLifeCycle();
		context.runLifeCycle();
	}
}
