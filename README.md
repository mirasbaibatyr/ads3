BAIBATYR MIRAS IT-2502
ASSIGMENT 3

Selection Sort: The algorithm iterates through the array, finds the smallest element, and swaps it with the first one. Then it looks for the second smallest and swaps it with the second, and so on. Complexity: O(n^2).
Pros: It performs the minimum number of swaps (memory writes), which is useful in specific hardware tasks where writing to memory is "expensive," though the code is generally slower than other algorithms.
Cons: Inefficient for large datasets due to its quadratic time complexity.

Merge Sort: The array is divided in half until only single elements remain, which are then merged back together in the correct order. Complexity: O(nlog n).
Pros: Stable complexity of O(nlog n) always, regardless of the input data (best, average, and worst cases are the same).
Cons: Requires additional memory (creates copies of arrays), which can be significant when dealing with very large volumes of data.

Binary Search: It works on the "divide and conquer" principle. You look at the middle element: if it is larger than the target, you discard the right half; if it is smaller, you discard the left half. Complexity: O(log n).
Pros: Incredibly fast even on millions of elements.
Cons: Strictly requires the array to be sorted beforehand.

Basic sort of 10 element:
<img width="304" height="48" alt="image" src="https://github.com/user-attachments/assets/bf57d019-acb9-4594-9ac0-7c40b57914ef" />

Basic sort of 100 element:
<img width="336" height="46" alt="image" src="https://github.com/user-attachments/assets/9d0f9b3d-771d-4dd9-a312-47694e10a0a3" />

Basic sort of 1000 element:
<img width="360" height="52" alt="image" src="https://github.com/user-attachments/assets/84692e55-f0bf-4ce6-b88d-b5d3f7c23c61" />

Advenced sort of 10 element:
<img width="360" height="50" alt="image" src="https://github.com/user-attachments/assets/4aa2876f-e403-4cea-ae07-d6903222e8bf" />

Advenced sort of 100 element:
<img width="317" height="38" alt="image" src="https://github.com/user-attachments/assets/33f7731d-f119-4e68-ba73-9a53755f4226" />

Advenced sort of 1000 element:
<img width="340" height="54" alt="image" src="https://github.com/user-attachments/assets/0b6d7a4e-11c6-49fd-a852-00cbe01eb08f" />

Binary search 10 element:
<img width="300" height="36" alt="image" src="https://github.com/user-attachments/assets/41f74305-9efa-4b86-acac-922e1d1867b6" />

Binary search 100 element:
<img width="300" height="39" alt="image" src="https://github.com/user-attachments/assets/646c08da-e764-462d-aae4-3da6aa9a3714" />

Binary search 1000 element:
<img width="333" height="24" alt="image" src="https://github.com/user-attachments/assets/51040d63-0074-4c5a-aece-760826543c77" />
