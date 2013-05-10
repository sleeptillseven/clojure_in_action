(ns chapter-2.core)

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

(defn average-pets []
  (let [user-data (vals users)
        number-pets (map :number-pets user-data)
        total (apply + number-pets)
        _ (println "total number of pets: " total)]
    (/ total (count users))))


;; example of a do form
;;
;; some trivial definitions for compile reasons
(def is-something-true? true)

(defn log-message [msg]
  (println msg))

(def store-something-in-db nil)

(def return-useful-value "done with hard work!")

(defn do-many-things []
  (if (is-something-true?)
    (do
      (log-message "in true branch")
      (store-something-in-db)
      (return-useful-value))))
