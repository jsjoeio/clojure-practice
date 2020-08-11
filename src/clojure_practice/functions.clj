(ns clojure-practice.functions)

;; Instructions
; Practice writing functions in Clojure. Make sure you write tests too!
; - [x] Write 2 functions using the `fn` keyword: https://clojuredocs.org/clojure.core/fn
; - [ ] Write 2 functions using the `defn` keyword: https://clojuredocs.org/clojure.core/defn
; - [ ] Write 2 functions using the `def` keyword: https://clojuredocs.org/clojure.core/def

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
