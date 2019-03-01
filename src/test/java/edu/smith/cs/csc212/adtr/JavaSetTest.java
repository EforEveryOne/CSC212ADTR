package edu.smith.cs.csc212.adtr;

import static org.junit.Assert.assertEquals;

import java.awt.List;
import java.util.Arrays;

import org.hamcrest.core.IsInstanceOf;
import org.junit.Assert;
import org.junit.Test;

import edu.smith.cs.csc212.adtr.real.JavaSet;

public class JavaSetTest {
	
	@Test
	public void testEmpty() {
		SetADT<String> empty = new JavaSet<>();
		assertEquals(empty.size(), 0);
	}
	
	@Test
	public void testSizeNonzero() {
		SetADT<String> abc = new JavaSet<>();
		abc.insert("A");
		abc.insert("B");
		abc.insert("C");
		abc.insert("D");
//		Test to see if size of our set is equal to 4.
		assertEquals(abc.size(), 4);
	}
	
	@Test
	public void testInsertDuplicate() {
		SetADT<String> aaa = new JavaSet<>();
//		We put in duplicate values, and since a set can't have
//		repeating values, we expect the size to remain 1.
//		So we put 3 of the same thing in, but it will still only be the size 1.
//		Sets are unordered and cannot have duplicates.
		aaa.insert("Aa");
		aaa.insert("Aa");
		aaa.insert("Aa");
//		Test to see we only have the single same value in our set.
		assertEquals(aaa.size(), 1);
	}
	
	@Test
	public void testContains() {
		SetADT<String> bbb = new JavaSet<>();
		bbb.insert("abc");
		bbb.insert("def");
		bbb.insert("ghi");
//		Simply boolean checking to see if the contents are there.
		assertEquals(true, bbb.contains("abc"));
		assertEquals(true, bbb.contains("def"));
		assertEquals(true, bbb.contains("ghi"));
	}
	
	@Test
	public void testRemove() {
		SetADT<String> ccc = new JavaSet<>();
		ccc.insert("A");
		ccc.insert("B");
		ccc.insert("C");
		ccc.insert("Z");
		ccc.remove("Z");
//		Even though we put 4 things in the set, we removed one.
//		Because size 3 is true, we see that our removal "Z" worked.
		assertEquals(ccc.size(), 3);
	}
	
	
	@Test
	public void testConvertSetToList() {
		SetADT<String> eee = new JavaSet<>();
		eee.insert("Aa");
		eee.insert("Bb");
//		Comparing sizes.
		assertEquals(eee.size(), eee.toJava().size());
	}
	
	@Test
	public void testConvertSetToJava() {
		SetADT<String> rrr = new JavaSet<>();
		rrr.insert("Cc");
		rrr.insert("Ee");
//		Comparing sizes.
		assertEquals(rrr.size(), rrr.toJava().size());
	}
}
