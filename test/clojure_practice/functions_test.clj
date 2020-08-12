(ns clojure-practice.functions-test
    (:require [clojure.test :refer :all]
              [clojure-practice.functions :refer :all]))

  (deftest annonymous-fn-test
    (testing "returns the name interpolated into the string"
      (is (= "hello, joe" ((fn [name] (str "hello, " name)) "joe")))))

  (deftest annonymous-fn-2-test
    (testing "adds two numbers together"
      (is (= 5 ((fn [a b] (+ a b)) 2 3)))))

  (deftest add-two-test
    (testing "add-two actually adds two"
      (is (= 12 (add-two 10)))))

  (deftest greet-user-test
    (testing "greets a user as expected"
      (is (= "Good morning, Kona!" (greet-user "Good morning" "Kona")))))

  (deftest subtract-ten-test
    (testing "subtracts 10 as expected"
      (is (= 1 (subtract-ten 11)))))

  (deftest divide-by-one-test
    (testing "divides by 1"
      (is (= 12 (divide-by-one 12)))))