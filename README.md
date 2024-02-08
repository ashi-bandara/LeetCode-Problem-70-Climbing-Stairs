
# LeetCode Challenge D48
## Achievements
[![image.png](https://i.postimg.cc/3NSzzcsy/image.png)](https://postimg.cc/WqZ9kXbj)

This solution outperformed 100% of Java users on LeetCode according to runtime metrics.


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

You are climbing a staircase. It takes  `n`  steps to reach the top.

Each time you can either climb  `1`  or  `2`  steps. In how many distinct ways can you climb to the top?

**Example**
>**Input:** n = 2
>
>**Output:** 2
>
>**Explanation:** There are two ways to climb to the top.
>1. 1 step + 1 step
>2. 2 steps

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
The method `climbStairs` takes an integer `n` representing the number of steps in the staircase. It employs a `switch` statement to handle base cases: if `n` is 0, 1, or 2, it directly returns the corresponding values 0, 1, or 2, respectively. For larger `n`, it constructs an array `array` of size `n+1`, initializing the first three elements with the base cases. Then, it iteratively fills the array from index 3 up to `n`, each time calculating the number of ways to reach the current step by summing up the number of ways to reach the previous two steps. Finally, it returns the value stored in `array[n]`, which represents the total number of ways to climb the staircase of `n` steps.
