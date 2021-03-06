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

    public double getPackageACost() {
        return packageACost;
    }

    public void setPackageACost(double packageACost) {
        this.packageACost = 100.00;
    }

    public double getPackageBCost() {
        return packageBCost;
    }

    public void setPackageBCost(double packageBCost) {
        this.packageBCost = 150.00;
    }

    public double getSmallStorageCost() {
        return smallStorageCost;
    }

    public void setSmallStorageCost(double smallStorageCost) {
        this.smallStorageCost = 8.00;
    }

    public double getLargeStorageCost() {
        return largeStorageCost;
    }

    public void setLargeStorageCost(double largeStorageCost) {
        this.largeStorageCost = 20.11;
    }

    public double getBoxesSmallcost() {
        return boxesSmallCost;
    }

    public void setBoxesSmallcost(double boxesSmallcost) {
        this.boxesSmallCost = 2.50;
    }

    public double getBoxesLargecost() {
        return boxesLargeCost;
    }

    public void setBoxesLargecost(double boxesLargecost) {
        this.boxesLargeCost = 4.50;
    }

    private static double getServices(double priceA, double priceB) {
        String servicePackage = JOptionPane.showInputDialog(null,
                "Enter type of service: " +
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
        String storageOptions = JOptionPane.showInputDialog(null,
                "Enter type of storage : " +
                        "\n$" + " we have Small Storage and Large Storage. The package A cost :" + smallStorageCost +
                        largeStorageCost + " for large storage");
        if(storageOptions.equalsIgnoreCase("S"))
        {
            return smallStorageCost;
        }
        else if(storageOptions.equalsIgnoreCase("L"))
        {
            return largeStorageCost;
        }
        else
        {
            return 0.0;
        }
    }

    private static double getBoxOption(double boxesSmallCost, double boxesLargeCost) {
        String boxOptions = JOptionPane.showInputDialog(null,
                "Please enter type of storage box (S/L) you want from the following" +
                        "\n$" + boxesSmallCost + " for small Storage or $" +
                        boxesLargeCost + " for large storage");
        if(boxOptions.equalsIgnoreCase("S"))
        {
            return boxesSmallCost;
        }
        else if(boxOptions.equalsIgnoreCase("L"))
        {
            return boxesLargeCost;
        }else
        {
            return 0.0;
        }
    }

}
