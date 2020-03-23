package com.ldr.demo2;

/**
 * 项目名称：spring-study
 * 类 名 称：UserServiceProxy
 * 类 描 述：TODO
 * 创建时间：2020-02-25 10:25
 * 创 建 人：t4ki
 */
public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void query() {
        log("query");
        userService.query();
    }

    public void log(String msg){
        System.out.println("增加了" + msg +"方法");
    }
}
