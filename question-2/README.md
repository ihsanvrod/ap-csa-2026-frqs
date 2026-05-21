2. The Bottle class, which you will write, represents a bottle that contains liquid.
Bottle objects are created by calls to a constructor with a double parameter that represents
the bottle’s capacity, in milliliters (mL), which is the maximum amount of liquid in the
bottle. Assume that this value will be greater than or equal to 0. When Bottle objects are
constructed, each is filled to its capacity.
The Bottle class contains an updateAmount method, which updates the amount of liquid in
the bottle. This method has a double parameter that represents the amount of liquid, in mL, to
be removed from the bottle, with a precondition that the parameter is always greater than zero
and less than or equal to the amount of liquid remaining in the bottle. If updating the amount
of liquid in the bottle would cause it to be less than 25% of the capacity, the bottle is filled
and reset to the capacity. The updateAmount method returns a double that represents the
amount remaining in the bottle, in mL, after the amount has been updated.
The following table contains a sample code execution sequence and the corresponding results.
The code execution sequence appears in a class other than Bottle.


<img width="413.5" height="396" alt="image" src="https://github.com/user-attachments/assets/ec08751e-ef33-436c-afff-3b96ec8649db" />


Write the complete Bottle class. Your implementation must meet all specifications and
conform to the examples shown in the table.
