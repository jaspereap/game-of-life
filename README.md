# Project details
Game of Life implementation

# Rules
In each generation (iteration), a cell will either be destroyed, created or remain the same based on the number of adjacent neighbouring alive cells.
1. 0-1 Neighbours: Cell dies
2. 2 Neighbours: Cell remains the same
3. 3 Neighbours: Cell created if it is dead
4. 4 or more Neighbours: Cell dies

# Example
```
Initial grid: 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . * . . . . . 
. . . . * * . . . . 
. . . . * . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
```
First Iteration
```
Iteration 0
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . * * . . . . 
. . . * * * . . . . 
. . . . * * . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
```
Second Iteration
```
Iteration 1
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . * . * . . . . 
. . . * . . * . . . 
. . . * . * . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
```
Third Iteration
```
Iteration 2
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . * . . . . . 
. . * * . * * . . . 
. . . . * . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
```
Fourth Iteration
```
Iteration 3
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . * * * . . . . 
. . . * . * . . . . 
. . . * * * . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
```
Fifth Iteration
```
Iteration 4
. . . . . . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
. . . . * . . . . . 
. . . * . * . . . . 
. . * . . . * . . . 
. . . * . * . . . . 
. . . . * . . . . . 
. . . . . . . . . . 
. . . . . . . . . . 
```