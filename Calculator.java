import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("欢迎来到我的年薪计算器小软件");

        while(true){
            System.out.print("请输入月薪：");
            int MonthSalary = scanner.nextInt();
            System.out.print("请输入您薪资的月份：");
            int Months = scanner.nextInt();
            int YearSalary = MonthSalary * Months;


            

            if(YearSalary > 100000 && YearSalary <= 200000){
                System.out.println("恭喜您，您的年薪超过了90%的人。");
            }
            if(YearSalary > 200000){
                System.out.println("恭喜您，您的年薪超过了98%的人。");
            }
            System.out.println("您的年薪是： " + YearSalary);   


            System.out.println("本次计算已结束，请问是否退出。退出请输入exit;其它字符继续计算");
            scanner.nextLine();
            String command = scanner.nextLine();
            
            if("exit".equals(command)){
                System.out.println("退出软件！");
                break;
            }else{
                System.out.println("继续计算！");
                continue;
            }


            /*System.out.println("输入exit退出程序；否则进入下一次计算");
            Scanner sc = new Scanner(System.in);
            sc.nextLine();
            String command = sc.nextLine();
            System.out.println("===========" + command + "===========");*/

        }
       

    }
}
