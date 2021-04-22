package com.team.blackjack.model;

public class MoneyVO {
   
   private Integer money = 100000;
   
//   public MoneyVO(int money){
//      this.money = money;
//   }
   public int getMoney() {
      return money;
   }
   public void setMoney(int money) {
      this.money = money;
   }
   public void plusMoney(int money) {
      this.money += money;
   }
   public void minusMoney(int money) {
      this.money -= money;
   }

}