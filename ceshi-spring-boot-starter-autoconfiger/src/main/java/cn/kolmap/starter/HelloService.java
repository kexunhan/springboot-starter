package cn.kolmap.starter;

/**
 * @author kxhan
 * @createTime 2020/12/02
 */

public class HelloService {



    private HelloProterties helloProterties;

    public String sayHello(String name) {

        return helloProterties.getPrefix()+"-"+name+"-"+helloProterties.getSuffix();
    }


    public HelloProterties getHelloProterties() {
        return helloProterties;
    }

    public void setHelloProterties(HelloProterties helloProterties) {
        this.helloProterties = helloProterties;
    }
}
