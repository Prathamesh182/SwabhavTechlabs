package com.aurionpro.model;

public class Player {
	private String name;
	private int age;
	private String country;

	public Player(String name, int age, String country) {
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

//	public int ElderPlayer(Player[] players) {
//		int max = players[0].getAge();
//		int i, index = 0;
//		for (i = 0; i < players.length; i++) {
//			if (max < (players[i].getAge())) {
//				max = players[i].getAge();
//				index = i;
//			}
//
//		}
//		return index;
//	}
	public Player ElderPlayer(Player[] players) {
		int max = players[0].getAge();
		int i, index = 0;
		for (i = 0; i < players.length; i++) {
			if (max < (players[i].getAge())) {
				max = players[i].getAge();
				index = i;
			}

		}
		return players[index];
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", age=" + age + ", country=" + country + "]";
	}
}
