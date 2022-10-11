package com.example.solid;

class AccountService {
    public void openAccount() {
        System.out.println("Fill all details");
        System.out.println("Save all data into DB");
        System.out.println("Sent confirmation message to the user.");
    }
}

class AccountServiceSolid {
    AccountRepository accountRepository = new AccountRepository();
    NotificationService notificationService = new NotificationService();

    public void openAccount() {
        System.out.println("Fill all details");
        accountRepository.storeData();
        notificationService.sentMessage();
    }
}

class AccountRepository {
    public void storeData() {
        System.out.println("Save all data into DB");
    }
}

class NotificationService {
    public void sentMessage() {
        System.out.println("Sent confirmation message to the user.");
    }
}


public class SingleResponsibility {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.openAccount();


        AccountServiceSolid accountServiceSolid = new AccountServiceSolid();
        accountServiceSolid.openAccount();
    }
}
