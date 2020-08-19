(ns clojure-practice.scratch-test
  (:require [clojure.test :refer :all]
            [clojure-practice.scratch :refer :all]))

(deftest get-greater-sum-test
  (testing "should return x if x is greater"
    (is (= 3 (get-greater-num 2 3)))))

(deftest get-greater-sum-2-test
  (testing "should return y if y is greater"
    (is (= 3 (get-greater-num 3 2)))))

