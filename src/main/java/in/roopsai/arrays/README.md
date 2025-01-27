# Arrays And Hashing

This package contains solutions to various array-related problems from LeetCode. Each problem is solved with a detailed explanation and efficient approach.

| Problem Name                | Link to LeetCode                                      | Description                                                                                        |
|-----------------------------|-------------------------------------------------------|----------------------------------------------------------------------------------------------------|
| Concatenation of Array      | [LeetCode 1929](https://leetcode.com/problems/concatenation-of-array/) | Create a result array, and copy elements from original into result two times in a single pass loop |
| Valid Anagram               | [LeetCode 242](https://leetcode.com/problems/valid-anagram/)           | Create a frequency array, For one string keep incrementing the frequency, for the other keep decrementing, if the resultant frequency is zero, then both strings are anagrams |
| Contains Duplicate          | [LeetCode 217](https://leetcode.com/problems/contains-duplicate/)      | Create a HashSet of seenNumbers, if a number is seen it means a duplicate, else simply add the number to the set. At the completion of loop return false |
| Two Sum                     | [LeetCode 1](https://leetcode.com/problems/two-sum/)                   | Create a map. In the single pass loop, initially calculate the complement and if the map contains the complement then return two indices of the pair. If not exists, then add the entry (key=number, value=index of the number in array) to the map |