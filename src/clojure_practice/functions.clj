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