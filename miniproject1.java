import java.util.Scanner;

public class miniproject1 {

public static void main(String[] args) {

// Employee Data

int empId[] = {1001, 1002, 1003, 1004, 1005, 1006, 1007};

String empName[] = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};

String empJoinDate[] = {"01/04/2009", "23.08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};

char empDesignCode[] = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};

String empDept[] = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Macufacturing", "PM"};

int empBasic[] = {20000, 30000, 10000, 12000, 50000, 23000, 29000};

int empHra[] = {8000, 12000, 8000, 6000, 20000, 9000, 12000};

int empIt[] = {3000, 9000, 1000, 2000, 20000, 4400, 10000};



Scanner s = new Scanner(System.in);

System.out.println("18bcs6537");

System.out.print("Employee Id: ");

int eId = s.nextInt();

int idx = -1;

char eCode = '0';

s.close();

for (int i = 0; i < empId.length; i++) {

if (eId == empId[i]) {

idx = i;

eCode = empDesignCode[i];

break;

}

}

if (idx == -1) {

System.out.print("There is no employee with empid : " + eId);

return;

}



String eDesignation;

int eDa;



switch (eCode) {

case 'e':

eDesignation = "Engineer";

eDa = 20000;

break;

case 'c':

eDesignation = "Consultant";

eDa = 32000;

break;

case 'k':

eDesignation = "Clerk";

eDa = 12000;

break;

case 'r':

eDesignation = "Receptionist";

eDa = 15000;

break;

case 'm':

eDesignation = "Manager";

eDa = 14000;

break;

default:

return;

}

int eSalary = empBasic[idx] + empHra[idx] + eDa - empIt[idx];

System.out.println("Emp No. Emp Name Department Designation Salary");

System.out.println();

System.out.println(empId[idx] + "   " + empName[idx] + "   " + empDept[idx] + "    " + eDesignation + "    " + eSalary);

}

}