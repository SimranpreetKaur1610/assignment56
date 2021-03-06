package com.simranpreet_c0780767_a56;

import javax.swing.*;

public class calculateCost
{
    double packageACost;
    double packageBCost;
    double smallStorageCost;
    double largeStorageCost;
    double boxesSmallcost;
    double boxesLargecost;

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
        return boxesSmallcost;
    }

    public void setBoxesSmallcost(double boxesSmallcost) {
        this.boxesSmallcost = 2.50;
    }

    public double getBoxesLargecost() {
        return boxesLargecost;
    }

    public void setBoxesLargecost(double boxesLargecost) {
        this.boxesLargecost = 4.50;
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
}
