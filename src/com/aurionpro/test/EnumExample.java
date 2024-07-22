package com.aurionpro.test;

//An enum (short for "enumeration") is a special data type in Java that enables a variable to be a set of predefined constants. 
//It is used to define a collection of constants that can be used to represent a set of related values. 
//Enums provide a way to define and group constants in a type-safe manner.

//Key Points about Enums:
//Type-Safe: Enums provide a type-safe way to define collections of constants.
//Fixed Set of Constants: Enums define a fixed set of constants that do not change.
//Can Have Fields and Methods: Enums can have fields, constructors, and methods, just like regular classes.
//Built-in Methods: Enums have built-in methods like values(), valueOf(), and ordinal().
//Can Implement Interfaces: Enums can implement interfaces.

enum Day {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
public class EnumExample {
	    public static void main(String[] args) {
	        // Using the enum
	        Day today = Day.MONDAY;

	        // Switch-case with enum
	        switch (today) {
	            case SUNDAY:
	                System.out.println("Today is Sunday");
	                break;
	            case MONDAY:
	                System.out.println("Today is Monday");
	                break;
	            case TUESDAY:
	                System.out.println("Today is Tuesday");
	                break;
	            case WEDNESDAY:
	                System.out.println("Today is Wednesday");
	                break;
	            case THURSDAY:
	                System.out.println("Today is Thursday");
	                break;
	            case FRIDAY:
	                System.out.println("Today is Friday");
	                break;
	            case SATURDAY:
	                System.out.println("Today is Saturday");
	                break;
	        }
	    }
	

}
