(ns chapter-1.core)

(println "*** code from chapter 1 ***")

;; a simple add function for two operands
(defn my-addition [operand1 operand2] (+ operand1 operand2))

;; hash map with user's names, credentials and number of pets
(def users {"kyle" {:password "secretk" :number-pets 2}
            "siva" {:password "secrets" :number-pets 4}
            "rob" {:password "secretr" :number-pets 6}
            "george" {:password "secretg" :number-pets 8}})

;; check where user name and password match with local data
(defn check-login [username password]
  (let [actual-password ((users username) :password)]
    (= actual-password password)))
