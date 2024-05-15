package Modes;
/*when you are compiling with the help of the packages
the way you compile will be different from the way you compile in java
packages are used to group related classes
->help in avoidig name conflicts
there are 2 types of packages which we use in java
a)Built-in packages
Java API
b)User-defined packages
custom packages

compile them by adding all the .class files in the folder(called the 
name of the package,in this case it is Modes)
javac -d . Dorian.java
javac -d . *.java ->this will compile all the .java files at once
and add them in the NameOfThePackageFolder(Modes) folder.
->instead of . if we write anything in the place of dot,it will 
become the name of the folder,in which all the .class files are stored.
 */
public class Dorian {

    public static void main(String[] args) {
        System.out.println("i am Modes's  Dorian's Class's  Main Method!");
    }
    
}
