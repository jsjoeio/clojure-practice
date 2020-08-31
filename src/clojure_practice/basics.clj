(ns clojure-practice.basics)

;; Brave Clojure
; Use the str, vector, list, hash-map, and hash-set functions.

; str
(defn bye
  "says bye to someone"
  [name]
  (str "Bye, " name))

; vector
(vector 1 2 3)

; list
(= '(1 2 3) (list 1 2 3))

; hash-map
(hash-map :age 99, :favorite-color "red")

; hash-set
(hash-set 1 1 2 4)

(defn hello
  "says hello to someone"
  [name]
  (str "Hello, " name))

(hello "Joe")
