(ns clojure-practice.concurrency)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))
; futures
; delays
; promises
; dynamic vars
; atoms
;; create an atom with the initial value 0, use swap! to increment it a couple of times, then dereference it



