package Trie;

public class TrieUse {
	
	TrieNode root=new TrieNode('\0');
	int size;
	
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	
	private static boolean addElement(TrieNode node,String word)
	{
		if(word.length()==0)
		{
			if(node.isTerminal)
			{
				return false;
			}
			node.isTerminal=true;
			return true;
		}
		char firstLetter=word.charAt(0);
		TrieNode child=node.children.get(firstLetter);
		if(child==null)
		{
			// char not present in the trie INSERT it
			child=new TrieNode(firstLetter);
			node.children.put(firstLetter, child);
			return addElement(child,word.substring(1));

		}
		//char present in trie
		return addElement(node.children.get(firstLetter), word.substring(1));
		
		
	}
	
	public boolean addElement(String word)
	{
		boolean result=addElement(root,word);
		if(result)
		{
			size++;
		}
		return result;
	}
	
	private static boolean containsWord(TrieNode node,String word)
	{
		if(word.length()==0)
		{
			return node.isTerminal;
		}
		char firstChar=word.charAt(0);
		if(node.children.get(firstChar)!=null)
		{
			return containsWord(node.children.get(firstChar), word.substring(1));
		}
		return false;
	}
	
	public boolean containsWord(String word)
	{
		return containsWord(root,word);
	}
	private static boolean removeWord(TrieNode node,String word)
	{
		if(word.length()==0)
		{
			if(node.isTerminal)
			{
				node.isTerminal=false;
				return true;
			}
			return false;
		}
		char firstChar=word.charAt(0);
		if(node.children.get(firstChar)==null)
		{
			return false;
		}
		return removeWord(node.children.get(firstChar),word.substring(1));
		
	}
	public boolean removeWord(String word)
	{
		boolean result=removeWord(root,word);
		if(result)
		{
			size--;
			return result;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test add fn
		TrieUse trie=new TrieUse();
		System.out.println(trie.addElement("abc"));
		//System.out.println(trie.getSize());
		//System.out.println(trie.addElement("ab"));
		System.out.println(trie.addElement("ab"));
		//System.out.println(trie.containsWord("abcd"));
		//System.out.println(trie.containsWord("abc"));
		System.out.println(trie.getSize());
		System.out.println(trie.removeWord("ab"));
		System.out.println(trie.getSize());
		System.out.println(trie.removeWord("abc"));
		System.out.println(trie.getSize());
		System.out.println(trie.removeWord("abcd"));
		System.out.println(trie.getSize());

	}

}
