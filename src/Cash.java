class Cash{
    private int cashAmount;
    private float coinAmount;
  
    public Cash(int cashAmount, float coinAmount){
      this.cashAmount = cashAmount;
      this.coinAmount = coinAmount;
    }
  
    public int  getCash(){
      return cashAmount;
    }
  
    public float getCoins(){
      return coinAmount;
    }
  
    public float totalAmount(){
      return cashAmount + coinAmount;
    }
  }