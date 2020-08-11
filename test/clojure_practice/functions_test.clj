(ns clojure-practice.functions-test
    (:require [clojure.test :refer :all]
              [clojure-practice.functions :refer :all]))

  (deftest annonymous-fn-test
    (testing "returns the name interpolated into the string"
      (is (= "hello, joe" ((fn [name] (str "hello, " name)) "joe")))))

  (deftest annonymous-fn-2-test
    (testing "adds two numbers together"
      (is (= 5 ((fn [a b] (+ a b)) 2 3)))))
