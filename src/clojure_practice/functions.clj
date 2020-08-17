(ns clojure-practice.functions)

;; Instructions
; Practice writing functions in Clojure. Make sure you write tests too!
; - [x] Write 2 functions using the `fn` keyword: https://clojuredocs.org/clojure.core/fn
; - [x] Write 2 functions using the `defn` keyword: https://clojuredocs.org/clojure.core/defn
; - [x] Write 2 functions using the `def` keyword: https://clojuredocs.org/clojure.core/def

;; `fn` functions

; 1.
; note to self, the fn keyword does not allow for a doc string like `defn`
; also, it looks like fn might be better suited for annoymous functions. Even though I gave it a name (helps with stack trace)
; it's not available in the scope outside of where it's defined.
((fn hello-person
   [name]
   (str "Hello, " + name)) "Joe")

; 2.
; here is a better example of an annonymous function and use case for fn
((fn [a b] (+ a b)) 2 3)


;; `defn` functions

; 1.
; simple arthmitic


(defn add-two
  "Adds two to the number you pass in"
  [n]
  (+ n 2))

; 2.
; taking in two params
(defn greet-user
  "greets a user"
  [greeting name]
  (str greeting ", " name "!"))

;; `def` functions
; note to self: this is for defining a global variable...it's not special to functions, but can be used for them.

; 1.

(def subtract-ten
  "Subtracts ten from a number"
  (fn
    [n]
    (- n 10)))

; 2.

; yes this function is a bit pointless :)
(def divide-by-one
  "Divides by 1"
  (fn
    [n]
    (/ n 1)))

; Brave Clojure
;; Write a function that takes a number and adds 100 to it.

(defn add-one-hundred
  "adds one hundred to n"
  [n]
  (+ n 100))

; Brave Clojure
;; Write a function dec-maker that works exactly like inc-maker but with subtraction.

(defn dec-maker
  "returns a function which decrements n"
  [n]
  (fn [x] (- x n)))

((dec-maker 9) 10)

; Brave Clojure
;; Write a function mapset that works like map except the return value is a set.

(defn mapset
  "maps over but returns a set instead of a map"
  [fun sequence]
  (set (map fun sequence)))

(mapset inc [1 1 2])

; annonymous function with #
; private functions using defn- (the - makes it private)

; 4Clojure Problem - Get the Caps
; Write a function which takes a string and returns a new string containing only the capital letters.
;; Notes
; I'm thinking I could solve this with filter and a regex ?
; or maybe simpler using a string replace

(defn get-caps
  "Returns a new string containing only the capital letters."
  [s]
  (clojure.string/replace s #"[^A-Z]+" ""))

; 4Clojure Problem - Paindrome Detector
; Write a function which returns true if the given sequence is a palindrome.
; since I'm working with different data types (str, vector) I think
; I need to split it into a seq

(defn is-panlindrome
  "Checks if the sequence is a palindrome"
  [x]
  (= (seq x) (reverse x)))

; (apply str (reverse [:foo :bar :foo]))

(= (seq [:foo :bar :foo]) (reverse [:foo :bar :foo]))
