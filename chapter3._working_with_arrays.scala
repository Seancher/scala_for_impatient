/*
Excercises
1. Write a code snippet that sets a to an array of n random integers between 0 (inclusive) and n
(exclusive). 
*/

val n = 5
val arr = (for (i <- 0 until n)
	yield scala.util.Random.nextInt(n))
	.toArray[Int]

/*
2. Write a loop that swaps adjacent elements of an array of integers. For example, Array(1,
2, 3, 4, 5) becomes Array(2, 1, 4, 3, 5).
*/

val arr = Array(1, 2, 3, 4, 5)
for (i <- 1 until arr.length by 2) {
val tmp = arr(i + 1) 
arr(i + 1) = arr(i)
arr(i) = tmp
}

/*
3. Repeat the preceding assignment, but produce a new array with the swapped values. Use
for/yield.
*/

val arr = Array(1, 2, 3, 4, 5)
for (i <- arr.indices) yield (if (i % 2 == 0) arr(i + 1) else arr(i - 1))

/*
4. Given an array of integers, produce a new array that contains all positive values of the original
array, in their original order, followed by all values that are zero or negative, in their original
order.
*/
val arr = Array(1, -1, 0, 2, -2, 0, -3, 3, 0)
arr.filter(_ > 0).union(arr.filter(_ <= 0))

/*
5. How do you compute the average of an Array[Double]?
*/

var arr = Array(1.0, 2.0, 3.1, 5.9, 1.4)
// option 1
arr.reduce(_ + _) / arr.length
// option 2
arr.sum / arr.length

/*
6. How do you rearrange the elements of an Array[Int] so that they appear in reverse sorted
order? How do you do the same with an ArrayBuffer[Int]?
*/

val arr = Array(1, 2, 3, -1, 0, -2, 0, -3, 0)
val arrb = ArrayBuffer(1, 2, 3, -1, 0, -2, 0, -3, 0)

arr.sorted.reverse
arrb.sorted.reverse
