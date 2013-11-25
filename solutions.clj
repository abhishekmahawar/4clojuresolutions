;solution to 4clojure problems (4clojure.com)

;problem 1.
true

;problem 2.
4

;problem 3.
"HELLO WORLD"

;problem 4.
:a :b :c

;problem 5.
'(1 2 3 4)
'(1 2  3 4)

;problem 6.
:a :b :c

;problem 7.
[1 2 3 4]
[1 2 3 4]
  
;problem 8.
#{:a :b :c :d}
#{:a :b :c :d}

;problem 9.
2

;problem 10.
20
20

;problem 11.
{:b 2}

;problem 12.
3
3
3

;problem 13.
[20 30 40]

;problem 14.
8
8
8
8

;problem 15.
(fn double-a-number [x] (* x 2))

;problem 16.
(fn hw [name] (str "Hello, " name "!"))

;problem 17.
'(6 7 8)

;problem 18.
'(6 7)

;problem 19.
(fn [x] (first (reverse x)))

;problem 20.
(fn [x] (first (rest (reverse x))))

;problem 21.
(fn [l n] 
  (if (zero? n)
    (first l)
    (recur (rest l) (dec n))))

;problem 22.
(fn [coll]
    (loop [c coll n 0]
       (if (empty? c)
          n
          (recur (rest c) (inc n)))))

;problem 23.
(fn [col]
  (reduce conj () col))

;problem 24.
(fn [x] 
  (apply + (seq x)))

;problem 25.
(fn oddnum [x]
  (filter odd? x))
