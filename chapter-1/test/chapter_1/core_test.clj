(ns chapter-1.core-test
  (:require [clojure.test :refer :all]
            [chapter-1.core :refer :all]))

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
