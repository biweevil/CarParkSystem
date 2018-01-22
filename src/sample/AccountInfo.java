package sample;

import java.io.*;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by Jordan on 19/01/2018.
 */
public class AccountInfo
{
    private File accountFile;
    private String password;
    private double balance;
    private Instant seasonPass;
    private Instant weekPass;
    private Instant dayPass;

    static AccountInfo newAccount(File file, String password){
        return new AccountInfo(file, password);
    }

    private AccountInfo(File file, String password){
        accountFile = file;
        this.password = password;
        balance = 0.0;
        seasonPass = Instant.EPOCH;
        weekPass = Instant.EPOCH;
        dayPass = Instant.EPOCH;
    }

    AccountInfo(File file){
        accountFile = file;
        try
        {
            Scanner scanner = new Scanner(new FileInputStream(accountFile));
            read(scanner);
        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }


    private void read(Scanner scanner){
        password = scanner.nextLine();
        balance = Double.parseDouble(scanner.nextLine());
        seasonPass = Instant.parse(scanner.nextLine());
        weekPass = Instant.parse(scanner.nextLine());
        dayPass = Instant.parse(scanner.nextLine());
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void update(){

        FileWriter fw = null;
        try
        {
            fw = new FileWriter(accountFile);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(password);
            bw.newLine();
            bw.write(String.valueOf(balance));
            bw.newLine();
            bw.write(seasonPass.toString());
            bw.newLine();
            bw.write(weekPass.toString());
            bw.newLine();
            bw.write(dayPass.toString());
            bw.newLine();
            bw.close();
        } catch (IOException e)
        {
            e.printStackTrace();
        }
        /*
                Instant instant = Instant.now();
                ZonedDateTime zdt = ZonedDateTime.ofInstant(instant, ZoneId.systemDefault());
                Calendar cal1 = GregorianCalendar.from(zdt);
         */
    }
}
