package com.simranpreet_c0780767_a56;

import javax.swing.*;

public class calculateCost
{
    private double packageACost;
    private double packageBCost;
    private double smallStorageCost;
    private double largeStorageCost;
    private double boxesSmallCost;
    private double boxesLargeCost;

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
        calculateCost totalCost = new calculateCost();

        String input;
        int j = 0;
        JOptionPane.showMessageDialog(null,"Use 'simran' as username and password to login");
        while (true){
            String userName = JOptionPane.showInputDialog(
                    null,"Please enter username ");
            String userPassword = JOptionPane.showInputDialog(
                    null,"Please enter the password ");
            if(userName.equals("simran") && userPassword.equals("simran")){
                JOptionPane.showMessageDialog(null,
                        "You have successfully logged in");
                double servicePackage = getServices(totalCost.getPackageACost(),totalCost.getPackageBCost());
                input = JOptionPane.showInputDialog(null,"How many hours you want this service: ");
                double hoursService = Double.parseDouble(input);
                double totalService = servicePackage * hoursService;
                System.out.println("Service cost : $"+totalService);

                double storageOption = getOptions(totalCost.getSmallStorageCost(),totalCost.getLargeStorageCost());
                input = JOptionPane.showInputDialog(null,"How many days you want this option: ");
                double dayOptions = Double.parseDouble(input);
                double totalOptions = storageOption * dayOptions;
                System.out.println("Options of storage cost : $"+totalOptions);

                double boxOption = getBoxOption(totalCost.getBoxesSmallcost(),totalCost.getBoxesLargecost());
                input = JOptionPane.showInputDialog(null,"How many boxes you want this item: ");
                double boxItems = Double.parseDouble(input);
                double totalBoxes = boxOption * boxItems;
                System.out.println("Item cost : $"+totalBoxes);

                JOptionPane.showMessageDialog(null,
                        userName+"'s Receipt\n"+
                                "--------------------------------"+
                                "\n\nService cost : $"+ totalService+
                                "\nOptions of storage cost : $"+ totalOptions +
                                "\nItem cost : $"+ totalBoxes+
                                "\n\nThe total final cost : $"+ (totalService + totalOptions + totalBoxes)
                        );
                System.out.println("\nThe total final cost : $"+(totalService + totalOptions + totalBoxes));
                break;
            }else{
                JOptionPane.showMessageDialog(null,
                        "Invald Login!!! Please Enter the username and password again.");
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
