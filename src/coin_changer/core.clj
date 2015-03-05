(ns coin-changer.core)

(def denominations [25 10 5 1])

(defn get-highest-coin-amount [amount]
  (first (filter #(>= amount %) denominations)))

(defn coin-changer
  ([amount]
   (let
    [coin (get-highest-coin-amount amount)]
    (coin-changer (- amount coin) [coin])))

  ([amount change]
   (let
     [coin (get-highest-coin-amount amount)]
     (cond
       (= amount 0) change
       :else (recur (- amount coin) (conj change coin))))))
