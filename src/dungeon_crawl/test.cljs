(ns dungeon-crawl.test
  (:require  [debux.cs.core :refer-macros [clog dbg break]]
             [devtools.core :as devtools]
             [dungeon-crawl.helper :as helper]
             [cljs.test :refer-macros [deftest is testing run-tests]]))
(enable-console-print!)


(deftest test-neighbors
    (is (= true  (helper/is-neighbor? [10 10])))
  (is (nil?  (helper/is-neighbor? [10 10]  ))))

 (helper/sprite-neiborhood [10 10])

(run-tests 'dungeon-crawl.test)

