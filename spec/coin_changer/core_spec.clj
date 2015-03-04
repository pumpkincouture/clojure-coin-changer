(ns coin-changer.core-spec
  (:require [speclj.core :refer :all]
            [coin-changer.core :refer :all]))

(describe "coin-changer"
          (it "changes 1"
              (should= [1] (coin-changer 1)))
          (it "changes 2"
              (should= [1 1] (coin-changer 2)))
          (it "changes 3"
              (should= [1 1 1] (coin-changer 3)))
          (it "changes 4"
              (should= [1 1 1 1] (coin-changer 4)))
          (it "changes 5"
              (should= [5] (coin-changer 5)))
          (it "changes 6"
              (should= [5 1] (coin-changer 6)))
          (it "changes 10"
              (should= [10] (coin-changer 10)))
          (it "changes 15"
              (should= [10 5] (coin-changer 15)))
          (it "changes 19"
              (should= [10 5 1 1 1 1] (coin-changer 19)))
          (it "changes 20"
              (should= [10 10] (coin-changer 20)))
          (it "changes 21"
              (should= [10 10 1] (coin-changer 21)))
          (it "changes 25"
              (should= [25] (coin-changer 25)))
          (it "changes 94"
              (should= [25 25 25 10 5 1 1 1 1] (coin-changer 94)))
          )
