package SelectionSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class testSelectionSort {

	@Test
	void testPositives() {
		//Arrange
		int testArray [] = {45, 13, 56, 75, 34, 23, 1, 67};
		int expectedOutput [] = {1,13,23,34,45,56,67,75};
		
		//act
		SelectionSort sorter = new SelectionSort();
		int resultArray [] = sorter.basicSelectionSort(testArray);
		
		//assert
		System.out.println("Positives Result: " + Arrays.toString(resultArray));
		assertArrayEquals(expectedOutput, resultArray);
		
	}

	@Test
	void testMixed() {
		//Arrange
		int testArray [] = {5, 7, 0, -2, 6, -8};
		int expectedOutput [] = {-8, -2, 0, 5, 6, 7};

		//act
		SelectionSort sorter = new SelectionSort();
		int resultArray [] = sorter.basicSelectionSort(testArray);

		System.out.println("Mixed Result: " + Arrays.toString(resultArray));
		assertArrayEquals(expectedOutput, resultArray);

	}

	
	@Test
	void testNegatives() {
		//Arrange
		int testArray [] = {-12, -4, -27, -5, -8, -9};
		int expectedOutput [] = {-27, -12, -9, -8, -5, -4};
	
		
		//act
		SelectionSort sorter = new SelectionSort();
		int resultArray [] = sorter.basicSelectionSort(testArray);
		
		//assert
		System.out.println("Negatives Result: " + Arrays.toString(resultArray));
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