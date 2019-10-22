(ns converter.universal.tempo
  (:require
   #?(:clj [clojure.spec.alpha :as s] :cljs [cljs.spec.alpha :as s])
   [converter.spec :as spec]
   [spec-tools.data-spec :as std]))

(def tempo-spec
  (std/spec
   {:name ::tempo
    :spec {::inizio (s/double-in :min 0 :max 7200 :NaN? false :infinite? false) ; seconds
           ::bpm (s/double-in :min 0 :NaN? false :infinite? false)
           ::metro (s/spec #{"4/4"})
           ::battito (s/spec #{"1" "2" "3" "4"})}}))