package com.company.core;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        String[][] usersData = new String[4][2];

        // main loop
        while (!command.equals("end")) {
            String[] commandArgs = command.split(" ");
            switch (commandArgs[0]) {
                case "register": {
                    registerUser(commandArgs, usersData);
                    break;
                }
                case "delete": {
                    deleteUser(commandArgs, usersData);
                    break;
                }
            }

            // read next command
            command = scanner.nextLine();
        }
    }

    public static boolean isValidArguments(String[] commandArgs) {
        if (commandArgs.length < 3) {
            printInvalidOutput("Too few parameters.");
            return false;
        }
        return true;
    }

    public static boolean isValidStringLength(String stringType, String stringMessage) {
        if (stringType.length() < 3) {
            printInvalidOutput(String.format("%s must be at least 3 characters long.", stringMessage));
            return false;
        }
        return true;
    }

    public static int findNextFreeSlotIndex(String[][] usersData) {
        for (int i = 0; i < usersData.length; i++) {
            if (usersData[i][0] == null) {
                return i;
            }
        }
        return -1;
    }

    public static void registerUser(String[] commandArgs, String[][] usersData) {
        // validate arguments
        if (!isValidArguments(commandArgs))
            return;

        String username = commandArgs[1];
        String password = commandArgs[2];

        // validate username
        if (!isValidStringLength(username, "Username"))
            return;

        // validate password
        if (!isValidStringLength(password, "Password"))
            return;

        // check if username exists
        boolean usernameExists = false;
        for (int i = 0; i < usersData.length; i++) {
            if (username.equals(usersData[i][0])) {
                usernameExists = true;
            }
        }

        if (usernameExists) {
            printInvalidOutput("Username already exists.");
            return;
        }

        // find free slot
        int freeSlotIndex = findNextFreeSlotIndex(usersData);

        // no free slots
        if (freeSlotIndex == -1) {
            printInvalidOutput("The system supports a maximum number of 4 users.");
            return;
        }

        // save user
        usersData[freeSlotIndex][0] = username;
        usersData[freeSlotIndex][1] = password;

        printValidOutput("Registered user.");
    }

    public static void deleteUser(String[] commandArgs, String[][] usersData) {
        // validate arguments
        if (!isValidArguments(commandArgs))
            return;

        String username = commandArgs[1];
        String password = commandArgs[2];

        // validate username
        if (!isValidStringLength(username, "Username"))
            return;

        // validate password
        if (!isValidStringLength(password, "Password"))
            return;

        // find account to delete
        int accountIndex = -1;
        for (int i = 0; i < usersData.length; i++) {
            if (username.equals(usersData[i][0]) && password.equals(usersData[i][1])) {
                accountIndex = i;
            }
        }

        if (accountIndex == -1) {
            printInvalidOutput("Invalid account/password.");
            return;
        }

        usersData[accountIndex][0] = null;
        usersData[accountIndex][1] = null;

        printValidOutput("Deleted account.");
    }

    public static void printInvalidOutput(String message) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";

        System.out.println(ANSI_RED + message + ANSI_RESET);
    }

    public static void printValidOutput(String message) {
        String ANSI_RESET = "\u001B[0m";
        String ANSI_GREEN = "\u001B[32m";

        System.out.println(ANSI_GREEN + message + ANSI_RESET);
    }
}
