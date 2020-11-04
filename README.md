# leetCode
# 一 简单
### 1、 [删除排序数组中的重复项](https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/)
* 问题描述:给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。

* 题解 [RemoveDuplicates.java](./src/main/java/com/vincent/leetcode/simple/RemoveDuplicates.java)

### 2、[移除元素](https://leetcode-cn.com/problems/remove-element/)
* 问题描述:给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素，并返回移除后数组的新长度。
不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。

* 题解 [RemoveElement.java](./src/main/java/com/vincent/leetcode/simple/RemoveElement.java)

### 3、[实现 strStr()](https://leetcode-cn.com/problems/implement-strstr/)  
* 问题描述:给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。

* 题解 [StrStr.java](./src/main/java/com/vincent/leetcode/simple/StrStr.java)

### 4、[搜索插入位置](https://leetcode-cn.com/problems/search-insert-position/)
* 问题描述:给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。

* 题解 [SearchInsert.java](./src/main/java/com/vincent/leetcode/simple/SearchInsert.java)

### 5、[外观数列](https://leetcode-cn.com/problems/count-and-say/)
* 问题描述:给定一个正整数 n ，输出外观数列的第 n 项。
       
       「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
       
       你可以将其视作是由递归公式定义的数字字符串序列：
       
       countAndSay(1) = "1"
       countAndSay(n) 是对 countAndSay(n-1) 的描述，然后转换成另一个数字字符串。
       前五项如下:
       1.     1
       2.     11
       3.     21
       4.     1211
       5.     111221
       第一项是数字 1 
       描述前一项，这个数是 1 即 “ 一 个 1 ”，记作 "11"
       描述前一项，这个数是 11 即 “ 二 个 1 ” ，记作 "21"
       描述前一项，这个数是 21 即 “ 一 个 2 + 一 个 1 ” ，记作 "1211"
       描述前一项，这个数是 1211 即 “ 一 个 1 + 一 个 2 + 二 个 1 ” ，记作 "111221"
       
* 题解 [CountAndSay.java](./src/main/java/com/vincent/leetcode/simple/CountAndSay.java)

### 6、[最后一个单词的长度](https://leetcode-cn.com/problems/length-of-last-word/)
 * 问题描述:给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
        如果不存在最后一个单词，请返回 0 。
        说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
       
        示例:
        
        输入: "Hello World"
        输出: 5
      
 * 思路，从后向前遍历
 * 题解 [LengthOfLastWord.java](./src/main/java/com/vincent/leetcode/simple/LengthOfLastWord.java)


# 二 中等
### 1、[无重复字符的最长子串](https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/)
* 题目描述:给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

* 题解 [LengthOfLongestSubstring.java](./src/main/java/com/vincent/leetcode/medium/LengthOfLongestSubstring.java)

### 2、[二叉搜索树中的插入操作](https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/)
* 题目描述:给定二叉搜索树（BST）的根节点和要插入树中的值，将值插入二叉搜索树。 返回插入后二叉搜索树的根节点。 输入数据保证，新值和原始二叉搜索树中的任意节点值都不同。
* 思路:比较当前节点和target的大小，选择左右哪个节点
* 题解 [InsertIntoBST.java](./src/main/java/com/vincent/leetcode/medium/InsertIntoBST.java)
 
# 三 困难
