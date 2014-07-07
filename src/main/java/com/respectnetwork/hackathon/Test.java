package com.respectnetwork.hackathon;

import xdi2.core.Graph;
import xdi2.core.impl.memory.MemoryGraphFactory;

public class Test {

	public static void main(String[] args) throws Exception {

		Graph graph = MemoryGraphFactory.getInstance().openGraph();
	}
}
