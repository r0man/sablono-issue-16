(ns issue-16.core
  (:require [om.core :as om :include-macros true]
            [sablono.core :as html :refer-macros [html]]))

(def app-state (atom {:auth true :text "Hello world!"}))

(defn root [P owner]
  (reify
    om/IRenderState
    (render-state [this state]
      (html
       (if-not (:auth P)
         [:div.not-here]
         [:div.jumbotron
          (:text P)])))))

(om/root app-state root (. js/document (getElementById "app")))
