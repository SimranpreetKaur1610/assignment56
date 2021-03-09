package com.simranpreet_c0780767_a56;

import javax.swing.*;

public class calculateCost
{
    double packageACost;
    double packageBCost;
    double smallStorageCost;
    double largeStorageCost;
    double boxesSmallCost;
    double boxesLargeCost;

    public calculateCost(){
        setPackageACost();
        setPackageBCost();
        setSmallStorageCost();
        setLargeStorageCost();
        setBoxesSmallcost();
        setBoxesLargecost();
    }

    public double getPackageACost() {
        return packageACost;
    }

    public void setPackageACost() {
        this.packageACost = 100.00;
    }

    public double getPackageBCost() {
        return packageBCost;
    }

    public void setPackageBCost() {
        this.packageBCost = 150.00;
    }

    public double getSmallStorageCost() {
        return smallStorageCost;
    }

    public void setSmallStorageCost() {
        this.smallStorageCost = 8.00;
    }

    public double getLargeStorageCost() {
        return largeStorageCost;
    }

    public void setLargeStorageCost() {
        this.largeStorageCost = 20.11;
    }

    public double getBoxesSmallcost() {
        return boxesSmallCost;
    }

    public void setBoxesSmallcost() {
        this.boxesSmallCost = 2.50;
    }

    public double getBoxesLargecost() {
        return boxesLargeCost;
    }

    public void setBoxesLargecost() {
        this.boxesLargeCost = 4.50;
    }

    public static void main(String[] args) {
        calculateCost cost = new calculateCost();

        int j = 0;
        JOptionPane.showMessageDialog(null,"Please Enter Simran as username and Kaur as password");
        while (true){
            String userName = JOptionPane.showInputDialog(
                    null,"Please enter username ");
            String userPassword = JOptionPane.showInputDialog(
                    null,"Please enter the password ");
            if(userName.equals("Simran") && userPassword.equals("Kaur")){
                JOptionPane.showMessageDialog(null,
                        "You have successfully logged in");
                double servicePackage = getServices(cost.getPackageACost(),cost.getPackageBCost());
                System.out.println("Service cost : $"+servicePackage);
                double storageOption = getOptions(cost.getSmallStorageCost(),cost.getLargeStorageCost());
                System.out.println("Options of storage cost : $"+storageOption);
                double boxOption = getBoxOption(cost.getBoxesSmallcost(),cost.getBoxesLargecost());
                System.out.println("Item cost : $"+boxOption);
                JOptionPane.showMessageDialog(null,
                        "Service cost : $"+ servicePackage );
                JOptionPane.showMessageDialog(null,
                        "Options of storage cost : $"+ storageOption );
                JOptionPane.showMessageDialog(null,
                        "Item cost : $"+ boxOption );
                JOptionPane.showMessageDialog(null,
                        "The total final cost : $"+ (servicePackage + storageOption + boxOption) );
                System.out.println("The total final cost : $"+(servicePackage + storageOption + boxOption));
                break;
            }else{
                JOptionPane.showMessageDialog(null,
                        "Invald Login!!! Please Eter the username and password again.");
            }
            j+=1;
            if(j == 3){
                break;
            }
        }
    }

    private static double getServices(double priceA, double priceB) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Please Enter type of service : A or B.\n"+ "Package-A cost :" + priceA + " \nPackage-B cost : " + priceB );
        if(servicePackage.equalsIgnoreCase("A"))
        {
            return priceA;
        }
        else if(servicePackage.equalsIgnoreCase("B"))
        {
            return priceB;
        }
        else
        {
            return 0.0;
        }
    }

    private static double getOptions(double smallStorageCost, double largeStorageCost) {
        String options = JOptionPane.showInputDialog(null,
                "Please Enter type of Storage option : S or L.\n"+ "Small Storage cost :"
                        + smallStorageCost + " \nLarge Storage cost : " + largeStorageCost);
        if(options.equalsIgnoreCase("S"))
        {
            return smallStorageCost;
        }
        else if(options.equalsIgnoreCase("L"))
        {
            return largeStorageCost;
        }
        else
        {
            return 0.0;
        }
    }

    private static double getBoxOption(double boxesSmallCost, double boxesLargeCost) {
        String itemsOptions = JOptionPane.showInputDialog(null,
                "Please Enter type of items : S or L.\n"+ "Small boxes cost :"
                        + boxesSmallCost + " \nLarge Boxes cost : " + boxesLargeCost );
        if(itemsOptions.equalsIgnoreCase("S"))
        {
            return boxesSmallCost;
        }
        else if(itemsOptions.equalsIgnoreCase("L"))
        {
            return boxesLargeCost;
        }else
        {
            return 0.0;
        }
    }

}
