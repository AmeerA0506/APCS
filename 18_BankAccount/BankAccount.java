Team AJR's Latest and Greatest Q2 Response:
Because a constructor returns a instance of a class and because you can do:
ClassName x = new ClassName();
without any errors, it is safe to assume that there is already a constructor for all classes.

Team AJR's Latest and Greatest Q3 Response:
In order to test if Java can output a String representation of an object, we can add the line:
System.out.println(BankAccount.toString());
to the main() function. By doing so, we can see that it outputs "BankAccount@XXXXXXXX", meaning that Java has a way to output a String representation of an object. However, this string does not tell us about the instance variables involved, so it has limitations.
