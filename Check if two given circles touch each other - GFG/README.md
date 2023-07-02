# Check if two given circles touch each other
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two circles C1 of radius R1 and C2 of radius R2,centered at (X1,Y1) and (X2,Y2) respectively.Find out whether they touch(at one or more than one points).</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
X1=3
Y1=4
R1=5
X2=14
Y2=18
R2=8
<strong>Output:</strong>
0
<strong>Explanation:</strong>
The circles centred at (3,4) and (14,18)
and having radii 5 and 8 respectively
do not touch each other.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
X1=3
Y1=4
R1=5
X2=14
Y2=18
R2=18
<strong>Output:</strong>
1
<strong>Explanation:</strong>
The circles centred at (3,4) and (14,18)
and having radii 5 and 18 respectively
touch each other at two points.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything.Your Task is to complete the function <strong>circleTouch()</strong> which takes 6 integers X1,Y1,R1,X2,Y2 and R2 as input parameters and returns 0 if the circle does not touch each other at all.Otherwise it returns 1.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>O(1)<br>
<strong>Expected Auxillary Space:</strong>O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
-10<sup>4</sup>&lt;=X1,Y1,X2,Y2&lt;=10<sup>4</sup><br>
1&lt;=R1,R2&lt;=10<sup>4</sup></span></p>
</div>