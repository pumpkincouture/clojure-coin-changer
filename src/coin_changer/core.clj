(ns coin-changer.core)

(def denominations [25 10 5 1])

(defn- largest-denomination [amount]
  (first (filter #(>= amount %) denominations)))

(defn coin-changer
  ([amount]
   (let
     [coin (largest-denomination amount)]
     (coin-changer (- amount coin) [coin])))

  ([amount change]
   (let
     [coin (largest-denomination amount)]
     (cond
       (nil? coin) change
       :else (recur (- amount coin) (conj change coin)))))
)
