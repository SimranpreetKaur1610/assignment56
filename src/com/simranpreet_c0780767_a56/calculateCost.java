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
                    null,"Please enter user name ");
            String userPassword = JOptionPane.showInputDialog(
                    null,"Please enter the password ");
            if(userName.equals("Simran") && userPassword.equals("Kaur")){
                JOptionPane.showMessageDialog(null,
                        "You have successfully logged in");
                double servicePackage = getServices(cost.getPackageACost(),cost.getPackageBCost());
                System.out.println(servicePackage);
                double storageOption = getOptions(cost.getSmallStorageCost(),cost.getLargeStorageCost());
                System.out.println(storageOption);
                double boxOption = getBoxOption(cost.getBoxesSmallcost(),cost.getBoxesLargecost());
                System.out.println(boxOption);
                JOptionPane.showMessageDialog(null,
                        "Service cost : $"+ servicePackage );
                JOptionPane.showMessageDialog(null,
                        "Options of storage cost : $"+ storageOption );
                JOptionPane.showMessageDialog(null,
                        "Item cost : $"+ boxOption );
                JOptionPane.showMessageDialog(null,
                        "The total final cost : $"+ (servicePackage + storageOption + boxOption) );
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
                "Please Enter type of service: " +
                        "\n$" + " we have package A and B. The package A cost :" + priceA + "And package B cost : " + priceB );
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
        String servicePackage = JOptionPane.showInputDialog(null,
                "Enter type of storage : " +
                        "\n$" + " we have Small Storage and Large Storage. The package A cost :" + smallStorageCost +
                        largeStorageCost + " for large storage");
        if(servicePackage.equalsIgnoreCase("S"))
        {
            return smallStorageCost;
        }
        else if(servicePackage.equalsIgnoreCase("L"))
        {
            return largeStorageCost;
        }
        else
        {
            return 0.0;
        }
    }

    private static double getBoxOption(double boxesSmallCost, double boxesLargeCost) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Please enter type of storage box (S/L) you want from the following" +
                        "\n$" + boxesSmallCost + " for small Storage or $" +
                        boxesLargeCost + " for large storage");
        if(servicePackage.equalsIgnoreCase("S"))
        {
            return boxesSmallCost;
        }
        else if(servicePackage.equalsIgnoreCase("L"))
        {
            return boxesLargeCost;
        }else
        {
            return 0.0;
        }
    }

}
