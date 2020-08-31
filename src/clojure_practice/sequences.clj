(ns clojure-practice.sequences)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

; core sequence functions
; first DONE
; rest
; cons
; map
; mapcat
; reduce
; filter
; distinct
; group-by
; assoc
; take
; drop
; take-while
; drop-while
; some
; sort
; sort-by
; concat
; empty?
; every?
; into
; conj
; apply
; partial
; complement
; comp
; memoize
; update-in

; 4Clojure #33 - Replicate a sequence
; Write a function which replicates each element of a sequence a variable number of times.
; i have two arguments: a sequence and number to repeat
; what I'm thinking is we map over the sequence
; repeat the number and take number times to repeat
; tools: repeatedly and take

(defn replicate-seq
  "a function which replicates each element of a sequence a x number of times"
  [s x]
  (mapcat #(take x (repeat %)) s))

; the issue i'm running into is that it creates a new list
; and is adding that to the sequence

(replicate-seq [1 2 3] 2)

(take 2 (repeat [1 2]))
;; be able to exp


; Exploring first

; Grab the first element in a vector
(first [1 2 3])

; Grab the first element in a list
(first '(1 2 3))

; Grab the first element in a hash map
(first #{:hi 1 :bye 2})

; Exploring rest
; Grabs everything but the first

(rest [1 2 3])

(rest '(1 2 3))

(defn headtail
  "Splits a function into the head and the tail"
  [col]
  (hash-map :head (first col), :tail (vec (rest col))))

(headtail [1 2 3])

(map (split-at 3) (range 9))
