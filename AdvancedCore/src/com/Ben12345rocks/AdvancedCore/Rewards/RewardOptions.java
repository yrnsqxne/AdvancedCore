package com.Ben12345rocks.AdvancedCore.Rewards;

import java.util.HashMap;

public class RewardOptions {

	private boolean online = true;

	private boolean giveOffline = true;

	private boolean checkTimed = true;

	private boolean ignoreChance = false;

	private HashMap<String, String> placeholders = new HashMap<String, String>();

	private String prefix = "";
	private String suffix = "";

	/**
	 * @return the prefix
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * @param prefix
	 *            the prefix to set
	 */
	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	/**
	 * @return the suffix
	 */
	public String getSuffix() {
		return suffix;
	}

	/**
	 * @param suffix
	 *            the suffix to set
	 */
	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

	public RewardOptions() {
	}

	public HashMap<String, String> getPlaceholders() {
		return placeholders;
	}

	public boolean isCheckTimed() {
		return checkTimed;
	}

	public boolean isGiveOffline() {
		return giveOffline;
	}

	public boolean isIgnoreChance() {
		return ignoreChance;
	}

	public boolean isOnline() {
		return online;
	}

	public RewardOptions setCheckTimed(boolean checkTimed) {
		this.checkTimed = checkTimed;
		return this;
	}

	public RewardOptions setGiveOffline(boolean giveOffline) {
		this.giveOffline = giveOffline;
		return this;
	}

	public RewardOptions setIgnoreChance(boolean ignoreChance) {
		this.ignoreChance = ignoreChance;
		return this;
	}

	public RewardOptions setOnline(boolean online) {
		this.online = online;
		return this;
	}

	public RewardOptions setPlaceholders(HashMap<String, String> placeholders) {
		this.placeholders = placeholders;
		return this;
	}

}