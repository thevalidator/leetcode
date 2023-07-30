[1071. Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/)

Easy


For two strings `s` and `t`, we say "`t` divides `s`" if and only if `s = t + ... + t` (i.e., `t` is concatenated with itself one or more times).

Given two strings `str1` and `str2`, return *the largest string *`x`* such that *`x`* divides both *`str1`* and *`str2`.

**Example 1:**

<pre><strong>Input:</strong> str1 = &#34;ABCABC&#34;, str2 = &#34;ABC&#34;
<strong>Output:</strong> &#34;ABC&#34;
</pre>

**Example 2:**

<pre><strong>Input:</strong> str1 = &#34;ABABAB&#34;, str2 = &#34;ABAB&#34;
<strong>Output:</strong> &#34;AB&#34;
</pre>

**Example 3:**

<pre><strong>Input:</strong> str1 = &#34;LEET&#34;, str2 = &#34;CODE&#34;
<strong>Output:</strong> &#34;&#34;
</pre>

**Constraints:**

* `1 <= str1.length, str2.length <= 1000`
* `str1` and `str2` consist of English uppercase letters.

