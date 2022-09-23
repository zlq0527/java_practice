package cn.service;

public class Client {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.shot();
    }
}
