package com.Ben12345rocks.AdvancedCore.Util.PluginMessage;

import java.util.ArrayList;

public abstract class PluginMessageHandler {

	private String subChannel;

	public PluginMessageHandler(String subChannel) {
		this.subChannel = subChannel;
	}

	/**
	 * @return the subChannel
	 */
	public String getSubChannel() {
		return subChannel;
	}

	public abstract void onRecieve(String subChannel, ArrayList<String> messageData);

}
