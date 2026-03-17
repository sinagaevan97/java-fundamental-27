package com.juaracoding;

import java.util.Scanner;

public class Ujian1 {
    static double balance = 1000000;
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        if (login()) {
            menu();
        } else {
        }
        System.out.println("Out of attempt, call customer service");
    }

    public static boolean login() {
        int attemptLimit = 3;

        System.out.println("LOGIN ATM");

        while (attemptLimit > 0) {
            System.out.print("Input username: ");
            String username = input.nextLine();
            System.out.print("Input password: ");
            String password = input.nextLine();
            if (username.equals("user") && password.equals("user123")) {
                System.out.println("Login Berhasil!\n");
                return true;
            } else {
                attemptLimit--;
                if (attemptLimit > 0) {
                    System.out.println("Login Gagal! Sisa percobaan: " + attemptLimit);
                    System.out.println("---------------------------");
                }
            }
        }
        return false;
    }

    public static void menu() {
        boolean systemrun = true;
        while (systemrun) {
            System.out.println("ATM MENU");
            System.out.println("1. Balance View");
            System.out.println("2. Deposit");
            System.out.println("3. Withdrawal");
            System.out.println("4. Exit");
            System.out.print(" Choose Menu (1-4): ");
            if (!input.hasNextInt()) {
                System.out.println("Only accepts numeric input!");
                input.next();
                continue;
            }

            int pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    balanceView();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdrawal();
                    break;
                case 4:
                    System.out.println("Thank you for using our services.");
                    systemrun = false;
                    break;
                default:
                    System.out.println("Invalid selection!");
            }
        }
    }

    public static void balanceView() {
        System.out.println("\nYour balance now: Rp " + balance + "\n");
    }

    public static void deposit() {
        System.out.print("Enter deposit amount: ");
        double amount = input.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
            System.out.println("\nYour balance now: Rp " + balance + "\n");
        } else {
            System.out.println("Amount invalid.\n");
        }
    }

    public static void withdrawal() {
        System.out.print("Enter withdrawal amount: ");
        double amount = input.nextDouble();

        if (amount > balance) {
            System.out.println("Transaction Failed! Insufficient balance.\n");
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.\n");
        } else {
            balance -= amount; // balance = 1jt - 500rb
            System.out.println("Withdrawal successful.");
            System.out.println("\nYour balance now: Rp " + balance + "\n");
        }
    }

}
