package com.work.api.model;

public class Coin {
    private String username;
    private int coin_num;

    public Coin(){

    }

    public Coin(String username,int coin_num){
        this.username = username;
        this.coin_num = coin_num;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getCoin_num() {
        return coin_num;
    }

    public void setCoin_num(int coin_num) {
        this.coin_num = coin_num;
    }

}
