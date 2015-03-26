package com.djy.foo.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.djy.foo.FooBar;

public class FooBarTest {

	@Test
	public void testFooBarSetTest1() {
		FooBar fooBar = new FooBar();

		assertNotNull(fooBar);

		fooBar.setTest1("test");

		assertNotNull(fooBar.getTest1());
	}

}
