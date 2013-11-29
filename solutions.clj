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

;problem 19 - Write a function which returns the last element in a sequence.
(fn [x] (first (reverse x)))

;problem 20 - Write a function which returns the second to last element from a sequence.
(fn [x] (first (rest (reverse x))))

;problem 21 - Write a function which returns the Nth element from a sequence.
(fn [l n] 
  (if (zero? n)
    (first l)
    (recur (rest l) (dec n))))

;problem 22 - Write a function which returns the total number of elements in a sequence.
(fn [coll]
    (loop [c coll n 0]
       (if (empty? c)
          n
          (recur (rest c) (inc n)))))

;problem 23 - Write a function which reverses a sequence.
(fn [col]
  (reduce conj () col))

;problem 24 - Write a function which returns the sum of a sequence of numbers.
(fn [x] 
  (apply + (seq x)))

;problem 25 - Write a function which returns only the odd numbers from a sequence.
(fn oddnum [x]
  (filter odd? x))

;problem 26 - Write a function which returns the first X fibonacci numbers.
(fn [n] 
  (take n 
    (map first (iterate (fn [[a b]] [b (+ a b)]) [1 1]))))

;problem 27 - Write a function which returns true if the given sequence is a palindrome.
;             Hint: "racecar" does not equal '(\r \a \c \e \c \a \r)
(fn [col] 
  (if (string? col)
    (= col(apply str (vec (reverse col))))
    (= col (reverse col))))

;problem 28 - Write a function which flattens a sequence.
;              Hint: Special Restrictions - flatten
(fn flt [col]
  (let [f (first col) r (next col)]
    (concat 
     (if (sequential? f)
       (flt f)
       [f])
     (when (sequential? r)
       (flt r)))))
