(ns chapter-2.core-test
  (:require [clojure.test :refer :all]
            [chapter-2.core :refer :all]))

(deftest my-addition-test
  (testing "my addition function"
    (testing "some simple non-negative additions"
      (is (= 3 (my-addition 1 2)))
      (is (= 1 (my-addition 1 0)))
      (is (= 0 (my-addition 0 0)))
      (is (= 2100000000 (my-addition 100000000 2000000000))))
    (testing "negative operands"
      (is (= 1 (my-addition -1 2)))
      (is (= 0 (my-addition -1 1)))
      (is (= 0 (my-addition -0 -0)))
      (is (= -2 (my-addition -1 -1))))))

(deftest check-login-test
  (testing "check login/password against local store"
    (testing "correct input"
      (is (check-login "kyle" "secretk"))
      (is (check-login "siva" "secrets"))
      (is (check-login "rob" "secretr"))
      (is (check-login "george" "secretg"))
    (testing "wrong input"
      (not (check-login "kyle" "seCret"))
      (not (check-login "siva" "seet"))
      (not (check-login "rob" "secreto"))
      (not (check-login "george" "secrtg"))))))

(deftest average-pets-test
  (testing "average number of pets"
    (is (= 5 (average-pets)))))
