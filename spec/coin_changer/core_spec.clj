(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "Coin Changer"
          (it "should return one penny when input is one"
          (should= [1]
          (coin-changer 1)))

          (it "should return two pennies when input is two"
          (should= [1 1]
          (coin-changer 2)))

          (it "should return three pennies when input is three"
          (should= [1 1 1]
          (coin-changer 3)))

          (it "should return four pennies when input is four"
          (should= [1 1 1 1]
          (coin-changer 4)))

          (it "should return a nickel when input is five"
          (should= [5]
          (coin-changer 5)))

          (it "should return a nickel and a penny when input is 6"
          (should= [5 1]
          (coin-changer 6)))

          (it "should return a nickel and two pennies when input is 7"
          (should= [5 1 1]
          (coin-changer 7)))

          (it "should return a nickel and three pennies when input is 8"
          (should= [5 1 1 1]
          (coin-changer 8)))

          (it "should return a nickel and four pennies when input is 9"
          (should= [5 1 1 1 1]
          (coin-changer 9)))

          (it "should return a dime when input is 10"
          (should= [10]
          (coin-changer 10)))

          (it "should return a dime and a penny when input is 11"
          (should= [10 1]
          (coin-changer 11)))

          (it "should return a dime and two pennies when input is 12"
          (should= [10 1 1]
          (coin-changer 12)))

          (it "should return a dime and a nickel when input is 15"
          (should= [10 5]
          (coin-changer 15)))

          (it "should return two dimes when input is 20"
          (should= [10 10]
          (coin-changer 20)))

          (it "should return two dimes and two pennies when input is 22"
          (should= [10 10 1 1]
          (coin-changer 22)))

          (it "should return a quarter when input is 25"
          (should= [25]
          (coin-changer 25)))

          (it "should return a quarter and three pennies when input is 28"
          (should= [25 1 1 1]
          (coin-changer 28)))

          (it "should return a quarter and a dime when input is 35"
          (should= [25 10]
          (coin-changer 35)))

          (it "should return two quarters if input is 50"
          (should= [25 25]
          (coin-changer 50)))

          (it "should return three quarters if input is 75"
          (should= [25 25 25]
          (coin-changer 75)))

          (it "should return three quarters, a dime, and three pennies if input is 88"
          (should= [25 25 25 10 1 1 1]
          (coin-changer 88)))
)
