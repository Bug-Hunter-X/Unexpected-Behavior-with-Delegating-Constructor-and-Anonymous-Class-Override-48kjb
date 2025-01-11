# Scala Constructor and Anonymous Class Override Bug

This repository demonstrates an uncommon Scala bug related to delegating constructors and anonymous class overrides.  When you override a `val` in an anonymous class instantiation that uses a delegating constructor, the overridden `val` supersedes the value initialized by the delegating constructor. This is counter-intuitive to the typical expectation of constructor prioritization.

## Bug Description
The core issue lies in the interaction between a delegating constructor and an anonymous class override of a `val`. While the delegating constructor correctly sets the initial value, the anonymous class override reassigns it, masking the constructor's effect. This behavior may not be immediately apparent to those less familiar with the intricacies of Scala's class definition mechanisms. 

## How to Reproduce
Clone this repository and run the `Main` object in `Bug.scala`. Observe that the output does not reflect the expected initialization from the delegating constructor in the case of the anonymous class instance.  The `BugSolution.scala` shows how to solve the issue.

## Solution
The solution involves understanding how to properly handle this specific scenario in Scala, often involving the use of a different instantiation approach to ensure the delegating constructor is used and the intended value is set.