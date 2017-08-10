package com.vad.web;

import JMyron.JMyron;

public class Run extends JMyron{

	public static void main(String[] args) {
		setup();
	}
	
	static void setup(){
		JMyron m = new JMyron();
		System.out.println(m.version());
		}

}
