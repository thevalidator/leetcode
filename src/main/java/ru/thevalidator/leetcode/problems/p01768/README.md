[1768. Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)

Easy


You are given two strings `word1` and `word2`. Merge the strings by adding letters in alternating order, starting with `word1`. If a string is longer than the other, append the additional letters onto the end of the merged string.

Return *the merged string.*

**Example 1:**

<pre><strong>Input:</strong> word1 = &#34;abc&#34;, word2 = &#34;pqr&#34;
<strong>Output:</strong> &#34;apbqcr&#34;
<strong>Explanation:</strong> The merged string will be merged as so:
word1:  a   b   c
word2:    p   q   r
merged: a p b q c r
</pre>

**Example 2:**

<pre><strong>Input:</strong> word1 = &#34;ab&#34;, word2 = &#34;pqrs&#34;
<strong>Output:</strong> &#34;apbqrs&#34;
<strong>Explanation:</strong> Notice that as word2 is longer, &#34;rs&#34; is appended to the end.
word1:  a   b 
word2:    p   q   r   s
merged: a p b q   r   s
</pre>

**Example 3:**

<pre><strong>Input:</strong> word1 = &#34;abcd&#34;, word2 = &#34;pq&#34;
<strong>Output:</strong> &#34;apbqcd&#34;
<strong>Explanation:</strong> Notice that as word1 is longer, &#34;cd&#34; is appended to the end.
word1:  a   b   c   d
word2:    p   q 
merged: a p b q c   d
</pre>

**Constraints:**

* `1 <= word1.length, word2.length <= 100`
* `word1` and `word2` consist of lowercase English letters.
