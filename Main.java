public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  boolean trouble = false; 
  if(aSmile && bSmile || !aSmile & !bSmile){
    trouble = true;
  }
  return trouble;
}
