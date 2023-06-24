package DNS;

import java.util.ArrayList;
import java.util.List;

public class UserHolder {
    private final List<User> userList;

    public UserHolder() {
        this.userList = new ArrayList<>();
    }
    public void addUser(User user){
        userList.add(user);
        System.out.println("Аккаунт успешно создан");
    }
    public void removeUser(String phoneNumber){
        for (User user : userList) {
            if(user.getPhoneNumber().equals(phoneNumber)){
                userList.remove(user);
                System.out.println("Аккаунт успешно удален");
                break;
            }
            System.out.println("Аккаунт с таким номер не найден");
            break;
        }
    }
    public List<User> printUser(){
        return userList;
    }
}
