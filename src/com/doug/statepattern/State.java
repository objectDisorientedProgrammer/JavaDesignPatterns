package com.doug.statepattern;

public interface State
{
	/**
	 * Method to unlock a technology.
	 * @param context - current state context
	 */
	public void unlockTech(StateContext context);
}
