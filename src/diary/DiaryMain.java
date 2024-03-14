package diary;

import javax.swing.*;

public class DiaryMain {
    private final Diaries diaries=new Diaries( );
    private Diary diary;

    private boolean validate(String name){

        return name.isBlank();
    }

    private String[] prompt(){
        String name = input("welcome\nEnter your name ");
        String password= input("enter preferred password");
        String [] returnValue = new String[2];
        returnValue[0] = name;
        returnValue[1] = password;
        return returnValue;
    }

    public void print(String output){

        JOptionPane.showMessageDialog(null,output);
    }

    public String input(String output){

        return JOptionPane.showInputDialog(null,output);
    }

    private void createNewDiary(){
        String [] nameAndPassword = prompt();
        if(validate(nameAndPassword[0]) || validate(nameAndPassword[1])){
            print("Name or password cannot be blank.");
            createNewDiary();
        }
        diary = new Diary(nameAndPassword[0],nameAndPassword[1]);
        diaries.add(nameAndPassword[0],nameAndPassword[1]);
        print(String.format("%s \nEntry(s) created successfully.",diary.toString()));
        diaryMenu();
    }

    public static void main(String[] args){

        homePage();
    }

    private void homePage(){
        String choice = input("Welcome\n1. Create new Diary.\n2. Exit.");
        switch(choice){
            case "1":
                createNewDiary();
            case "2":
                print("GoodBye.");
                System.exit(0);
            default:
                diaryMenu();
                    }

    }

    private void createEntry(){
        String title;
        String body;
        try {
            title = input("Enter Entry Title");
            body = input("write what you want to keep in your diary");
            print(String.format("Entry Details.\n%s",diary.createEntry(title,body)));
            diary.lockDiary( );
            print("Diary is locked.");
            diaryMenu();
        } catch (IllegalArgumentException e) {
            print(e.getMessage());
            diaryMenu();
        }
    }

    private void updateEntry(){
        try {
                String password = input("enter password");
                diary.unlockDiary(password);
                int id = Integer.parseInt(input("Enter Entry id"));
                String title = input("update  Entry Title");
                String body = input("write what you want to keep in your diary");
                diary.updateEntry(id, title, body);
                diary.lockDiary();
            print("Diary id Locked.");
                diaryMenu();
        } catch (IllegalArgumentException illegalArgumentException) {
            print("you entered a wrong command");
            diaryMenu();
        }
        catch (InvalidUserException invalidUserException) {
            print("Entry does not exist");
            diaryMenu();
        }
        catch (IncorrectPasswordException incorrectPasswordException) {
            print(incorrectPasswordException.getMessage());
            diaryMenu();
        }
    }

    private void deleteEntry(){
        try {
            String password=input("Enter password");
            diary.unlockDiary(password);
            int id = Integer.parseInt(input("Enter id of Entry to delete"));
                diary.deleteEntry(id);
                diary.lockDiary();
            diaryMenu();
        }catch(Exception exception){
            print(exception.getMessage());
            diaryMenu();
        }
    }

    private void diaryMenu(){
        String option = input("1. create Entry\n2. Update Entry\n3. Delete Entry\n4. Main menu\n5. Exit");
        switch(option){
            case "1":
                createEntry();
            case "2":
                updateEntry();
            case "3":
                deleteEntry();
            case "4":
                homePage();
            case "5":
                System.exit(0);
            default:
                diaryMenu();
        }

    }
//    StringBuilder
}