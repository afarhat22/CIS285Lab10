package SelectionSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class testSelectionSort {
	
	@Test
	void testMixed() {
		//Arrange
		int testArray [] = {5, 7, 0, -2, 6, -8};
		int expectedOutput [] = {-8, -2, 0, 5, 6, 7};
		
		//act
		SelectionSort sorter = new SelectionSort();
		int resultArray [] = sorter.basicSelectionSort(testArray);
		
		//assert
		System.out.println("Mixed Result: " + Arrays.toString(resultArray));
		assertArrayEquals(expectedOutput, resultArray);
		
	}
	
	@Test
	void testDuplicates() {
		//Arrange
		int testArray [] = {7, -4, 5, 7, 5, -2, 5};
		int expectedOutput [] = {-4, -2, 5, 5, 5, 7, 7};
		
		//act
		SelectionSort sorter = new SelectionSort();
		int resultArray [] = sorter.basicSelectionSort(testArray);
		
		//assert
		System.out.println("Duplicates Result: " + Arrays.toString(resultArray));
		assertArrayEquals(expectedOutput, resultArray);
		
	}
}