(ns clojure-practice.basics-test
  (:require [clojure.test :refer :all]
            [clojure-practice.basics :refer :all]))

(deftest bye-test
  (testing "say bye"
    (is (= "Bye, Daisy" (bye "Daisy")))))

(deftest vector-test
  (testing "creates an new vector"
    (is (= [1 2 3] (vector 1 2 3)))))

(deftest list-test
  (testing "creates an new list"
    (is (= '(1 2 3) (list 1 2 3)))))

(deftest hash-map-test
  (testing "creates an new hash-map"
    (is (= {:age 99, :favorite-color "red"} (hash-map :age 99, :favorite-color "red")))))

(deftest hash-set-test
  (testing "creates an new hash-set"
    (is (= #{1 4 2} (hash-set 1 1 2 4)))))