package org.example;

public class ABankasi implements IBanka{
    private String name;
    private String terminalId;
    private String password;

    public ABankasi(String name, String terminalId, String password) {
        this.name = name;
        this.terminalId = terminalId;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    @Override
    public void connect(){
        System.out.println(this.getName() + " isimli bankaya bağlandı.");
    }
    @Override
    public void payment(double price, String cardNumber, String expireDate, String cvc){
        System.out.println(price + " tutarlı işlem " + cardNumber + " " + expireDate + " " + cvc + " kartından başarılı bir şekilde çekildi.");
    }
}
