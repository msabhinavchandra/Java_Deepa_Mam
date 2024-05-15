class Test {
    public static void main(String[] args) {
        Permanent Alex = new Permanent("Anil", 101, 10000, 1500, 3);
        // Alex.calculateSalary();
        // Output:
        // Permanent Employee: Your salary is: 12000.0
        // getter from parent
        // System.out.println(Alex.getSalary());
        // output:
        // Permanent Employee: Your salary is: 12000.0
        // 12000.0
        // you will call the parent methods from the child components via super method.
        //Where this is getter method which i had used.
        
        Alex.setEmpId(2000);
        System.out.println(Alex.getEmpId());
        // Output:
        // 2000

        // Therefore, getters and setters are working just
        // perfectly fine.
        // hence accessed via parent successfully.

        ContractEmployee Paul = new ContractEmployee("Paul", 102, 8000, 5);
        // Paul.calculateSalary();
        // Output:
        // Permanent Employee: Your salary is: 40000.0

    }
}

//write me a program 
