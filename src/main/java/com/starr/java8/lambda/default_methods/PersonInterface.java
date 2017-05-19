package com.starr.java8.lambda.default_methods;

/**
 * Created by tetianad on 5/19/2017.
 */
public interface PersonInterface {

    String getName();
    void setName(String name);

    int getAge();
    void setAge(int age);

    //default method
    default String getPersonInfo(){
        return "Info: name = ["+ getName() + "], age = ["+getAge()+"]";
    }

    //static method
    static String getPersonInfo(Person person){
        return "Info: name = ["+ person.getName() + "], age = ["+person.getAge()+"]";
    }
}
