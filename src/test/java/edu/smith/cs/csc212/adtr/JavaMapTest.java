package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.*;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaMap;

public class JavaMapTest {
	
	// you might want this.
	void assertIntEq(int x, int y) {
		assertEquals(x, y);
	}

	@Test
	public void testEmpty() {
		MapADT<String, Integer> empty = new JavaMap<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testPut() {
		MapADT<String, String> empty = new JavaMap<>();
		empty.put("item", "price");
//		We put 1 k,v pair into our map and test to see if the size is 1.
		assertEquals(empty.size(), 1);
	}

	
	@Test
	public void testGet() {
		MapADT<String, String> itemList = new JavaMap<>();
		itemList.put("one", "1");
		itemList.put("two", "2");
		itemList.put("three", "3");
		assertEquals("2", itemList.get("two"));	
	}
	
	@Test
	public void testRemove() {
		MapADT<String, String> itemList2 = new JavaMap<>();
		itemList2.put("sword", "weapon");
		itemList2.put("stick", "weapon");
		itemList2.put("orange", "food");
		itemList2.put("apple", "food");
		itemList2.remove("apple");
		itemList2.remove("orange");
		assertEquals(itemList2.size(), 2);
//		I had to fix object.remove(keyType) because it was this.remove instead of this.data.remove.
	}
	
	@Test
	public void testGetKeys() {
		MapADT<String, String> itemList3 = new JavaMap<>();
		itemList3.put("kiwi", "fruit");
		itemList3.put("banana", "fruit");
		itemList3.put("berries", "fruit");
//		comparing size of map to the converted map of pair size. Both are 3 (3 pairs of 2).
		assertEquals(itemList3.size(), itemList3.getKeys().size());
	}
	
	
	
	@Test
	public void testGetEntries() {
		MapADT<String, String> itemList4 = new JavaMap<>();
		itemList4.put("apple", "fruit");
		itemList4.put("orange", "fruit");
		itemList4.put("pear", "fruit");
//		Comparing size of map to the converted map of pair size. Both are 3 (3 pairs of 2).
		assertEquals(itemList4.size(), itemList4.getEntries().size());
	}
	
	
	@Test
	public void testConvertToJavaListObject() {
		MapADT<String, String> itemList5 = new JavaMap<>();
		itemList5.put("watermelon", "fruit");
		itemList5.put("grape", "fruit");
		itemList5.put("grapefruit", "fruit");
//		Comparing sizes again.
		assertEquals(itemList5.size(), itemList5.toJava().size());
		
	}
	
}
