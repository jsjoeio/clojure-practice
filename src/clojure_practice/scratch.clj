(ns clojure-practice.scratch)

;; Scratch - for scratch paper
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

; what this is doing is
; defining a function called foo which takes in x
; it then calls a recursive function
; that runs while x is greater than 0
; it conjoins the number x which is this vector
; with itself calling the function
; and it starts with 5
; giving you (5 4 3 2 1)
((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5)

(defn test [n]
  (let [stop n]
    (loop [i 0
           acc []]
      (if (= i stop)
        acc
        (recur (inc i) (conj acc i))))))

(test 5)

(defn joe
  "do the thing"
  [n]
  (loop [stop n
         acc []]
    (if (= 0 stop)
      acc
      (recur (dec stop) (conj acc stop)))))

(joe 5)

((fn [n]   (loop [stop n
                  acc []]
             (if (= 0 stop)
               acc
               (recur (dec stop) (conj acc stop))))) 5)

(= ((fn [n]   (loop [stop n
                     acc []]
                (if (= 0 stop)
                  acc
                  (recur (dec stop) (conj acc stop))))) 5 ((fn foo [x] (when (> x 0) (conj (foo (dec x)) x))) 5))

(= '(1 2 3) [1 2 3])

(-> [2 5 4 1 3 6] (reverse) (rest) (sort) (last) )
(apply max [1 2 3])

(loop [x 5
  result []]
(if (> x 0)
(recur (dec x) (conj result (+ 2 x)))
result))

; [ 7 6 5 4 3]

((fn foo [x] (when (> x 2) (conj (foo (dec x)) x))) 7)

(conj [] (+ 2 2))

(reduce + [5 4 1])

; a nil key
; returns true if map has key and value is nil

; how to get key from map
(= nil nil)

; first check if it has the key



(contains? {:a 1 :b 2} :z)
(get {:a 1 :b 2} :z)

((fn [key _map] (= nil (and (contains? _map key) (get _map key)))) :z {:a nil :b 2})
(fn [key _map] (= nil (and (contains? _map key) (get _map key))))
; should return false

(defn key-is-nil
  [key _map]
  (if (and (contains? _map key) (= (get _map key) nil)) true false))

(key-is-nil :a {:a 1 :b 2})

(for [x (range 40)
            :when (= 1 (rem x 4))]
        x)

        (for [x (iterate #(+ 4 %) 0)
        :let [z (inc x)]
        :while (< z 40)]
    z)

    (for [[x y] (partition 2 (range 20))]
      (+ x y))
    ; [1 5 9 13]

    (for [[x] (partition 4 (range -4 39))]
      (inc (+ x 4)))

(assoc {} 0 [:a :b])

; func to create a new map
; create key from value
; and set value to default

((fn [_hash-map key val ] (assoc _hash-map key val)) {:b 0} :a 0)

((fn [x col] (reduce-kv (fn [m _ v] (assoc m v x)) {} col)) 0 [:a :b :c])
(fn [x col] (reduce-kv (fn [m _ v] (assoc m v x)) {} col))

(let [results {}]
(for [x [:a :b]]
  (assoc results x 0)))

(apply hash-map [:a 0 :b])



(fn test
  [_map]
  (let [results {}]))

; write a function that takes in a hash-map and a key and a default value


; [:a :b :c] 0 is the index, expected :a

; map over
; if index of matches 0
; return element

; (.indexOf [2 1] 2)

; (defn find-it [collection x] (first (keep-indexed (fn [index item] (if (= index x) item nil)) collection)))

; (find-it '(4 5 6 7) 2)
; (first '(6))

; loop over sequence
; count total

; (reduce (fn [item current] (if item (+ 1 current) 0)) 0 [1 2 3 3])

; (fn [col] (reduce (fn [item current] (if item (+ 1 current) 0)) 0 col))


; ((fn [x] (if x 1 0)) 5)

; (defn joe-count
;   [collection]
;   (reduce (fn [current item] (if item (+ 1 current) 0)) 0 collection))

; (joe-count [1 2])

; (reduce conj '() [1 2 3 4])

; base case

; (defn fib
;   [n]
;   (if (= 0 n) 0)
;   (if (= 1 n) 1)
;   (recur (+ (- n 1) (- n 2))))


(defn fib
  [n]
  (cond
    (= n 0) 0
    (= n 1) 1
     :else (+ (fib (- n 1)) (fib (- n 2)))))

(fib 3)

(def fib-seq-cat
  (lazy-cat [1 2] (map + (rest fib-seq-cat) fib-seq-cat)))
(take 4 fib-seq-cat)

; working with multiple arguments
; use &args
; what I need to do is take the first argument and compare it to the next
;; and keep track of the largest number

(defn get-greater-num
  "returns the greater number of the two"
  [x y]
  (cond
    (< x y) y
    (> x y) x))

(get-greater-num 2 3)
(get-greater-num 3 2)



; (defn get-max
;   "A function which Write a function which takes a variable number of parameters and returns the maximum value"
;   [& args]
;   (apply first-two-sum args)
;   )

; could I write some type of reduce function

; (get-max 1 8 3 4)