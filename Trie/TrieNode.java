package Trie;

import java.util.HashMap;

public class TrieNode {
	
	boolean isTerminal;
	char data;
	HashMap<Character, TrieNode>children;
	public TrieNode(char character)
	{
		this.data=character;
		isTerminal=false;
		children=new HashMap<>();
	}
}
