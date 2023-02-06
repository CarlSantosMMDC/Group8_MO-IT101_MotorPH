import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);{
        String[][] users = {
            { "10001", "10001Jose" },
            { "10002", "10002Christian" },
            { "10003", "10003Brad " },
            { "10004", "10004Anthony" },
            { "10005", "10005Alice" },
            { "10006", "10006Rosie " },
            { "10007", "10007Martha" },
            { "10008", "10008Leila" },
            { "10009", "10009Allison " },
            { "10010", "10010Cydney " },
            { "10011", "10011Josie " },
            { "10012", "10012Selena " },
            { "10013", "10013Fredrick " },
            { "10014", "10014Mark " },
            { "10015", "10015Darlene " },
            { "10016", "10016Kolby " },
            { "10017", "10017Vella " },
            { "10018", "10018Tomas" },
            { "10019", "10019Jacklyn " },
            { "10020", "10020Percival " },
            { "10021", "10021Garfield " },
            { "10022", "10022Lizeth " },
            { "10023", "10023Carol " },
            { "10024", "10024Emelia " },
            { "10025", "10025Delia " }
};
        int attempts = 0;
        String username, password;

        while (attempts < 3) {
          System.out.print("Enter username: ");
          username = scan.nextLine();
          System.out.print("Enter password: ");
          password = scan.nextLine();

          for (String[] user : users) {
            if (username.equals(user[0]) && password.equals(user[1])) {
                System.out.println("Login successful!");
                String userIdInfo = username;
                System.out.println("Enter below the Salary");
                double mainSalary = scan.nextDouble();
                PhilHealth(mainSalary);
                SSSContribution(mainSalary);
                TaxableIncome(mainSalary*12);
  }
          }

          System.out.println("Incorrect username or password. Please try again.");
          attempts++;
        }

        System.out.println("You have reached the maximum number of attempts. Login failed.");
      }
    }
    

    // SSS Contribution source:
    // https://www.lumina.com.ph/news-and-blogs/blogs/how-to-compute-income-tax-philippines/#:~:text=on%202023%20onwards%3A-,An%20annual%20salary%20of%20not%20over%20Php%20250%2C%20000%20%3D%200,excess%20over%20Php%20400%2C%20000
    // https://filipiknow.net/sss-contribution/#1-employed-members
    public static void SSSContribution(double salary) {
        double sssContri = 0;
        double employerShare = 0;

        // Employee's share x 0.045 Contribution rate of the MSC
        // Employer's share x 0.095 Contribution rate + EC + wisp
        // Of the 14% contribution rate, the employee pays 4.5% through monthly salary
        // deductions, while the employer shoulders the remaining 9.5%3.
        // Additionally, employers pay the monthly contribution for the Employees’
        // Compensation (EC) Program, which is ₱10 per employee earning below ₱15,000 or
        // ₱30 per employee earning ₱15,000 and above.
        
        if(salary>=0 && salary<=4249.99){
        sssContri = 180;
        employerShare = 390;
    }else if(salary>=4250&&salary<=4749.99)

    {
        sssContri = 202.5;
        employerShare = 437.5;
    }else if(salary>=4750&&salary<=5249.99)
    {
        sssContri = 225;
        employerShare = 485;
    }else if(salary>=5250&&salary<=5749.99)
    {
        sssContri = 247.5;
        employerShare = 532.5;
    }else if(salary>=5750&&salary<=6249.99)
    {
        sssContri = 270;
        employerShare = 580;
    }else if(salary>=6250&&salary<=6749.99)
    {
        sssContri = 292.5;
        employerShare = 627.5;
    }else if(salary>=6750&&salary<=7249.99)
    {
        sssContri = 315;
        employerShare = 675;
    }else if(salary>=7250&&salary<=7749.99)
    {
        sssContri = 337.5;
        employerShare = 722.5;
    }else if(salary>=7750&&salary<=8249.99)
    {
        sssContri = 360;
        employerShare = 770;
    }else if(salary>=8250&&salary<=8749.99)
    {
        sssContri = 382.5;
        employerShare = 817.5;
    }else if(salary>=8750&&salary<=9249.99)
    {
        sssContri = 405;
        employerShare = 865;
    }else if(salary>=9250&&salary<=9749.99)
    {
        sssContri = 427.5;
        employerShare = 912.5;
    }else if(salary>=9750&&salary<=10249.99)
    {
        sssContri = 450;
        employerShare = 960;
    }else if(salary>=10250&&salary<=10749.99)
    {
        sssContri = 472.5;
        employerShare = 1007.5;
    }else if(salary>=10750&&salary<=11249.99)
    {
        sssContri = 495;
        employerShare = 1055;
    }else if(salary>=11250&&salary<=11749.99)
    {
        sssContri = 517.5;
        employerShare = 1102.5;
    }else if(salary>=11750&&salary<=12249.99)
    {
        sssContri = 540;
        employerShare = 1150;
    }else if(salary>=12250&&salary<=12749.99)
    {
        sssContri = 562.5;
        employerShare = 1197.5;
    }else if(salary>=12750&&salary<=13249.99)
    {
        sssContri = 585;
        employerShare = 1245;
    }else if(salary>=13250&&salary<=13749.99)
    {
        sssContri = 607.5;
        employerShare = 1292.5;
    }else if(salary>=13750&&salary<=14249.99)
    {
        sssContri = 630;
        employerShare = 1340;
    }else if(salary>=14250&&salary<=14749.99)
    {
        sssContri = 652.5;
        employerShare = 1387.5;
    }else if(salary>=14750&&salary<=15249.99)
    {
        sssContri = 675;
        employerShare = 1455;
    }else if(salary>=15250&&salary<=15749.99)
    {
        sssContri = 697.5;
        employerShare = 1502.5;
    }else if(salary>=15750&&salary<=16249.99)
    {
        sssContri = 720;
        employerShare = 1550;
    }else if(salary>=16250&&salary<=16749.99)
    {
        sssContri = 742.5;
        employerShare = 1597.5;
    }else if(salary>=16750&&salary<=17249.99)
    {
        sssContri = 765;
        employerShare = 1645;
    }else if(salary>=17250&&salary<=17749.99)
    {
        sssContri = 787.5;
        employerShare = 1692.5;
    }else if(salary>=17750&&salary<=18249.99)
    {
        sssContri = 810;
        employerShare = 1740;
    }else if(salary>=18250&&salary<=18749.99)
    {
        sssContri = 832.5;
        employerShare = 1787.5;
    }else if(salary>=18750&&salary<=19249.99)
    {
        sssContri = 855;
        employerShare = 1835;
    }else if(salary>=19250&&salary<=19749.99)
    {
        sssContri = 877.5;
        employerShare = 1882.5;
    }else if(salary>=19750&&salary<=20249.99)
    {
        sssContri = 900;
        employerShare = 1930;
    }else if(salary>=20250&&salary<=20749.99)
    {
        sssContri = 922.5;
        employerShare = 1930;
    }else if(salary>=20750&&salary<=21249.99)
    {
        sssContri = 945;
        employerShare = 1930;
    }else if(salary>=21250&&salary<=21749.99)
    {
        sssContri = 967.5;
        employerShare = 1930;
    }else if(salary>=21750&&salary<=22249.99)
    {
        sssContri = 990;
        employerShare = 1930;
    }else if(salary>=22250&&salary<=22749.99)
    {
        sssContri = 1012.5;
        employerShare = 1930;
    }else if(salary>=22750&&salary<=23249.99)
    {
        sssContri = 1035;
        employerShare = 1930;
    }else if(salary>=23250&&salary<=23749.99)
    {
        sssContri = 1057.5;
        employerShare = 1930;
    }else if(salary>=23750&&salary<=24249.99)
    {
        sssContri = 1080;
        employerShare = 1930;
    }else if(salary>=24250&&salary<=24749.99)
    {
        sssContri = 1102.5;
        employerShare = 1930;
    }else if(salary>=24750&&salary<=25249.99)
    {
        sssContri = 1125;
        employerShare = 1930;
    }else if(salary>=25250&&salary<=25749.99)
    {
        sssContri = 1147.5;
        employerShare = 1930;
    }else if(salary>=25750&&salary<=26249.99)
    {
        sssContri = 1170;
        employerShare = 1930;
    }else if(salary>=26250&&salary<=26749.99)
    {
        sssContri = 1192.5;
        employerShare = 1930;
    }else if(salary>=26750&&salary<=27249.99)
    {
        sssContri = 1215;
        employerShare = 1930;
    }else if(salary>=27250&&salary<=27749.99)
    {
        sssContri = 1237.5;
        employerShare = 1930;
    }else if(salary>=27750&&salary<=28249.99)
    {
        sssContri = 1260;
        employerShare = 1930;
    }else if(salary>=28250&&salary<=28749.99)
    {
        sssContri = 1282.5;
        employerShare = 1930;
    }else if(salary>=28750&&salary<=29249.99)
    {
        sssContri = 1305;
        employerShare = 1930;
    }else if(salary>=29250&&salary<=29749.99)
    {
        sssContri = 1327.5;
        employerShare = 1930;
    }else if(salary>=29750)
    {
        sssContri = 1350;
        employerShare = 1930;


        }
        
        System.out.println("SSS Contribution Employee Share: " + sssContri);
        System.out.println("\tSSS Contribution Employer Share: " + employerShare);
    }



    // Taxable Income
    public static void TaxableIncome(double salary){
        double tax;

        if (salary <= 250000) {
            tax = 0;
        } else if (salary <= 400000) {
            tax = (salary - 250000) * 0.15;
        } else if (salary <= 800000) {
            tax = (salary - 400000) * 0.20 + 22500;
        } else if (salary <= 2000000) {
            tax = (salary - 800000) * 0.25 + 102500;
        } else if (salary <= 8000000) {
            tax = (salary - 2000000) * 0.30 + 402500;
        } else {
            tax = (salary - 8000000) * 0.35 + 2202500;
        }
        System.out.println("Income tax: " + tax/12);
    }

    //

    // PhilHealth Contribution
    // Source: https://taxcalculatorphilippines.com/philhealth-contribution-table
    public static void PhilHealth(double salary){
    double contributionPH;
        if (salary <= 10000) {
            contributionPH = 450;
    } else if (salary <= 89999.99) {
             contributionPH = salary * 0.045 ;
    } else {
              contributionPH = 4050 ;
    }

    System.out.println("PhilHealth contribution: " + contributionPH);
  }
}